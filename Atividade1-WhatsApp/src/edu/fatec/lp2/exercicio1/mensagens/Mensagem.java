package edu.fatec.lp2.exercicio1.mensagens;

import edu.fatec.lp2.exercicio1.Contatinho;

public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    @Override
    public String toString() {
        return "Mensagem{" +
                "destinatario=" + destinatario +
                ", horaEnvio='" + horaEnvio + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }

    public abstract Mensagem sendMessage();

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Contatinho destinatario) {
        this.destinatario = destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
