package com.example.mhamada.resturantpro;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by M.Hamada on 26/07/2018.
 */

public interface ApiInterface {
@GET("getprice.php")
Call<List<Product>>getallpricesInfo(@Query("item_type") String item_type);
}
