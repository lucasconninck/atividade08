public class ContaEspecial {
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void saque (float valor){
        if (saldo + limites < valor ) {
            System.out.println("o saldo e insuficente ");
        } else {
            saldo -= valor;
            System.out.println("saque efetuado com sucesso");

        }
    }
}
