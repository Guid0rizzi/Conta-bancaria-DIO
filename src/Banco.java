import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nomeBanco;

    List<Conta> contas = new ArrayList<>();


    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    void adicionarClientes(Conta conta){
        contas.add(conta);
    }



    public void mostrarContas(){
        contas.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nomeBanco='" + nomeBanco + '\'' +
                ", contas=" + contas +
                '}';
    }


    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNomeBanco("Santader");
        Cliente clienteLeonardo = new Cliente();
        clienteLeonardo.setNome("Leonardo");
        Conta cp = new ContaPoupanca(clienteLeonardo, banco);
        Conta cc = new ContaCorrente(clienteLeonardo, banco);
        banco.adicionarClientes(cp);
        banco.adicionarClientes(cc);
        cp.depositar(500);
        cp.sacar(50);
        cp.transferir(100,cc);
        banco.mostrarContas();
        System.out.println(banco);
        cc.imprimirExtrato();
        cp.imprimirInfosDaConta();

    }
}
