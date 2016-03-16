package br.com.app.videoaulasandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ListaDeAulasActivity extends AppCompatActivity {

    ListView listaDeVideos;

    String[] title ={
            "Aula 1",
            "Aula 2",
            "Aula 3",
            "Aula 4",
            "Aula 5"
    };

    String[] subTitle ={
            "descrição 1",
            "descrição 2",
            "descrição 3",
            "descrição 4",
            "descrição 5"
    };

    String[] duration ={
            "duracao 1",
            "duracao 2",
            "duracao 3",
            "duracao 4",
            "duracao 5"
    };

    Integer[] imagem={
            R.drawable.icon_video,
            R.drawable.icon_video,
            R.drawable.icon_video,
            R.drawable.icon_video,
            R.drawable.icon_video,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_aulas);

        CustomListAdapter adapter = new CustomListAdapter(this, title, imagem, duration, subTitle);
        listaDeVideos = (ListView) findViewById(R.id.list);
        listaDeVideos.setAdapter(adapter);

        listaDeVideos.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
                switch (position){
                    case 0:
                        i = new Intent(ListaDeAulasActivity.this, AulasActivity.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(ListaDeAulasActivity.this, AulasActivity.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(ListaDeAulasActivity.this, AulasActivity.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(ListaDeAulasActivity.this, AulasActivity.class);
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(ListaDeAulasActivity.this, AulasActivity.class);
                        startActivity(i);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
