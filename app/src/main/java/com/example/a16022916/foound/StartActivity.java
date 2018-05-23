package com.example.a16022916.foound;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {


    Button btnLaw;
    Button btnBusiness;
    ImageView ivImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // Set width of the layout according to the phone
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int desiredWidth = width / 100 * 90;

        View layout_main = findViewById(R.id.layout);
        ViewGroup.LayoutParams params = layout_main.getLayoutParams();
        params.width = desiredWidth;
        layout_main.setLayoutParams(params);


        btnLaw = findViewById(R.id.startButtonLaw);
        btnBusiness = findViewById(R.id.startButtonBusiness);

        btnLaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(StartActivity.this);
                SharedPreferences.Editor editor = pref.edit();

                editor.putString("sharedPrefWorkType","Law");
                editor.apply();

//                Intent intent = new Intent(getBaseContext(), newActivity().class);
//                intent.putExtra("workType","Law");
//                startActivity(intent);
            }
        });

        btnBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(StartActivity.this);
                SharedPreferences.Editor editor = pref.edit();

                editor.putString("sharedPrefWorkType","Business");
                editor.apply();

//                Intent intent = new Intent(getBaseContext(), newActivity().class);
//                intent.putExtra("workType","Business");
//                startActivity(intent);
            }
        });
    }

    @Override
    public void onResume(){
        super.onResume();

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(StartActivity.this);

//        Intent intent = new Intent(getBaseContext(), newActivity.class);

        if(pref.contains("sharedPrefWorkType")) {
            String name = pref.getString("sharedPrefWorkType","");
//            intent.putExtra("workType","Business");
//            startActivity(intent);
        }
    }
}
