package com.example.mhamada.resturantpro;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by M.Hamada on 26/07/2018.
 */

public class ApiClient {
    public static final String Base_url="http://192.168.1.9/Resturantapp/";
    public static Retrofit retrofit=null;
    public static Retrofit getApiClient(){
        if(retrofit==null){
            retrofit =new Retrofit.Builder().baseUrl(Base_url).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }
}
