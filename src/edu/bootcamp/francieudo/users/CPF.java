package edu.bootcamp.francieudo.users;

import edu.bootcamp.francieudo.excecoes.CPFInvalidoException;

public class CPF {

    private final String numero;
    private String numeroFormatado;

    public CPF(String numero) {
       
        if(!isValidoCPF(numero)){
            throw new CPFInvalidoException(numero);
        }

        this.numero = numero;
        this.numeroFormatado = formatarNumero(numero);
    }

    public boolean isValidoCPF(String numero){

        return true;
    }

    public String formatarNumero(String numero){

        return null;
    }

    public String getNumero() {
        return numero;
    }

    public String getNumeroFormatado() {
        return numeroFormatado;
    }

    
}
