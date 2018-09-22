package app.upc.com.appsafecity.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import app.upc.com.appsafecity.R;
import app.upc.com.appsafecity.models.Noticia;

public class NoticiasAdapter extends RecyclerView.Adapter<NoticiasAdapter.ViewHolder> {
    private Context context;
    private List<Noticia> noticias;

    public NoticiasAdapter(Context context, List<Noticia> noticias) {
        this.context = context;
        this.noticias = noticias;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_primer,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.Titulo.setText(noticias.get(position).getTitulo());
        holder.Contenido.setText(noticias.get(position).getContenido());
        holder.FechaPublicacion.setText(noticias.get(position).getFecha_publicacion());
        holder.Fuente.setText(noticias.get(position).getFuente());
        Glide.with(context).load(noticias.get(position).getFotos()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return noticias.size();
    }


    public class ViewHolder extends  RecyclerView.ViewHolder{

        public TextView Titulo, Contenido, FechaPublicacion, Fuente;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            Titulo = (TextView) itemView.findViewById(R.id.tv_titulo);
            Contenido = (TextView) itemView.findViewById(R.id.tv_contenido);
            FechaPublicacion = (TextView) itemView.findViewById(R.id.tv_fecha_publicacion);
            imageView = (ImageView) itemView.findViewById(R.id.foto_news);
            Fuente = (TextView) itemView.findViewById(R.id.tv_fuente);
        }


    }
}
