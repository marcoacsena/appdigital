package br.com.marcoapps.appdigital.model;

public class ConfiguracaoMensagem {

    private String tipoFormulario;
    private String dataEntregaDaMensagem;
    private String cidadeDoEmissor;
    private String dataDoDocumento;

    public ConfiguracaoMensagem() {
    }

    public ConfiguracaoMensagem(String tipoFormulario, String dataEntregaDaMensagem, String cidadeDoEmissor, String dataDoDocumento) {
        this.tipoFormulario = tipoFormulario;
        this.dataEntregaDaMensagem = dataEntregaDaMensagem;
        this.cidadeDoEmissor = cidadeDoEmissor;
        this.dataDoDocumento = dataDoDocumento;
    }

    public String getTipoFormulario() {
        return tipoFormulario;
    }

    public void setTipoFormulario(String tipoFormulario) {
        this.tipoFormulario = tipoFormulario;
    }

    public String getDataEntregaDaMensagem() {
        return dataEntregaDaMensagem;
    }

    public void setDataEntregaDaMensagem(String dataEntregaDaMensagem) {
        this.dataEntregaDaMensagem = dataEntregaDaMensagem;
    }

    public String getCidadeDoEmissor() {
        return cidadeDoEmissor;
    }

    public void setCidadeDoEmissor(String cidadeDoEmissor) {
        this.cidadeDoEmissor = cidadeDoEmissor;
    }

    public String getDataDoDocumento() {
        return dataDoDocumento;
    }

    public void setDataDoDocumento(String dataDoDocumento) {
        this.dataDoDocumento = dataDoDocumento;
    }
}
