package edu.bootcamp.francieudo.contas;

import edu.bootcamp.francieudo.users.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

    @Override
    public boolean depositar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    @Override
    public double verificarSaldo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarSaldo'");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }

}
