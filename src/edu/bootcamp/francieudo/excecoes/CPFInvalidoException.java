package edu.bootcamp.francieudo.excecoes;

public class CPFInvalidoException extends RuntimeException {

    private String numero;

    public CPFInvalidoException(String numero){
        this.numero = numero;
    }

    @Override
    public String getMessage() {
        
        return "CPF: " + numero  + " invalido!";
    }
}
