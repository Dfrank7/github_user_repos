package com.example.dfrank.github.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dfrank.github.R;
import com.example.dfrank.github.model.Repo;

import java.util.List;

/**
 * Created by dfrank on 6/23/17.
 */

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.RepoAdapterViewholder> {
    Context context;
    List<Repo> repos;

    public RepoAdapter(Context context, List<Repo> repoList){
        this.context = context;
        repos = repoList;
    }

    @Override
    public RepoAdapter.RepoAdapterViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater =  LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row,parent,false);
        return new RepoAdapterViewholder(view);
    }

    @Override
    public void onBindViewHolder(RepoAdapter.RepoAdapterViewholder holder, int position) {
        holder.name.setText(repos.get(position).getName().toString());
        holder.language.setText("Language "+repos.get(position).getLanguage());
        holder.forks.setText("Forks: "+repos.get(position).getFork());
        holder.link.setText(repos.get(position).getUrl());
    }
    @Override
    public int getItemCount() {
        return repos.size();
    }

    public class RepoAdapterViewholder extends RecyclerView.ViewHolder {
        TextView name, link;
        TextView language, forks;
        public RepoAdapterViewholder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.repo);
            language = (TextView) itemView.findViewById(R.id.language);
            forks = (TextView) itemView.findViewById(R.id.forks);
            link = (TextView) itemView.findViewById(R.id.link);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if(position!=RecyclerView.NO_POSITION){
                        Linkify.addLinks(link, Linkify.WEB_URLS);
                    }
                }
            });
        }
    }
}

