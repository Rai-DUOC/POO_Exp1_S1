package com.clases;

/**
 *
 * @author Rai
 */
public class Cuenta {

    int numero;
    int saldo;

    public Cuenta(int numero, int saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
