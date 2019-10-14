/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05.ex01;

/**
 *
 * @author anafrozza
 */
public class Monitor {
    String texto;
    int leitores;
    boolean isEscritor;

    public Monitor(String texto) {
        this.leitores = 0;
        this.texto = texto;
        this.isEscritor = false;
    }

    public synchronized void startRead() {
        while (isEscritor) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Erro: " + e);
            }

            this.leitores++;
            try {
                if (this.leitores == 1) {
                    wait();
                }

            } catch (InterruptedException ex) {
                System.out.println("Erro: " + ex);
            }

            System.out.println("Ler: " + this.texto);

            this.leitores--;
            if (this.leitores == 0) {
                notify();
            }
            notifyAll();
        }
    }

    public synchronized void starWrite(String texto) {
        while (isEscritor || leitores != 0) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Erro: " + e);
            }

        }
        this.texto += "olá thread!";
        isEscritor = true;
    }

}
