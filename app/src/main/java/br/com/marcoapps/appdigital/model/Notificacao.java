package br.com.marcoapps.appdigital.model;

import android.widget.ImageView;

public class Notificacao {

    private ImageView logoMarca;
    private String titulo;
    private String cidade;
    private String uF;
    private String data;
    private String corpo;
    private Integer NumContrato;
    private String tituloContrato;
    private Double valor;
    private String cumprimento;
    private String nomeEmissor;
    private String contato;
    private Cliente cliente;


    public Notificacao() {
    }

    public Notificacao(ImageView logoMarca, String titulo, String cidade, String uF) {
        this.logoMarca = logoMarca;
        this.titulo = titulo;
        this.cidade = cidade;
        this.uF = uF;
    }

    public ImageView getLogoMarca() {
        return logoMarca;
    }

    public void setLogoMarca(ImageView logoMarca) {
        this.logoMarca = logoMarca;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getuF() {
        return uF;
    }

    public void setuF(String uF) {
        this.uF = uF;
    }
}
