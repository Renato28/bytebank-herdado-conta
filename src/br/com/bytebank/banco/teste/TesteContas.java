package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException {

        int a = 3;
        int b = a / 0;

        ContaCorrente outra = null;
        outra.deposita(200);

        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(221, 222);
        contaPoupanca.deposita(200.0);

        contaCorrente.transfere(10.0, contaPoupanca);

        System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta Poupanca: " + contaPoupanca.getSaldo());

    }
}
