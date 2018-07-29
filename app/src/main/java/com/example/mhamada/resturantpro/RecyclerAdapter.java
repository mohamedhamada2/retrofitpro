package com.example.mhamada.resturantpro;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by M.Hamada on 26/07/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder> {

    List<Product>products;
    Context context;
    RecyclerAdapter(List<Product>products,Context context){
        this.products=products;
        this.context=context;
    }

    @Override
    public MyHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.rowitems,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder( MyHolder holder, int position) {
     holder.name.setText(products.get(position).getName());
     holder.price.setText("price:"+Integer.toString(products.get(position).getPrice()));
        Picasso.get().load(products.get(position).getImage_path()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name,price;
        public MyHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img);
            name=itemView.findViewById(R.id.item_name);
            price=itemView.findViewById(R.id.item_price);
        }
    }
}
