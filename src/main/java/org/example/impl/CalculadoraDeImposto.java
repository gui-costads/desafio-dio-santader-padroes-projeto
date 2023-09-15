package org.example.impl;

import org.example.impostostrategy.ImpostoStrategy;

public class CalculadoraDeImposto {
    public double cacularImposto(ImpostoStrategy imposto){
        return imposto.calcularImposto();
    }
}
