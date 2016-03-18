package br.com.app.videoaulasandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaDeAulasActivity extends AppCompatActivity {

    private ListView listaDeVideos;
    private Video video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_aulas);

        video = new Video();

        CustomListAdapter adapter = new CustomListAdapter(this, video.getTitleVideo(), video.getImagem(), video.getDuration(), video.getSubTitle());
        listaDeVideos = (ListView) findViewById(R.id.list);
        listaDeVideos.setAdapter(adapter);

        listaDeVideos.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListaDeAulasActivity.this, AulasActivity.class);
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

}
