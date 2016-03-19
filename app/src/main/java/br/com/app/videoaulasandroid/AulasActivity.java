package br.com.app.videoaulasandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class AulasActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private static final String API_KEY = "AIzaSyBlRhortS7E_u35wSOc17O4_wCDsfdCs4Q";

    private YouTubePlayerView youTubePlayer;

    private Intent intent;
    private Bundle params;

    private Video video;
    private ListView listaDeVideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aulas);

        intent = getIntent();
        params = intent.getExtras();

        String titleVideo = params.getString("TITLE");
        String subTitleVideo = params.getString("SUB_TITLE");

        TextView textViewTitle =  (TextView)findViewById(R.id.id_textview_title);
        textViewTitle.setText(titleVideo);

        TextView textViewSubTitle =  (TextView)findViewById(R.id.id_textview_subtitle);
        textViewSubTitle.setText(subTitleVideo);

        youTubePlayer = (YouTubePlayerView) findViewById(R.id.id_youtube_video);
        youTubePlayer.initialize(API_KEY, this);

        video = new Video();

        CustomListAdapter adapter = new CustomListAdapter(this, video.getTitleVideo(), video.getImagem(), video.getDuration(), video.getSubTitle());
        listaDeVideos = (ListView) findViewById(R.id.list_aulas);
        listaDeVideos.setAdapter(adapter);

        listaDeVideos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(AulasActivity.this, AulasActivity.class);
                Bundle params = new Bundle();
                switch (position){
                    case 0:
                        params.putString("ID_VIDEO", "stmPydPcDAQ");
                        params.putString("IMG", "http://img.youtube.com/vi/stmPydPcDAQ/0.jpg");
                        params.putString("TITLE", video.getTitleVideo()[position]);
                        params.putString("SUB_TITLE", video.getSubTitle()[position]);
                        i.putExtras(params);
                        startActivity(i);
                        break;
                    case 1:
                        params.putString("ID_VIDEO", "oBHrtUrq9p0");
                        params.putString("IMG", "http://img.youtube.com/vi/oBHrtUrq9p0/0.jpg");
                        params.putString("TITLE", video.getTitleVideo()[position]);
                        params.putString("SUB_TITLE", video.getSubTitle()[position]);
                        i.putExtras(params);
                        startActivity(i);
                        break;
                    case 2:
                        params.putString("ID_VIDEO", "MKHffejfugQ");
                        params.putString("IMG", "http://img.youtube.com/vi/MKHffejfugQ/0.jpg");
                        params.putString("TITLE", video.getTitleVideo()[position]);
                        params.putString("SUB_TITLE", video.getSubTitle()[position]);
                        i.putExtras(params);
                        startActivity(i);
                        break;
                    case 3:
                        params.putString("ID_VIDEO", "CBLDvBLoE6w");
                        params.putString("IMG", "http://img.youtube.com/vi/CBLDvBLoE6w/0.jpg");
                        params.putString("TITLE", video.getTitleVideo()[position]);
                        params.putString("SUB_TITLE", video.getSubTitle()[position]);
                        i.putExtras(params);
                        startActivity(i);
                        break;
                    case 4:
                        params.putString("ID_VIDEO", "thC3dezbKXs");
                        params.putString("IMG", "http://img.youtube.com/vi/thC3dezbKXs/0.jpg");
                        params.putString("TITLE", video.getTitleVideo()[position]);
                        params.putString("SUB_TITLE", video.getSubTitle()[position]);
                        i.putExtras(params);
                        startActivity(i);
                        break;
                    default:
                        break;
                }
            }
        });

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean loadAgain) {
        if (!loadAgain){
            String ID_VIDEO = params.getString("ID_VIDEO");
            youTubePlayer.cueVideo(ID_VIDEO);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "onInitializationFailure()", Toast.LENGTH_SHORT).show();
    }
}
