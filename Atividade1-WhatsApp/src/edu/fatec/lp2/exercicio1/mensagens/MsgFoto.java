package edu.fatec.lp2.exercicio1.mensagens;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgFoto extends Mensagem {

    private int tamanho;

    public MsgFoto(int tamanho, Contatinho destinatario, String horaEnvio, String conteudo){
        this.tamanho = tamanho;
        setDestinatario(destinatario);
        setHoraEnvio(horaEnvio);
        setConteudo(conteudo);
    }

    @Override
    public Mensagem sendMessage() {
        return new MsgFoto(this.tamanho, getDestinatario(), getHoraEnvio(), getConteudo());
    }

    @Override
    public String toString() {
        return "MsgFoto{" +
                "duracao=" + tamanho +
                ", destinatario=" + getDestinatario() +
                ", horaEnvio='" + getHoraEnvio() + '\'' +
                ", conteudo='" + getConteudo() + '\'' +
                '}';
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
