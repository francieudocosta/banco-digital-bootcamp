package edu.bootcamp.francieudo.app;

import edu.bootcamp.francieudo.contas.Agencia;
import edu.bootcamp.francieudo.contas.Banco;
import edu.bootcamp.francieudo.contas.ContaPoupanca;
import edu.bootcamp.francieudo.contas.IConta;
import edu.bootcamp.francieudo.gui.UI;
import edu.bootcamp.francieudo.users.Cliente;

public class Main {

    public static void main(String[] args) {

        Banco bradesco = new Banco("Bradesco");
        Cliente c1 = new Cliente("Fran","034589788");


        IConta contaPoupanca = new ContaPoupanca(Agencia.QUIXADA, c1);
        bradesco.adicionarConta(contaPoupanca);    
        
        UI.print(contaPoupanca.verificarSaldo());

    }
}
