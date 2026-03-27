import java.util.Scanner;

public class ExemplosDecisao {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero1 = leitor.nextInt();

            System.out.print("Digite um número: ");
            int numero2 = leitor.nextInt();

            double media = (numero1 + numero2) / 2.0;
            System.out.println("Média: " +media);
        }
}
