package br.com.marcoapps.appdigital.model;

import android.media.Image;

import java.util.List;

public class Mensagem {

    private Image imagemEmissor;
    private Image imagemEnvelopeFechado;
    private String nuMensagens;
    private List<DetalheMensagem> detalhesMensagens;

    public Mensagem() {
    }

    public Mensagem(Image imagemEmissor, Image imagemEnvelopeFechado, String nuMensagens) {
        this.imagemEmissor = imagemEmissor;
        this.imagemEnvelopeFechado = imagemEnvelopeFechado;
        this.nuMensagens = nuMensagens;
    }

    public Image getImagemEmissor() {
        return imagemEmissor;
    }

    public void setImagemEmissor(Image imagemEmissor) {
        this.imagemEmissor = imagemEmissor;
    }

    public Image getImagemEnvelopeFechado() {
        return imagemEnvelopeFechado;
    }

    public void setImagemEnvelopeFechado(Image imagemEnvelopeFechado) {
        this.imagemEnvelopeFechado = imagemEnvelopeFechado;
    }

    public String getNuMensagens() {
        return nuMensagens;
    }

    public void setNuMensagens(String nuMensagens) {
        this.nuMensagens = nuMensagens;
    }

    public List<DetalheMensagem> getDetalhesMensagens() {
        return detalhesMensagens;
    }

    public void setDetalhesMensagens(List<DetalheMensagem> detalhesMensagens) {
        this.detalhesMensagens = detalhesMensagens;
    }
}
