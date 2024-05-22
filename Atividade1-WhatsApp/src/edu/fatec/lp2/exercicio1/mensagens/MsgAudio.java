package edu.fatec.lp2.exercicio1.mensagens;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgAudio extends Mensagem {

    private int duracao;

    public MsgAudio(int duracao, Contatinho destinatario, String horaEnvio, String conteudo) {
        this.duracao = duracao;
        setDestinatario(destinatario);
        setHoraEnvio(horaEnvio);
        setConteudo(conteudo);
    }

    @Override
    public Mensagem sendMessage() {
        return new MsgAudio(this.duracao, getDestinatario(), getHoraEnvio(), getConteudo());
    }

    @Override
    public String toString() {
        return "MsgAudio{" +
                "duracao=" + duracao +
                ", destinatario=" + getDestinatario() +
                ", horaEnvio='" + getHoraEnvio() + '\'' +
                ", conteudo='" + getConteudo() + '\'' +
                '}';
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
