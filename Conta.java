import lombok.Data;

@Data
public abstract class Conta  implements IConta {

   private static final int AGENCIA_PADRAO = 1;
   private static  int SEQUENCIAL = 1;

   protected int agencia;
   protected int numero;
   protected double saldo;
   protected Cliente cliente;

   public Conta(Cliente cliente) {
      this.agencia = AGENCIA_PADRAO;
      this.numero = SEQUENCIAL;
      this.cliente =  cliente;
      Banco.addCliente(cliente.getNome());
   }


   @Override
   public void sacar(double valor) {
      saldo -= valor;
      System.out.println(cliente.getNome().toUpperCase() +  "  Saque realizado com sucesso "
              + String.format("%.2f",valor) +  " Saldo atual: " + String.format("%.2f", saldo) + "\n");

   }

   @Override
   public void depositar(double valor) {
      saldo += valor;
      System.out.println(cliente.getNome().toUpperCase() +  " Deposito realizado com sucesso "
              + String.format("%.2f",valor) +  " Saldo atual: "  + String.format("%.2f", saldo)  + "\n");

   }

   @Override
   public void transferir(double valor, Conta contaDestino) {
      saldo -= valor;
      System.out.println(cliente.getNome().toUpperCase() +  " Transferencia realizada com sucesso "
              + String.format("%.2f",valor) +  " Saldo atual: "  + String.format("%.2f", saldo)  + "\n");

   }


   @Override
   public void imprimirInfosComuns() {
      System.out.printf("Cliente: %s%n", this.cliente.getNome().toUpperCase());
      System.out.printf("Agencia: %d%n", this.agencia);
      System.out.printf("Conta: %d%n", this.numero);
      System.out.printf("Saldo: %.2f%n\n", this.saldo);
   }



}
