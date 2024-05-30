public abstract class Conta implements IConta {


    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;
    protected Banco banco;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    public Conta(Cliente cliente, Banco banco){
        this.agencia = AGENCIA_PADRAO;
        this.numero  = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }
    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                ", banco=" + banco +
                '}';
    }

    protected  void imprimirInfosDaConta() {
        System.out.println(String.format("Banco %S",this.banco.getNomeBanco()));
        System.out.println(String.format("titular %S",this.cliente.getNome()));
        System.out.println(String.format("Agencia %d",this.agencia));
        System.out.println(String.format("Numero %d",this.numero));
        System.out.println(String.format("Saldo %.2f",this.saldo));
    }




}
