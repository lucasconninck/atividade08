public class Conta {
    protected String agencia;
    protected String numeros;
    protected float saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void saque (float valor) {
        if (saldo < valor) {
            System.out.println("O saldo e insuficiente");
            saldo -= valor;
            System.out.println("saque efetuado com sucesso");
        }
    }
}

