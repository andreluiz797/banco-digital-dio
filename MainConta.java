

public class MainConta {

    public static void main(String[] args) {

        Conta ccAndre = new ContaCorrente(new Cliente("Andre"));
        Conta cpAndre = new ContaPoupanca(new Cliente("Andre"));

        Conta ccLuiza = new ContaCorrente(new Cliente("Luiza"));
        Conta cpLuiza = new ContaPoupanca(new Cliente("Luiza"));

        Conta ccGustavo = new ContaCorrente(new Cliente("Gustavo"));
        Conta cpGustavo = new ContaPoupanca(new Cliente("Gustavo"));

        ccAndre.depositar(100.59);
        ccAndre.transferir(78.20, cpLuiza);

        ccLuiza.depositar(45.00);
        cpLuiza.transferir(150.00, cpGustavo);

        cpGustavo.sacar(15.00);
        ccGustavo.depositar(150.00);

        System.out.println(Banco.getClientes());

    }
}
