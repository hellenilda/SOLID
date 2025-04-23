package org.example.exercicio2;

//Refatore o código para que siga o Princípio Aberto/Fechado

public class CalculadoraDeDesconto {

    public double calculateDiscount(String tipoCliente) {
        if (tipoCliente.equals("Regular")) {
                return 0.1;
        } else if (tipoCliente.equals("VIP")) {
            return 0.2;
        }
            return 0;
        }


}
