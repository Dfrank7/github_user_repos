package com.example.dfrank.github.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dfrank on 6/23/17.
 */

public class Client {
    Retrofit retrofit = null;
    public static String base_url ="https://api.github.com/users/";
    public Retrofit getClient(String name){
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(base_url+name+"/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
