package org.depaulusa.maconga.daybreakmacon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ServicesPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_page);
    }

    public void onMedicalServicesBtnClick (View v){
        Intent medicalServicesIntent = new Intent(v.getContext(), MedicalServices.class);
        startActivity(medicalServicesIntent);
    }


    public void onFoodServicesBtnClick (View v){
        Intent foodServicesIntent = new Intent(v.getContext(), FoodServices.class);
        startActivity(foodServicesIntent);
    }

    public void onClothingServicesBtnClick (View v){
        Intent clothingServicesIntent = new Intent(v.getContext(), ClothingServices.class);
        startActivity(clothingServicesIntent);
    }

    public void onLaundryAndShowersBtnClick (View v){
        Intent laundryAndShowersIntent = new Intent(v.getContext(), LaundryAndShowers.class);
        startActivity(laundryAndShowersIntent);
    }

    public void onOtherServicesClick (View v){
        Intent otherServicesIntent = new Intent(v.getContext(), OtherServices.class);
        startActivity(otherServicesIntent);
    }

}
