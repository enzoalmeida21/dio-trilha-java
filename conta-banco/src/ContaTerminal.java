import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      //TODO: Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in);

      //Exibir as mensagens para o nosso user
        
        System.out.println("Seja Bem-Vindo ao DioBank, vamos criar sua conta agora!");
       

      //Obter pela classe Scanner os valores digitados no terminal

       // Agencia
       System.out.println("Por favor, digite o número da sua Agência: ");
       String agencia = sc.nextLine();

       // numero da conta
       System.out.println("Agora, digite o número da sua conta: ");
       int numero = sc.nextInt();
        sc.nextLine();

       //Nome Do Cliente
       System.out.println("Por favor, digite o seu nome: ");
       String nomeCliente = sc.nextLine();

       //Saldo
       System.out.println("Qual o seu saldo atual?: ");
       double saldo = sc.nextDouble();

      //Exibir a mensagem final (Conta Criada)

      System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +  ", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
