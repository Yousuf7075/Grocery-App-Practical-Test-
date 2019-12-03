package com.example.groceryapp.retrofit_client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    final static String BASE_URL = "http://www.meenaclick.com/";
    public static Retrofit getClient(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
