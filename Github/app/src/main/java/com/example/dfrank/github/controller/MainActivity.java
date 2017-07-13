package com.example.dfrank.github.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dfrank.github.R;
import com.example.dfrank.github.adapter.RepoAdapter;
import com.example.dfrank.github.api.Client;
import com.example.dfrank.github.api.Service;
import com.example.dfrank.github.model.Repo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    List<Repo> repos ;
    EditText editText;
    RecyclerView recyclerView;
    Button search;
    RepoAdapter repoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit_text);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        search = (Button) findViewById(R.id.search_button);
        repos = new ArrayList<>();
        if(savedInstanceState != null){
            repos  = savedInstanceState.getParcelableArrayList("repos");
        }
        repoAdapter = new RepoAdapter(getApplicationContext(), repos);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.scrollToPosition(0);
        recyclerView.setAdapter(repoAdapter);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editText.getText().toString();
                if (username.length()<2){
                    Toast.makeText(getApplicationContext(),"Form can't be empty", Toast.LENGTH_SHORT).show();
                }else {
                    loadJSON(username);
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        List<Repo> repos = this.repos;
        outState.putParcelableArrayList("repos",(ArrayList<Repo>)repos);
    }
    private void loadJSON(String username){
        Client client = new Client();
        Service service = client.getClient(username).create(Service.class);
        Call<List<Repo>> call = service.getAllRepos();
        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                if(response.body() instanceof List && response.body() != null) {
                    repos.clear();
                    repos.addAll(response.body());
                    repoAdapter.notifyDataSetChanged();
                }else{
                    Toast.makeText(getApplicationContext(),"User does not exist",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                Toast.makeText(getBaseContext(), "Please,check your internet connection", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
