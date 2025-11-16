public class Main {
    public static void main(String[] args) {
        // 1. Some dois inteiros a = 8 e b = 13 e imprima o resultado.
        int a = 8;
        int b = 13;

        System.out.println(a + b);

        // 2. Calcule a área de um retângulo com double largura = 5.5 e double altura = 3.2. Imprima com mensagem.
        double largura = 5.5;
        double altura = 3.2;
        double area = largura * altura;

        System.out.println(area);

        // 3. Qual o resultado de System.out.println(5 + 3 * 2);? Explique por que
        System.out.println(5 + 3 * 2);
        /*
            11 because the operator "*" has precedence greater than +,
            therefore, first it is multiplied then added
        */
    }
}