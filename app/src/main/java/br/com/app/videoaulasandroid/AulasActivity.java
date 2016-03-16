package br.com.app.videoaulasandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class AulasActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private static final String API_KEY = "AIzaSyBlRhortS7E_u35wSOc17O4_wCDsfdCs4Q";
    private String ID_VIDEO = "MM4ShEnKw3A";
    private YouTubePlayerView youTubePlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aulas);

        youTubePlayer = (YouTubePlayerView) findViewById(R.id.id_youtube_video);
        youTubePlayer.initialize(API_KEY, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean loadAgain) {
        if (!loadAgain){
            youTubePlayer.cueVideo(ID_VIDEO);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "onInitializationFailure()", Toast.LENGTH_SHORT).show();
    }
}
