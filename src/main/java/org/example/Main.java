package org.example;

import org.example.impl.CalculadoraDeImposto;
import org.example.impl.Pessoa;
import org.example.impl.PessoaFisica;
import org.example.impl.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Joao", "12345");
        Pessoa pessoa2 = new Pessoa("Maria", "12672");

        PessoaJuridica pj = new PessoaJuridica(pessoa1,10000);
        PessoaFisica pf = new PessoaFisica(pessoa2, 10000);

        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        System.out.println("Total Pessoa Física: " + calculadoraDeImposto.cacularImposto(pj));
        System.out.println("Total Pessoa Jurídica: " + calculadoraDeImposto.cacularImposto(pf));
    }
}