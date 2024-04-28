public class Usuario {

    import java.util.Scanner;
    public static void main(String[] args) throws Exception {
        Scanner texto = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");
        String nome = texto.nextLine();

        System.out.println("Digite o sobre nome: ");
        String sobrenome = texto.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = texto.nextInt();

        
        System.out.println("Digite a sua altura");
        double altura = texto.nextDouble();


        System.out.println("Olá, me chamo "+nome+" " + sobrenome);
        System.out.println("Tenho " +idade+ "anos");
        System.out.println("Minha altura é " +altura + "cm ");
    
    }
}

