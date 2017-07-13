package com.example.dfrank.github.api;

import com.example.dfrank.github.model.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dfrank on 6/23/17.
 */

public interface Service {
    String API_KEY = "";
    @GET("repos?api_key="+API_KEY)
    Call<List<Repo>> getAllRepos();
}
