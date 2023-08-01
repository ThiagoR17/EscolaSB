package br.com.academy.Enums;


public enum Status {

    ATIVO("ATIVO"),
    INATIVO ("INATIVO"),
    TRANCADO ("TRACADO"),
    CANCELADO("CANCELADO");

    private String status;

    private Status(String status){
        this.status = status;
    }
}
