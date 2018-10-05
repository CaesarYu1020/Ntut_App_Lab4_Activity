package com.example.caesaryu.lab4_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class aty2 extends AppCompatActivity {
    private static final int RESULT_B=101;
    String sugarS="無糖";
    String iceS="微冰";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        final EditText drink_name=findViewById(R.id.drink_name);
        RadioGroup rgI=findViewById(R.id.rg_ice);
        RadioGroup rgS=findViewById(R.id.rg_sugar);
        Button btn_finish=findViewById(R.id.btn_finish);
        rgI.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ice0:
                        iceS = "微冰";
                        break;
                    case R.id.ice1:
                        iceS = "少冰";
                        break;
                    case R.id.ice2:
                        iceS = "正常冰";
                        break;
                }
            }
        });//rgI check

        rgS.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                 case R.id.sugar0:
                    break;
                 case R.id.sugar1:
                  sugarS="少糖";
                  break;
                 case R.id.sugar2:
                 sugarS="半糖";
                 break;
                 case R.id.sugar3:
                  sugarS="全糖";
                    break;}
            }
        });//rgS check

        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String name=drink_name.getText().toString();
            Intent intent=new Intent();
            Bundle bundle=new Bundle();

            bundle.putString("SUGARS",sugarS);
            bundle.putString("ICES",iceS);
            bundle.putString("NAME",name);
            intent.putExtras(bundle);
            //intent.putExtra("bundleName",bundle);
            setResult(RESULT_B,intent);
            finish();

            }
        });//click

    }//create

}//done
