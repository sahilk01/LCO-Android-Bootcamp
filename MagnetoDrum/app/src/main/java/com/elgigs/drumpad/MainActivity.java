package com.elgigs.drumpad;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private int s1,s2,s3,s4,s5,s6,s7,s8;
    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideNavigationBar();
//        m1=MediaPlayer.create(MainActivity.this,R.raw.one);
//        m2=MediaPlayer.create(this,R.raw.two);
//        m3=MediaPlayer.create(this,R.raw.three);
//        m4=MediaPlayer.create(this,R.raw.four);
//        m5=MediaPlayer.create(this,R.raw.fv);
//        m6=MediaPlayer.create(this,R.raw.sixth);
//        m7=MediaPlayer.create(this,R.raw.seventh);
//        m8=MediaPlayer.create(this,R.raw.eighth);

// soundpool start from here
//        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.


//

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(8)
                    .setAudioAttributes(audioAttributes)
                    .build();

        }
        else {
            soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        }

        s1 = soundPool.load(this, R.raw.one, 1);
        s2 = soundPool.load(this, R.raw.two, 1);
        s3 = soundPool.load(this, R.raw.three, 1);
        s4 = soundPool.load(this, R.raw.four, 1);
        s5 = soundPool.load(this, R.raw.fv, 1);
        s6 = soundPool.load(this, R.raw.sixth, 1);
        s7 = soundPool.load(this, R.raw.seventh, 1);
        s8 = soundPool.load(this, R.raw.eighth, 1);
    }
        private void hideNavigationBar() {

            this.getWindow().getDecorView()
                .setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );


        }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        hideNavigationBar();
    }

    public void b1(View v){
//    m1.start();
        soundPool.play(s1, 1, 1, 0, 0, 1);
    }
    public void b2(View v){
//        m2.start();
        soundPool.play(s2, 1, 1, 0, 0, 1);
    }

    public void b3(View view){
//        m3.start();
        soundPool.play(s3, 1, 1, 0, 0, 1);
    }

    public void b4(View v){
//        m4.start();

        soundPool.play(s4, 1, 1, 0, 0, 1);
    }

    public void b5(View v){
//        m5.start();
        soundPool.play(s5, 1, 1, 0, 0, 1);
    }

    public void b6(View v){
//        m6.start();
        soundPool.play(s6, 1, 1, 0, 0, 1);
    }

    public void b7(View v){
//        m7.start();
        soundPool.play(s7, 1, 1, 0, 0, 1);
    }

    public void b8(View v){
//        m8.start();
        soundPool.play(s8, 1, 1, 0, 0, 1);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        System.exit(0);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }
}
