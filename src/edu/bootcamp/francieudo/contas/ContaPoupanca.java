package edu.bootcamp.francieudo.contas;

import edu.bootcamp.francieudo.gui.UI;
import edu.bootcamp.francieudo.users.Cliente;

public class ContaPoupanca extends Conta{

    private static int SEQUENCIAL_POUPANCA = 0;
    private int numeroConta;

    public ContaPoupanca(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
        this.numeroConta = SEQUENCIAL_POUPANCA++;
    }

    @Override
    public void sacar(double valor) {
        
        if(verificarSaldo() < valor){
            UI.print("Valor insuficiente para saque na sua conta poupança!");
        }else{
            this.saldo -= valor;
        }
    }

    @Override
    public boolean depositar(double valor) {
        
        if(valor >= 10){
            this.saldo += valor;
            UI.print("Valor " + valor + " Depositado!");
            return true;
        }

        UI.print("Deposite um valor maior que R$ 10.00 reais");
        return false;
    }

    @Override
    public double verificarSaldo() {
        
        return this.saldo;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        
        if(valor > 0){
            this.saldo -= valor;
            contaDestino.depositar(valor);
            UI.print("Transferência feita com sucesso");
        }else{
            UI.print("Valor não suficiente");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

}
