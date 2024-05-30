public class ContaPoupanca extends Conta{


 public ContaPoupanca(Cliente cliente, Banco banco) {
  super(cliente, banco);
 }

 @Override
 public String toString() {
  return "ContaPoupanca{" +
          "saldo=" + saldo +
          ", cliente=" + cliente +
          '}';
 }

 @Override
 public void imprimirExtrato() {
  System.out.println("==== Extrato da conta Poupanca ====");
  super.imprimirInfosDaConta();
 }




}
