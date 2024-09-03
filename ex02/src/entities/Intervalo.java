package entities;

public class Intervalo {
    public int numi;
    public int numf;

    public Intervalo (int numi, int numf) {
        if (numi < numf) {
            this.numi = numi;
            this.numf = numf;
        }
        else{
            this.numi = numf;
            this.numf = numi;
        }
    }
    public double soma() {
        double soma = 0;
        for (int i = numi; i < numf + 1; i++) {
            soma = soma + i;
        }
        return soma;
    }
    public double media() {
        return soma()/(numf-numi+1);
    }
    public int qtdePares() {
        int qtde = 0;
        for (int i = numi; i < numf + 1; i++) {
            if ((i % 2) == 0)
                qtde++;
        }
        return qtde;
    }
    public int qtdeImpares() {
        int qtde = 0;
        for (int i = numi; i < numf + 1; i++) {
            if ((i % 2) > 0)
                qtde++;
        }
        return qtde;
    }

    public int qtdNumeros() {
        return (this.numf - this.numi) + 1;
    }

    public int somaParcial(int parada) {
        if(parada > this.qtdNumeros()) {
            System.out.println("Entrada inválida na função de soma parcial.");
            throw new IllegalArgumentException("Argumento inválido");

        }
        int soma = 0;
       for (int i = this.numi; i< this.numi + parada; i++) {
           soma += i;
       }
       return soma;
    }

    public String toString() {
        return " Intervalo entre " + this.numi + " e " + this.numf;
    }
}
