public abstract class Conta {
    private String agencia;
    private String numero;
    private double saldo;
    private Cliente titular;

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public Cliente getTitular() { return titular; }
    public void setTitular(Cliente titular) { this.titular = titular; }

    public abstract String getTipoConta();

    public void gravar() {
        System.out.println("Gravando conta " + getTipoConta() + " do cliente " + titular.getNome());
        titular.gravar();
    }
}
