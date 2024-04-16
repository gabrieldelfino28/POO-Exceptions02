package model;

public class Conta {
    private int agencia;
    private int codConta;
    private int saldo;
    private float limite;

    public Conta() {
        super();
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getCodConta() {
        return codConta;
    }

    public void setCodConta(int codConta) {
        this.codConta = codConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void deposita(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) throws ArithmeticException {
        if(valor > saldo + limite) {
            throw new ArithmeticException("Saque inválido!\nLimite máximo disponível para saque: " + (saldo + limite));
        }else {
            saldo -= valor;
        }
    }
}
