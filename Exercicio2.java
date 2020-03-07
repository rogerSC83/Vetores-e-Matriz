import java.util.Random;

class Exercicio2{
    public static void main(String[] args) {
        int[] vetor = new int[100];
        Random rand = new Random();
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        System.out.println(menor);
        System.out.println(maior);

        for(int i = 0; i < vetor.length; i++)
            vetor[i] = rand.nextInt(Integer.MAX_VALUE);

        for(int i = 0; i < vetor.length; i++)
            System.out.printf("%d ", vetor[i]);

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior)
                maior = vetor[i];
            if(vetor[i] < menor)
                menor = vetor[i];
        }

        System.out.printf("\nMaior valor %d\n" +
        "Menor valor %d\n", maior, menor);
    }
}