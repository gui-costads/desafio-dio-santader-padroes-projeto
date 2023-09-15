package org.example.impl;

import org.example.impostostrategy.ImpostoStrategy;

public class PessoaJuridica implements ImpostoStrategy {
    private Pessoa pessoa;
    private final double jurosPessoaJuridica = 10;
    private int receitaTotal;

    @Override
    public double calcularImposto() {
        return this.receitaTotal + this.receitaTotal*(jurosPessoaJuridica/100);
    }

    public PessoaJuridica(Pessoa pessoa, int receitaTotal) {
        this.pessoa = pessoa;
        this.receitaTotal = receitaTotal;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getJurosPessoaJuridica() {
        return jurosPessoaJuridica;
    }

}
