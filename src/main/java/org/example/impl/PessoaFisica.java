package org.example.impl;

import org.example.impostostrategy.ImpostoStrategy;

public class PessoaFisica implements ImpostoStrategy {
    private Pessoa pessoa;
    private final double jurosPessoaFisica = 5.00;
    private int receitaTotal;

    @Override
    public double calcularImposto() {
        return receitaTotal + receitaTotal*(jurosPessoaFisica/100);
    }

    public PessoaFisica(Pessoa pessoa, int receitaTotal) {
        this.pessoa = pessoa;
        this.receitaTotal = receitaTotal;
    }

    public PessoaFisica(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getJurosPessoaFisica() {
        return jurosPessoaFisica;
    }

}
