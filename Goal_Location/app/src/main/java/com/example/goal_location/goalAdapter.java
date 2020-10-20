package com.example.goal_location;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class goalAdapter extends RecyclerView.Adapter {

    ArrayList<Goal> gArray;
    Context context;

    public goalAdapter(ArrayList<Goal> gArray, Context context) {
        this.gArray = gArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_goal2,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).imeg.setImageResource(gArray.get(position).getImeg());
        ((ViewHolder)holder).name.setText(gArray.get(position).getName());
        ((ViewHolder)holder).location.setText(gArray.get(position).getLocation());
        ((ViewHolder)holder).price.setText(gArray.get(position).getPrice()+"");
        ((ViewHolder)holder).phone.setText(gArray.get(position).getPhone()+"");


    }

    @Override
    public int getItemCount() {
        return gArray.size();
    }





    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imeg ;
        public TextView name ;
        public TextView location ;
        public TextView price ;
        public TextView phone ;
        public View view ;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView ;
            imeg = itemView.findViewById(R.id.imageView2);
            name = itemView.findViewById(R.id.textView3);
            location = itemView.findViewById(R.id.textView5);
            price = itemView.findViewById(R.id.textView7);
            phone = itemView.findViewById(R.id.textView8);

        }
    }

}
