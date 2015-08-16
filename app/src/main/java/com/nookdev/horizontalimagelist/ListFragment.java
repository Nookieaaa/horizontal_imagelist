package com.nookdev.horizontalimagelist;


import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ListFragment extends Fragment implements MainImagePassing{
    public static String FRAGMENT_TAG = "IMAGELIST_FRAGMENT";
    MainActivity mainActivity;
    RecyclerView recyclerView;
    LinearLayoutManager llm;
    ImageView mainImage;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mainActivity = (MainActivity) activity;
        }
        catch (ClassCastException e){
            e.printStackTrace();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.gallery_view,container);
        llm = new LinearLayoutManager(mainActivity,LinearLayoutManager.HORIZONTAL,false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_imagelist);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(new ImageListAdapter());

        mainImage = (ImageView)rootView.findViewById(R.id.gallery_main_image);



        return rootView;
    }

    public void updateImage(Bitmap bitmap) {
        mainImage.setImageBitmap(bitmap);
    }


    @Nullable
    @Override
    public View getView() {
        return super.getView();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }
}

interface MainImagePassing{
    void updateImage(Bitmap bitmap);
};