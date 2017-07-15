package com.example.naresh.myreddit;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by NARESH on 15-07-17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<list_item> listitems;
    private Context context;

    public MyAdapter(List<list_item> listitems, Context context) {
        this.listitems = listitems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        list_item listit = listitems.get(position);

        holder.desc.setText(listit.getDesc());
        holder.comments.setText(listit.getNo_comments()+" comments");
        Picasso.with(context).load(listit.getImgurl()).into(holder.img);

    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView desc;
        public TextView comments;

        public ViewHolder(View itemView) {
            super(itemView);

            img = (ImageView)itemView.findViewById(R.id.img);
            desc = (TextView)itemView.findViewById(R.id.desc);
            comments = (TextView)itemView.findViewById(R.id.numcomment);

        }
    }
}
