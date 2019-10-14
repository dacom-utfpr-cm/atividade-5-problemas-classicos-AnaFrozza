/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05.ex02;

/**
 *
 * @author anafrozza
 */
public class Filosofo implements Runnable {

    int id = 0;
    Acao garfo = null;

    public Filosofo(int id, Acao acao) {
        this.id = id;
        this.garfo = acao;
    }

    @Override
    public void run() {
        try {
            while (true) {
                try {
                    System.out.println("Phil " + id + " Pensando...");
                    Thread.sleep(3000);
                    System.out.println("Phil " + id + " Com fome...");
                    garfo.pegar(id);
                    System.out.println("Phil " + id + " Comendo...");
                    Thread.sleep(4000);
                    garfo.soltar(id);
                } catch (InterruptedException e) {
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

}
