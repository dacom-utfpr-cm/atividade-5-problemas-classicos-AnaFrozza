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
public class Leitor extends Thread{
    String texto;
    Monitor monitor;
    
    public Leitor(String texto){
        this.monitor = new Monitor(texto);
        this.texto = texto;
    }

    @Override
    public void run() {
        while(true){
            monitor.starWrite(texto);
            
        }
    }
}
