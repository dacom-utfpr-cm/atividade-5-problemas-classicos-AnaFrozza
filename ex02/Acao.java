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
interface Acao {
    public void pegar(int i) throws InterruptedException;
    public void soltar(int i) throws InterruptedException;
}
