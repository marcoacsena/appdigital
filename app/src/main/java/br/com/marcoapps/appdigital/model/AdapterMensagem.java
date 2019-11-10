package br.com.marcoapps.appdigital.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.marcoapps.appdigital.R;

public class AdapterMensagem extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Mensagem> listMensagens;
    private Context context;

    public AdapterMensagem(List<Mensagem> listMensagens, Context context) {
        this.listMensagens = listMensagens;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listMensagens.size();
    }

    @Override
    public Object getItem(int i) {
        return listMensagens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

//    public void add(Mensagem mensagem){
//        listMensagens.add(mensagem);
//        this.notifyDataSetChanged();
//    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //Resgata a i-ésima mensagem da lista
        final Mensagem mensagem = listMensagens.get(i);

        //Resgata os elementos para saída dos dados
        view = inflater.inflate(R.layout.item_listview_emissores, null);

        //Resgata os elementos para saída dos dados
        ImageView ivEmissor = view.findViewById(R.id.ivEmissor);
        ImageView ivEnvelopeFechadoSantander = view.findViewById(R.id.ivEnvelopeFechadoSantander);
        TextView tvNuMensagem = view.findViewById(R.id.tvNuMensagem);

        //Manda os dados para o layout item_listview_emissores
        ivEmissor.setImageResource(R.drawable.logo_santander);
        ivEnvelopeFechadoSantander.setImageResource(R.drawable.envelope_fechado_santander);
        tvNuMensagem.setText(mensagem.getNuMensagens());


        return view;
    }


}
