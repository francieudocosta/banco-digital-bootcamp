package edu.bootcamp.francieudo.contas;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private final String nome;
    List<IConta> contas;

    public Banco(String nome){

        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void adicionarConta(IConta conta){
        contas.add(conta);
    }

    public List<IConta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }
}
