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
/**
 * Implemente e teste duas solucoes para o problema dos Leitores-Escritores
 * usando semárofos ou monitores que - não cause inanição (starvation) de
 * leitores ou escritores - priorize os escritores.
 */
public class Main {

    public static void main(String[] args) {
        String texto = "inicio: ";
        aula08.monitor.Monitor monitor = new aula08.monitor.Monitor(texto);
        monitor.starWrite(texto);
        monitor.startRead();

        System.out.println("Concluido!");
    }
}
