package edu.bootcamp.francieudo.contas;

public enum Agencia {

    QUIXADA(0304), FORTALEZA(0301), MARACANAU(0302), PACAJUS(0303);

    public int numeroAgencia;

    private Agencia(int numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }
}
