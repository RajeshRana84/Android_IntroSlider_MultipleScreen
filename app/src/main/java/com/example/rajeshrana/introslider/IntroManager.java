package com.example.rajeshrana.introslider;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.text.DateFormat;

/**
 * Created by rajesh.rana on 29-05-2017.
 */

public class IntroManager {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;


    public IntroManager(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences("first",0);
        editor = sharedPreferences.edit();
    }

// Check if the app is used first time or not
    public void setFirst(Boolean isFirst){

        editor.putBoolean("check",isFirst);
        editor.commit();
    }

    public boolean Check(){
      return sharedPreferences.getBoolean("check",true);
    }
}
