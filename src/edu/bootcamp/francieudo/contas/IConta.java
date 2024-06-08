package edu.bootcamp.francieudo.contas;

public interface IConta {

    void sacar(double valor);
    boolean depositar(double valor);
    double verificarSaldo();
    void transferir(double valor, IConta contaDestino);
}
