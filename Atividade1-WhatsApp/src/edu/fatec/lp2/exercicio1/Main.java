package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.mensagens.MsgAudio;
import edu.fatec.lp2.exercicio1.mensagens.MsgFoto;
import edu.fatec.lp2.exercicio1.mensagens.MsgTexto;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        Contatinho contato = new Contatinho("Beatriz", "12956781234");

        System.out.println(contato.getNome());
        System.out.println(contato.getCelular());

        MsgAudio msgAudio = new MsgAudio(120, contato, "10:00 AM", "Esta é uma mensagem de áudio.");

        System.out.println(msgAudio);

        MsgTexto msgTexto = new MsgTexto(60, contato, "10:00 AM", "Esta é uma mensagem de texto.");

        System.out.println(msgTexto);

        MsgFoto msgFoto = new MsgFoto(100, contato, "10:00 AM", "Esta é uma foto.");

        System.out.println(msgFoto);
    }
}

