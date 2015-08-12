package com.nookdev.horizontalimagelist;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;


public class ImageListAdapter extends RecyclerView.Adapter {

    List<Bitmap> bitmaps;
    Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv;
        ViewHolder(View itemView){
            super(itemView);
            iv = (ImageView)itemView.findViewById(R.id.image);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    private void fill_data(){
        for (int i=0;i<20;i++){

        }
    }
}
