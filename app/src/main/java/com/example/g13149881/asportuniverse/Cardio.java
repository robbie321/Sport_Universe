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

        final VideoView videoView =(VideoView)findViewById(R.id.videoView);
        final MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        final Uri uri= Uri.parse("http://videocdn.bodybuilding.com/video/mp4/70000/71762m.mp4");

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();
            }
        });

    }
}