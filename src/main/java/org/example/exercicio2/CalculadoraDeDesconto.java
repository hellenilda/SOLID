package org.example.exercicio2;

// Princípio Aberto/Fechado

public class CalculadoraDeDesconto {

    protected double desconto;
    private VIP clienteVip;
    private Regular clienteRegular;

    public double calculateDiscount(String tipoCliente) {
        if (tipoCliente.equals("VIP")) {
            return this.desconto = clienteVip.desconto();
        } else if (tipoCliente.equals("Regular")) {
            return this.desconto = clienteRegular.desconto();
        }
        return 0;
    }

}
