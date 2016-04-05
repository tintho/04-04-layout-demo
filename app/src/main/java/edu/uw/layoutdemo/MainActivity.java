package edu.uw.layoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "LAYOUT_DEMO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.picture);
        //image.setImageResource(R.drawable.android_maneki);

        //LayoutInflater inflator = getLayoutInflater();
        //inflator.inflate(R.layout.image_content, R.id.theLinearLayout)

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewStub stub = (ViewStub)findViewById(R.id.stub);
                if (stub != null) {
                    stub.inflate();
                }
            }
        });
    }
}
