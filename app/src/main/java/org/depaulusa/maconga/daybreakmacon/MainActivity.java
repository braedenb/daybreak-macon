package org.depaulusa.maconga.daybreakmacon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(" ");
    }

    public void onEnterBtnClick(View v){
        Intent servicesPageIntent = new Intent(v.getContext(), ServicesPage.class);
        startActivity(servicesPageIntent);
    }

    public void onAboutUsBtnClick(View v){
        Intent aboutUsIntent = new Intent(v.getContext(), AboutUs.class);
        startActivity(aboutUsIntent);
    }

}
