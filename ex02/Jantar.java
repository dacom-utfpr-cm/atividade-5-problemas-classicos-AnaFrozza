/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05.ex02;

import java.util.concurrent.Semaphore;

/**
 *
 * @author anafrozza
 */
public class Jantar implements Acao{
    int n = 0;
    Semaphore[] garfo = null;

    public Jantar(int numero) {
        n = numero;
        garfo = new Semaphore[n];
        for (int i = 0; i < n; i++) {
            garfo[i] = new Semaphore(1);
        }
    }

    @Override
    public void pegar(int i) throws InterruptedException {
        try {
            if(!garfo[i].tryAcquire()) {             
                throw new InterruptedException(); 
            }
            if(!garfo[(i + 1) % n].tryAcquire()) {
                throw new InterruptedException();
            }

        } catch (InterruptedException ex) {
            garfo[i].release();
            garfo[(i+1)%n].release();
            throw new InterruptedException();
        }
    }

    @Override
    public void soltar(int i) throws InterruptedException {
        garfo[i].release();
        garfo[(i + 1) % n].release();
    }
}
