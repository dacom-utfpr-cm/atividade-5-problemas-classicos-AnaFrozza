/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05.ex01;

import aula08.monitor.Monitor;

/**
 *
 * @author anafrozza
 */
public class Escritor extends Thread{
    Monitor monitor;
    String texto;
    
    public Escritor(String texto){
        this.texto = texto;
        this.monitor = new Monitor(texto);
    }

    @Override
    public void run() {
        while (true) {
              monitor.startRead();
        }

    }
}
