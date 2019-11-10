package br.com.marcoapps.appdigital.model;

public class Mensagem {

    private String nomeEmissor;
    private String nuMensagens;


    public Mensagem() {
    }

    public Mensagem(String nomeEmissor, String nuMensagens) {
        this.nomeEmissor = nomeEmissor;
        this.nuMensagens = nuMensagens;
    }

    public String getNomeEmissor() {
        return nomeEmissor;
    }

    public void setNomeEmissor(String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }

    public String getNuMensagens() {
        return nuMensagens;
    }

    public void setNuMensagens(String nuMensagens) {
        this.nuMensagens = nuMensagens;
    }
}
