package com.nookdev.horizontalimagelist;


import android.content.Context;

public class ContextHolder {
    private static ContextHolder ourInstance = new ContextHolder();
    private static Context context;

    public static ContextHolder getInstance() {
        return ourInstance;
    }

    private ContextHolder() {
        context = null;
    }

    public static void init(Context _context){
        context = _context;
    }

    public Context getApplicationContext(){
        return context;
    }
}
