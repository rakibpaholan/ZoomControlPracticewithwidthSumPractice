package com.example.zoomcontrolbuttonpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    private ImageView imageId;
    private ZoomControls zoomControls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageId = (ImageView)findViewById(R.id.imageId);
        zoomControls = (ZoomControls)findViewById(R.id.zoomControlId);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float zoomInX = imageId.getScaleX();
                float zoomInY = imageId.getScaleY();

                if (zoomInX < 4 && zoomInY < 4){

                   imageId.setScaleX((float) zoomInX+1);
                   imageId.setScaleY((float) zoomInY+1);
                }else {
                    Toast.makeText(MainActivity.this,"Done",Toast.LENGTH_SHORT).show();
                }
            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float zoomOutX = imageId.getScaleX();
                float zoomOutY = imageId.getScaleY();

                if (zoomOutX > 1 && zoomOutY > 1){
                    imageId.setScaleX((float) zoomOutX-1);
                    imageId.setScaleY((float) zoomOutY-1);
                }else {
                    Toast.makeText(MainActivity.this,"Done",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}