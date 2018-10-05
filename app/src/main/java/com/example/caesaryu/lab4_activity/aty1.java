package com.example.caesaryu.lab4_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aty1 extends AppCompatActivity {
    private static final int REQ_A=0;
    private static final int RESULT_B=101;
    String drinkS;
    String sugarS;
    String iceS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);

        Button btn_order=findViewById(R.id.btn_order);


        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(aty1.this,aty2.class);
                startActivityForResult(intent,REQ_A);
            }
        });//on click
    }//OnCreateDone

    @Override
    protected void onActivityResult(int codeA,int codeB,Intent data){
        super.onActivityResult(codeA,codeB,data);



        TextView drink=findViewById(R.id.drink);
        TextView sugar=findViewById(R.id.sugar);
        TextView ice=findViewById(R.id.ice);


        if(codeB==RESULT_B){
            if (codeA==REQ_A){

                Bundle bundle=data.getExtras();
                //bundle=data.getBundleExtra("bundleName");

                drinkS=bundle.getString("NAME");
                sugarS=bundle.getString("SUGARS");
                iceS=bundle.getString("ICES");
                drink.setText(drinkS);
                sugar.setText(sugarS);
                ice.setText(iceS);
            }
        }

    }

}//Done
