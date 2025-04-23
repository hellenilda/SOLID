package org.example.exercicio3;


public class Robo implements Funcionario {

    @Override
    public void trabalhar() {
        // Lógica de trabalhar
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Robôs não comem!");
    }
}
