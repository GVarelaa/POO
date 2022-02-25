import java.util.Scanner;

public class TestePrograma {
    public static void main(String[] args) {
        Ficha1 ficha1 = new Ficha1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza a alínea:");
        int alinea = sc.nextInt();

        switch (alinea){
            case 1:
                System.out.println("Introduza a temperatura em graus");
                double temp = sc.nextDouble();
                double result1 = ficha1.celsiustoFarenheit(temp);
                System.out.println("Temperatura em Farenheit :" + result1);
                break;
            case 2:
                System.out.println("Introduza dois números");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                int result2 = ficha1.maximoNumeros(a1, b1);
                System.out.println("O máximo é:" + result2);
                break;
            case 3:
                System.out.println("Introduza o nome:");
                String nome = sc.next();
                System.out.println("Introduza o saldo:");
                double saldo = sc.nextDouble();
                String result3 = ficha1.criaDescricaoConta(nome, saldo);
                System.out.println(result3);
                break;
            case 4:
                System.out.println("Introduza o valor em euros:");
                double valor = sc.nextDouble();
                System.out.println("Introduza a taxa de conversão para libras");
                double taxa = sc.nextDouble();
                double result4 = ficha1.eurosParaLibras(valor, taxa);
                System.out.println("Libras: " + result4);
                break;
            case 5:
                System.out.println("Introduza dois números inteiros:");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                int print1 = (a2 > b2) ? a2 : b2;
                int print2 = (a2 > b2) ? b2 : a2;
                int media = (int) ((a2 + b2) / 2.0);
                System.out.println("Ordem decrescente: " + print1 + " " + print2);
                System.out.println("Média: " + media);
            case 6:
                System.out.println("Introduza um número inteiro:");
                int a3 = sc.nextInt();
                long result5 = ficha1.factorial(a3);
                System.out.println("O fatorial é: " + result5);
            case 7:
                long result6 = ficha1.tempoGasto();
                System.out.println("O tempo gasto foi: " + result6);
                break;
        }
    }
}
