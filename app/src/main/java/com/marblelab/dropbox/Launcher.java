package com.marblelab.dropbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Abid Hasan on 4/17/2017.
 */

public class Launcher extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Boolean IFR=getSharedPreferences("Preference",MODE_PRIVATE)
                .getBoolean("IFR",true);

        if (IFR){

            Intent intent=new Intent(this,IntroActivity.class);
            startActivity(intent);
            getSharedPreferences("Preference",MODE_PRIVATE)
                    .edit()
                    .putBoolean("IFR",false)
                    .commit();
        }
        else {
            Intent intent=new Intent(this,Main2Activity.class);
            startActivity(intent);
        }
    }
}
