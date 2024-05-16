package org.projeto;
/**
 * Classe contendo as informações da conta
 * @author arlindo-gsn
 * @version 1.0
 */

public class ContaTerminal {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;


    public ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return STR."Olá , \{nomeCliente}, obrigado por criar uma conta em nosso banco, sua agência é \{agencia}, conta \{numero} e seu saldo \{saldo} já está disponível para saque.";
    }

}
