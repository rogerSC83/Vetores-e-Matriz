import java.util.Scanner;

class ExemploVetor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = input.nextInt();
        int[] vetor = new int[tamanho];

        for(int i = 0; i < vetor.length; i++)
            System.out.printf("%d ", vetor[i]);

        for(int i = 0; i < vetor.length; i++)
            vetor[i] = i * 10;

        System.out.printf("\n");
        for(int i = 0; i < vetor.length; i++)
            System.out.printf("%d ", vetor[i]);
    }
}