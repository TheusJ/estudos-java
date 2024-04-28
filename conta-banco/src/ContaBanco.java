import java.util.Scanner;

public class ContaBanco {
    Scanner texto = new Scanner(System.in);

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void cadastrarConta(){
        System.out.println("Digite o seu Nome: ");
        this.nomeCliente = texto.nextLine();

        System.out.println("Digite o número da Agência: ");
        this.agencia = texto.nextLine();

        System.out.println("Digite o numero da Conta: ");
        this.numero = texto.nextInt();

        texto.nextLine();

        System.out.println("Digite o saldo: ");
        this.saldo = texto.nextDouble();
    
    }

    public void exibirMenssagem(){
        System.out.println("Olá, " +this.nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia+ ", conta " + this.numero+", e seu saldo " + this.saldo+" já está disponível");


    }
}
