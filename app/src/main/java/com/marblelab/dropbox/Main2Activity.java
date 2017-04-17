package com.marblelab.dropbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class Main2Activity extends AwesomeSplash {

    public void initSplash(ConfigSplash configSplash) {
        configSplash.setBackgroundColor(R.color.colorPrimaryDark); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(1000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_TOP); //or Flags.REVEAL_TOP

        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

        //Customize Logo
        configSplash.setOriginalHeight(1500);
        configSplash.setOriginalWidth(1500);
        configSplash.setLogoSplash(R.drawable.ref); //or any other drawable
        configSplash.setAnimLogoSplashDuration(1000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.FadeIn);



        //Customize Title
        configSplash.setTitleSplash("Fridge & Light");
        configSplash.setTitleTextColor(R.color.icons);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(500);
        configSplash.setAnimTitleTechnique(Techniques.BounceInDown);
        configSplash.setTitleFont("fonts/Raleway-ExtraLight.ttf");

    }

    @Override
    public void animationsFinished() {

        Intent intent=new Intent(getApplicationContext(),DBRoulette.class);
        startActivity(intent);
    }


}
