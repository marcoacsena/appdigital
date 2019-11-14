package br.com.marcoapps.appdigital.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.marcoapps.appdigital.R;
import br.com.marcoapps.appdigital.model.Mensagem;

public class AdapterMensagem extends RecyclerView.Adapter<AdapterMensagem.MyViewHolder> {

    private LayoutInflater inflater;
    private List<Mensagem> listaDeMensagens;
    private Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemListaMensagensEmissores = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_listview_emissores, parent, false);

        return new MyViewHolder(itemListaMensagensEmissores);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.ivEmissor.setImageResource(R.drawable.logo_santander);
        holder.ivEnvelopeFechadoSantander.setImageResource(R.drawable.envelope_fechado_santander);
        holder.tvNuMensagens.setText(String.valueOf(15));

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView ivEmissor;
        ImageView ivEnvelopeFechadoSantander;
        TextView tvNuMensagens;

       public MyViewHolder(@NonNull View itemView) {
           super(itemView);

           ivEmissor = itemView.findViewById(R.id.ivEmissor);
           ivEnvelopeFechadoSantander = itemView.findViewById(R.id.ivEnvelopeFechadoSantander);
           tvNuMensagens = itemView.findViewById(R.id.tvNuMensagens);

       }
   }



}
