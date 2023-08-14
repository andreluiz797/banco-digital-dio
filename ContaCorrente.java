import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
        System.out.println("Ola seja bem vindo "   +  cliente.getNome().toUpperCase()
                +  " Em que posso te ajudar hoje sua agencia e: "  + agencia +
                ", conta corrente: " + numero +  "\n" );
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Corrente ====");
        super.imprimirInfosComuns();

    }
}
