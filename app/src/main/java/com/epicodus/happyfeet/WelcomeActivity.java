package com.epicodus.happyfeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.womanImageButton) ImageButton mWomanImageButton;
    @Bind(R.id.womanListView) ListView mWomanListView;

    @Bind(R.id.manImageButton) ImageButton mManImageButton;
    @Bind(R.id.saleResult) TextView mSaleResult;
    @Bind(R.id.saleSwitch) Switch mSaleSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ButterKnife.bind(this);

        mWomanImageButton.setOnClickListener(this);
        mManImageButton.setOnClickListener(this);



        //set the switch to ON
        mSaleSwitch.setChecked(true);
        //attach a listener to check for changes in state
        mSaleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    mSaleResult.setText("Switch is currently ON");
                } else {
                    mSaleResult.setText("Switch is currently OFF");
                }
            }
        });


    }

    @Override
    public void onClick(View v) {
        if(v == mWomanImageButton) {
            String[] category = {"shoes", "purses", "make up", "clearance"};
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, category);
            mWomanListView.setAdapter(adapter);
        }else if(v == mManImageButton) {
            String[] category = {"bags", "suits", "shoes", "clearance"};
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, category);
            mWomanListView.setAdapter(adapter);
        }

    }

}
