package edu.bootcamp.francieudo.contas;

import edu.bootcamp.francieudo.users.Cliente;

public abstract class Conta implements IConta{

    protected Agencia agencia;
    protected Cliente cliente;
    protected double saldo;

    public Conta(Agencia agencia, Cliente cliente){

        this.agencia = agencia;

        if(cliente != null){
            this.cliente = cliente;
        } 

        this.saldo = 0.0;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

}
