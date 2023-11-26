import java.util.Scanner;

public class ContaTerminal {
    
    private static int Numero;
    private static int Agencia;
    private static String Nome;
    private static float Saldo;

    public static void main(String[] args) {
         Scanner leitura = new Scanner(System.in);

         System.out.println("Por favor,digite o numero da Agência: ");
         
         Numero = leitura.nextInt();
         
         System.out.println("Por favor, digite a Agencia: ");
         Agencia = leitura.nextInt();
         
         System.out.println("\nPor favor, digite o seu Nome: ");
         Nome = leitura.next();

         System.out.println("\nPor favor, digite o Saldo: ");
         Saldo = leitura.nextFloat();
         
         System.out.println("Olá " + Nome + ",obrigado por criar uma conta em nosso Banco " + Agencia + ",conta "+ Numero +" e seu saldo " + Saldo + " já está disponivel");
        
            }

    }
