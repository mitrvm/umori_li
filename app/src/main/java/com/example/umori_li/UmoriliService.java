package com.example.umori_li;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface UmoriliService {

    @GET("api/get")
    Call<List<UPost>> getData(@Query("name") String resourceName, @Query("num") int count);

    Retrofit retrofit = new Retrofit.Builder()

            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}