package com.marblelab.dropbox;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.marblelab.dropbox.R;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.MessageButtonBehaviour;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import agency.tango.materialintroscreen.animations.IViewTranslation;

public class IntroActivity extends MaterialIntroActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableLastSlideAlphaExitTransition(true);

        getBackButtonTranslationWrapper()
                .setEnterTranslation(new IViewTranslation() {
                    @Override
                    public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
                        view.setAlpha(percentage);
                    }
                });

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.colorAccent)
                        .buttonsColor(R.color.colorPrimary)
                        .image(R.drawable.fridge)
                        .title("Fridge & Light")
                        .description("\nWelcome To Fridge & Light a Smart Solution To Organize Your Shopping Life By Providing you With Instant Access To Your Groceries  ")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage("Go To Next Slide");
                    }
                }, "Lets Start..."));

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorPrimaryDark)
                .buttonsColor(R.color.divider)
                .title("Connect")
                .image(R.drawable.connect)
                .description("\nIf The Green Button Above Is Crossed Then Press and Confirm To Connect With The Account OR Else You Are Already Connected")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorPrimaryDark)
                .buttonsColor(R.color.colorPrimary)
                .title("Refresh")
                .image(R.drawable.refresh)
                .description("\nRefresh Your Content and Get The Latest Update of Your Fridge by Swiping Down From Up")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorPrimaryLight)
                .buttonsColor(R.color.colorAccent)
                .image(R.drawable.counter)
                .title("Loading Counter")
                .description("\nWait Until The Counter To Finish That You Find Top of Your Image Box Counter Provides The Remaining Time Left To Finish The Task From ")
                .build());

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorPrimary)
                .buttonsColor(R.color.colorAccent)
                .image(R.drawable.smile)
                .title("That's it")
                .description("\nYou Are Now Ready! Lets Start...")
                .build());
    }

    @Override
    public void onFinish() {
        super.onFinish();
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);
    }
}