package com.nookdev.horizontalimagelist;

import android.content.Context;

public class Application extends android.app.Application {

    protected static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext(){
        return mContext;
    }
}
