package br.com.app.videoaulasandroid;

/**
 * Created by Billy on 14/03/2016.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] title;
    private final String[] subTitle;
    private final Integer[] imagem;
    private final String[] durationId;

    public CustomListAdapter(Activity context, String[] title, Integer[] imagem, String[] durationId, String[] subTitle) {
        super(context, R.layout.lista_mobile, title);

        this.context=context;
        this.title=title;
        this.imagem=imagem;
        this.durationId = durationId;
        this.subTitle = subTitle;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.lista_mobile, null, true);

        TextView titleTextView = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView  subTitleTextView= (TextView) rowView.findViewById(R.id.subtitle);
        TextView durationTextView = (TextView) rowView.findViewById(R.id.duration);

        titleTextView.setText(title[position]);
        imageView.setImageResource(imagem[position]);
        subTitleTextView.setText("Descrição " + subTitle[position]);
        durationTextView.setText(durationId[position]);

        return rowView;

    };
}
