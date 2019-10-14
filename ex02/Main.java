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

/**
 * Implemente uma solução para o problema do Jantar dos Filósofos que não resulte em impasse (deadlock).
 */

public class Main {
    public static void main(String[] args) {
        Jantar filosofo = new Jantar(5);
        for (int i = 0; i < 5; i++) {
            new Thread(new Filosofo(i, filosofo)).start();
        }
    }
}
