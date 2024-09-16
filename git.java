import java.util.Scanner;

public class git{
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar um número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Chama o método para calcular o fatorial
        long fatorial = calcularFatorial(numero);

        // Exibe o resultado
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }

    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
