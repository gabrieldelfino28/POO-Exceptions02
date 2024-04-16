package view;

import model.Conta;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Conta c1 = new Conta();
        c1.setAgencia(1003);
        c1.setCodConta(12304099);
        c1.setSaldo(1000);
        c1.setLimite(500);

        try{
            c1.deposita(100);
            c1.deposita(50);
            System.out.println(c1.getSaldo());
            c1.sacar(300);
            c1.sacar(500);
            System.out.println(c1.getSaldo());
            c1.sacar(400);
            System.out.println(c1.getSaldo());
            c1.sacar(600);
        }catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
