public class ContaPoupanca {
    private float saldoPoupanca;

    public float getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(float saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public void saque(float valor){
        if (saldo + saldoPoupanca < valor) {
            System.out.println("o saldo e insuficiente ");
        } else {
            if (saldo < valor) {
                valor -= saldo;
                saldo = 0;
                saldoPoupanca -= valor;
            } else {
                saldo -= valor;
            }
            System.out.println("saque efetuado com sucesso");
        }

    }
}
