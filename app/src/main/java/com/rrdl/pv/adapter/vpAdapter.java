package com.rrdl.pv.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rrdl.pv.R;
import com.rrdl.pv.model.Item;

import java.util.List;

/**
 * Created by Acer ASPIRE on 19/03/2018.
 */

public class vpAdapter extends RecyclerView.Adapter<vpAdapter.vpHolder> {

    List<Item> item_list;
    Context context;


    public class vpHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView price;
        ImageView image;
        public vpHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.model);
            price = itemView.findViewById(R.id.price);
            image = itemView.findViewById(R.id.image);
        }
    }
    public vpAdapter(Context context,List<Item> item_list){
        this.context = context;
        this.item_list = item_list;
    }


    @NonNull
    @Override
    public vpHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pv_element,parent);
        return new vpHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull vpHolder holder, int position) {
        Item i = item_list.get(position);
        holder.name.setText(i.getName());
        holder.price.setText(""+i.getPrice());
        Glide.with(context).load(i.getUrlim()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return item_list.size();
    }
}
