class Exercicio1{
    public static void main(String[] args) {
        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];
        int[] vetor3 = new int[50];

    int valor = 0;
        for (int i = 0; i < vetor1.length; i++){
            vetor1[i] = valor;
            vetor2[i] = valor++;
        }
        for(int i = 0; i < vetor1.length; i++)
            System.out.printf("%d ", vetor1[i]);
            System.out.println();
        for(int i = 0; i < vetor2.length; i++)
            System.out.printf("%d ", vetor2[i]);
            System.out.println();
        for(int i = 0; i < vetor3.length; i++ ){
            vetor3[i] = vetor1[i] + vetor2[i];
        System.out.println(" Vetor[" + i + "] = " + vetor3[i]);
    }

        
    }
           
}