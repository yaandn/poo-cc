import java.util.Scanner;
public class Main {

    public static int qtdNumeros(int numf, int numi) {
        return (numf - numi) + 1;
    }

    public static int somaParcial(int parada, int numi, int numf) {
        if(parada > qtdNumeros(numf, numi)) {
            System.out.println("Entrada inválida na função de soma parcial.");
            throw new IllegalArgumentException("Argumento inválido");

        }
        int soma = 0;
        for (int i = numi; i< numi + parada; i++) {
            soma += i;
        }
        return soma;
    }

    public static String toString(int numi, int numf) {
        return " Intervalo entre " + numi + " e " + numf;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* cria objeto para leitura */
        int numi = 0, numf = 0;
        int soma = 0;
        double media;
        int qtde = 0;
        int qtdePares = 0;
        int qtdeImpares = 0;
        System.out.println("Entre o primeiro número:");
        numi = sc.nextInt();
        System.out.println("Entre o segundo número:");
        numf = sc.nextInt();
        if (numi > numf) {
            int num = numf;
            numf = numi;
            numi = num;
        }
        for (int i = numi; i < numf + 1; i++) {
            qtde++;
            soma = soma + i;
            if ((i % 2) == 0) {
                qtdePares++;
            }
            else {
                qtdeImpares++;
            }
        }
        System.out.println("Soma : " + soma + " - Média : " + soma / qtde + " - Qtde Pares : "+ qtdePares + " Qtde Ímpares : " + qtdeImpares +
                " Qtde Números: " + qtdNumeros(numf, numi) + " Soma dos primeiros n números: " + somaParcial(2, numi, numf) + toString(numi, numf));
    }
}