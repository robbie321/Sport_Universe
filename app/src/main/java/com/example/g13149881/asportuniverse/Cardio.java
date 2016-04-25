package com.example.g13149881.asportuniverse;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by g13155105 on 04/04/2016.
 */
public class Cardio extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardio_layout);

        Button play = (Button) findViewById(R.id.play_button);
        Button play2 = (Button) findViewById(R.id.play_button2);
        Button play3 = (Button) findViewById(R.id.play_button3);

        final VideoView videoView =(VideoView)findViewById(R.id.videoView);
        final VideoView videoView1 =(VideoView)findViewById(R.id.videoView2);
        final VideoView videoView2 =(VideoView)findViewById(R.id.videoView3);
        final MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        final Uri bikeVideo= Uri.parse("http://videocdn.bodybuilding.com/video/mp4/70000/71762m.mp4");
        final Uri treadmillVideo= Uri.parse("http://videocdn.bodybuilding.com/video/mp4/70000/71802m.mp4");
        final Uri rowingVideo= Uri.parse("http://videocdn.bodybuilding.com/video/mp4/70000/71862m.mp4");

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoView.setMediaController(mediaController);
                videoView.setVideoURI(bikeVideo);
                videoView.requestFocus();
                videoView.start();
            }
        });
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoView1.setMediaController(mediaController);
                videoView1.setVideoURI(treadmillVideo);
                videoView1.requestFocus();
                videoView1.start();
            }
        });
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoView2.setMediaController(mediaController);
                videoView2.setVideoURI(rowingVideo);
                videoView2.requestFocus();
                videoView2.start();
            }
        });

    }
}