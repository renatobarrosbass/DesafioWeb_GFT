package util;

import java.util.Random;

public class GerarEmailsValidos {
    // Método para gerar um e-mail válido
    public static String gerarEmailValido() {
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder email = new StringBuilder();
        Random random = new Random();

        // Gera a parte local do e-mail
        for (int i = 0; i < 10; i++) {
            email.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        email.append("@hotmail.com");
        return email.toString();
    }
}