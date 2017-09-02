package com.shreyanshvit.internship.Fragment.videos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.shreyanshvit.internship.R;

import java.security.Provider;

public class youtube_video extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{

    public static final String API_KEY = "AIzaSyAyMb9fmkoNWiCjRJfCBgmspp2KyuOykUk";
    String VIDEO_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_video);
        String title = getIntent().getStringExtra("text");

        setVideo(title);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY, this);
    }

    private void setVideo(String title) {
        switch (title){

            case "Introduction":
                VIDEO_ID = "0isrdp5meyQ";
                break;

            case "Hello world":
                VIDEO_ID = "3C-e4dTvrSI";
                break;

            case "Android Studio 3":
                VIDEO_ID = "glX5Yx63_Vs";
                break;
            case "Class & objects":
                VIDEO_ID = "NpveMP5869U";
                break;

            case "Var & val":
                VIDEO_ID = "4YF_DUMQqFA";
                break;

            case "Kotlin Java Together":
                VIDEO_ID = "e-gZc-mZqE8";
                break;

            case "Convert java kotlin":
                VIDEO_ID = "YuRjPUxvcek";
                break;
            case "Decompile Bytecode":
                VIDEO_ID = "8TW9zbgQnKc";
                break;
            case "Operators":
                VIDEO_ID = "q_XZWtP6KQg";
                break;

            case "String Template":
                VIDEO_ID = "9XmGh4WgfSg";
                break;

            case "If else expression":
                VIDEO_ID = "qaqKps5mNts";
                break;

            case "String Comperision":
                VIDEO_ID = "Fh4chRUL5kE";
                break;
        }

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);

        if(!wasRestored){
            player.cueVideo(VIDEO_ID);
        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "fail", Toast.LENGTH_LONG).show();
    }

    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onPlaying() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {

        }
    };

    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String s) {

        }

        @Override
        public void onAdStarted() {

        }

        @Override
        public void onVideoStarted() {

        }

        @Override
        public void onVideoEnded() {

        }

        @Override
        public void onError(YouTubePlayer.ErrorReason errorReason) {

        }
    };


}
