package com.nookdev.horizontalimagelist;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ViewHolder> {

    List<Bitmap> bitmaps;


    public ImageListAdapter(){
        fill_data();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv;
        ViewHolder(View itemView){
            super(itemView);
            iv = (ImageView)itemView.findViewById(R.id.image);
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int s = 0;
                }
            });
        }

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.iv.setImageBitmap(bitmaps.get(position));
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return bitmaps.size();
    }


    private void fill_data(){
        bitmaps = new ArrayList<Bitmap>();
        Resources res = Application.getContext().getResources();
        Bitmap bitmap = (Bitmap) BitmapFactory.decodeResource(res,R.mipmap.ic_launcher);
        for (int i=0;i<20;i++){
            this.bitmaps.add(bitmap);
        }
    }
}
