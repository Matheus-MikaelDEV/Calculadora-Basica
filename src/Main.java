import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaração de varíaveis
        String opcao;
        float num1, num2, operacao = 0;

        Scanner ler = new Scanner(System.in);

        // pede ao úsuario qual operação matématica desejada.
        System.out.println("Digite uma das quatro operações matématicas básica desejada: ");
        System.out.println("+ para adição.\n- para subtração.\n* para multiplicação.\n/ para divisão.");
        opcao = ler.next();

        //verifica a oepração escolhida
        if (opcao.equals("+")){
            System.out.println("Primeiro número: ");
            num1 = ler.nextFloat();
            System.out.println("Segundo número:");
            num2 = ler.nextFloat();

            operacao = num1 + num2;
        }else if (opcao.equals("-")){
            System.out.println("Primeiro número: ");
            num1 = ler.nextFloat();
            System.out.println("Segundo número:");
            num2 = ler.nextFloat();

            operacao = num1 - num2;
        }else if (opcao.equals("*")){
            System.out.println("Primeiro número: ");
            num1 = ler.nextFloat();
            System.out.println("Segundo número:");
            num2 = ler.nextFloat();

            operacao = num1 * num2;
        }else if (opcao.equals("/")){
            System.out.println("Primeiro número: ");
            num1 = ler.nextFloat();
            System.out.println("Segundo número:");
            num2 = ler.nextFloat();

            operacao = num1 / num2;
        }else{
            System.out.println("Isso não é uma operação válida para esse programa!");
        }

        //exibir resultado
        System.out.println("O resultado é: "+operacao);
    }
}