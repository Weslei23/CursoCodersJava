package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String texto = "testando notacao";
        texto = texto.toUpperCase();
        System.out.println(texto);

        texto = texto.replace("notacao", "java");
        System.out.println(texto);

        String novoTexto = "TESTE NOTACAO";
        novoTexto = novoTexto.toLowerCase();
        System.out.println(novoTexto);
    }
}
