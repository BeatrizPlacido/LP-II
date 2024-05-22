package edu.fatec.lp2.exercicio1.mensagens;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgTexto extends Mensagem {

    private int numChar;

    public MsgTexto(int numChar, Contatinho destinatario, String horaEnvio, String conteudo){
        this.numChar = numChar;
        setDestinatario(destinatario);
        setHoraEnvio(horaEnvio);
        setConteudo(conteudo);
    }

    @Override
    public Mensagem sendMessage() {
        return new MsgTexto(this.numChar, getDestinatario(), getHoraEnvio(), getConteudo());
    }

    @Override
    public String toString() {
        return "MsgTexto{" +
                "duracao=" + numChar +
                ", destinatario=" + getDestinatario() +
                ", horaEnvio='" + getHoraEnvio() + '\'' +
                ", conteudo='" + getConteudo() + '\'' +
                '}';
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }
}
