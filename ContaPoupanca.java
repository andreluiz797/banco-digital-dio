import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        System.out.println("Ola seja bem vindo "   +  cliente.getNome().toUpperCase()
                +  " Em que posso te ajudar hoje sua agencia e: "  + agencia +
                ", conta poupanca: " + numero +  "\n" );

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Poupanca ====");
        super.imprimirInfosComuns();
    }
}
