package com.example.mhamada.resturantpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListActivity extends AppCompatActivity {
   RecyclerView recyclerView;
   RecyclerView.LayoutManager layoutManager;
   RecyclerAdapter recyclerAdapter;
   List<Product>products;
   ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        recyclerView=findViewById(R.id.recycler1);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        if(getIntent().getExtras()!=null){
            String type =getIntent().getExtras().getString("type");
            fetchinformation(type);
        }
    }

    public void fetchinformation(String type) {
     apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<Product>>call=apiInterface.getallpricesInfo(type);
        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
             products=response.body();
             recyclerAdapter=new RecyclerAdapter(products,ListActivity.this);
             recyclerView.setAdapter(recyclerAdapter);

            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {

            }
        });
    }
}
