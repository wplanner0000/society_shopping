package com.example.rusty.society_shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class booking_orders extends AppCompatActivity {
    Intent intent;
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_orders);

        Intent intent = getIntent();
        id = intent.getStringExtra("Society_id");



   }
   public void placeOrder(View v){
       intent = new Intent(this,placeorder.class);
       intent.putExtra("Society_id",id);
       startActivity(intent);
   }




}
