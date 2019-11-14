package br.com.marcoapps.appdigital.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.marcoapps.appdigital.R;
import br.com.marcoapps.appdigital.model.ConfiguracaoMensagem;

public class AdapterListaMensagem extends RecyclerView.Adapter<AdapterListaMensagem.ConfiguracaoMensagemViewHolder>{


    private List<ConfiguracaoMensagem> listaConfiguracaoDeMensagens;

    public AdapterListaMensagem(List<ConfiguracaoMensagem> listaConfiguracaoDeMensagens) {
        this.listaConfiguracaoDeMensagens = listaConfiguracaoDeMensagens;
    }

    @NonNull
    @Override
    public ConfiguracaoMensagemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemListaMensagem = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_listview_mensagens, parent, false);

        return new ConfiguracaoMensagemViewHolder(itemListaMensagem);
    }

    @Override
    public void onBindViewHolder(@NonNull ConfiguracaoMensagemViewHolder holder, int position) {

        ConfiguracaoMensagem configuracaoMensagem = listaConfiguracaoDeMensagens.get(position);
        holder.tvTipoDocumento.setText(configuracaoMensagem.getTipoFormulario());
        holder.tvCidadeEmissorDocumento.setText(configuracaoMensagem.getCidadeDoEmissor());
        holder.tvDataDocumento.setText(configuracaoMensagem.getDataDoDocumento());
        holder.tvDataEntregaDocumento.setText(configuracaoMensagem.getDataEntregaDaMensagem());

    }

    @Override
    public int getItemCount() {
        return listaConfiguracaoDeMensagens.size();
    }

    public class ConfiguracaoMensagemViewHolder extends RecyclerView.ViewHolder{

        TextView tvTipoDocumento;
        TextView tvCidadeEmissorDocumento;
        TextView tvDataDocumento;
        TextView tvDataEntregaDocumento;


        public ConfiguracaoMensagemViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTipoDocumento = itemView.findViewById(R.id.tvTipoDocumento);
            tvCidadeEmissorDocumento = itemView.findViewById(R.id.tvCidadeEmissorDocumento);
            tvDataDocumento = itemView.findViewById(R.id.tvDataDocumento);
            tvDataEntregaDocumento = itemView.findViewById(R.id.tvDataEntregaDocumento);
        }
    }
}
