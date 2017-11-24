package com.whyles.explore.intentsamples.commonintent;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.whyles.explore.intentsamples.R;

public class CameraActivity extends AppCompatActivity {

    private Button btnCapturePicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        init();
    }

    private void init(){
        btnCapturePicture = findViewById(R.id.btn_capture_picture);
        btnCapturePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capturePhoto("");
            }
        });
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;
//    static final Uri mLocationForPhotos;

    private void capturePhoto(String targetFilename) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT,
//                Uri.withAppendedPath(mLocationForPhotos, targetFilename));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
        }
    }

    private void captureVideo(String targetFilename) {
        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT,
//                Uri.withAppendedPath(mLocationForPhotos, targetFilename));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
        }
    }
}
