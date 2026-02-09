import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorDeSenhas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Gerador de Senhas em Java ---");
        System.out.print("Digite o tamanho da senha desejada: ");
        int tamanho = input.nextInt();

        String senhaGerada = gerarSenha(tamanho);
        
        System.out.println("Sua nova senha é: " + senhaGerada);
        
        input.close();
    }

    public static String gerarSenha(int tamanho) {
        // Caracteres permitidos
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        
        // SecureRandom é mais seguro que o Random comum para senhas
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        return senha.toString();
    }
}
