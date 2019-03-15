package com.example.practice.practice2;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.media.AudioManager.STREAM_MUSIC;

public class MainActivity extends AppCompatActivity {

    SoundPool mSoundpool;
    int mSoundA,mSoundB,mSoundC,mSoundD,mSoundE,mSoundF,mSoundG,mSoundH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundpool =new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        mSoundA= mSoundpool.load(getApplicationContext(),R.raw.first,1);
        mSoundB= mSoundpool.load(getApplicationContext(),R.raw.second,1);
        mSoundC= mSoundpool.load(getApplicationContext(),R.raw.third,1);
        mSoundD= mSoundpool.load(getApplicationContext(),R.raw.four,1);
        mSoundE= mSoundpool.load(getApplicationContext(),R.raw.fifth,1);
        mSoundF= mSoundpool.load(getApplicationContext(),R.raw.sixth,1);
        mSoundG= mSoundpool.load(getApplicationContext(),R.raw.seven,1);
        mSoundH= mSoundpool.load(getApplicationContext(),R.raw.eighth,1);
    }
    public void buttonA(View v){
        mSoundpool.play(mSoundA,1.0f,1.0f,0,0,1.0f);
    }
    public void buttonB(View v){
        mSoundpool.play(mSoundB,1.0f,1.0f,0,0,1.0f);
    }
    public void buttonC(View v){
        mSoundpool.play(mSoundC,1.0f,1.0f,0,0,1.0f);
    }
    public void buttonD(View v){
        mSoundpool.play(mSoundD,1.0f,1.0f,0,0,1.0f);
    }
    public void buttonE(View v){
        mSoundpool.play(mSoundE,1.0f,1.0f,0,0,1.0f);
    }
    public void buttonF(View v){
        mSoundpool.play(mSoundF,1.0f,1.0f,0,0,1.0f);
    }public void buttonG(View v){
        mSoundpool.play(mSoundG,1.0f,1.0f,0,0,1.0f);
    }public void buttonH(View v){
        mSoundpool.play(mSoundH,1.0f,1.0f,0,0,1.0f);
    }



}
