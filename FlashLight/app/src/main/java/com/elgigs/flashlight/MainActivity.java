package com.elgigs.flashlight;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.security.Policy;

public class MainActivity extends AppCompatActivity {

    Context context;
    ImageButton btn;

    private Camera camera;
    private boolean isFlashOn;
    private boolean hasFlash;
    android.hardware.Camera.Parameters params;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (ImageButton)findViewById(R.id.btn);

        hasFlash = getApplicationContext().getPackageManager()
            .hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        if (!hasFlash){
            AlertDialog alert = new AlertDialog.Builder(MainActivity.this)
                    .create();
            alert.setTitle("ERROR");
            alert.setMessage("Sorry, your phone doesn't have Flashlight Hardware!");
            alert.setButton(DialogInterface.BUTTON_POSITIVE,"EXIT",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which){
                    finish();


                }
            });

            alert.show();
            return;

        }

        private void getCamera(){
            if (camera == null) {
                try {
                    camera = Camera.open();
                    params = camera.getParameters();
                } catch (RuntimeException e) {
                    Log.e("Camera Error. Failed to Open. Error:", e.getMessage());
                }
            }
        }

    }



}
