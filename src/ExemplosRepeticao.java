public class ExemplosRepeticao {
    public static void main(String[] args) {
        System.out.println("Exemplo de for()");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nExemplo de while()");
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador + " ");
            contador++; //Incrementa o valor de contador
        }
    }
}
