class Exercicio3{
    public static void main(String[] args) {
        
  int M = 3;
  int N = 3;
  int[][] matriz = new int[M][N];
  int[] vetor = new int[N];
  int[] vetorResposta = new int[N];

int valor = 0;
    for(int i = 0; i < matriz.length; i++){
        for( int j = 0; j < matriz[i].length; j++){
            matriz[i][j] = valor++;
            vetor[i] = i;
        }
    }

System.out.println("Matriz");
    for(int i = 0; i< matriz.length; i++){
        for(int j = 0;j < matriz[i].length; j++)
            System.out.printf("%2d ", matriz[i][j]);
            System.out.println();
        }

System.out.printf("\n esse e o vetor\n");
    for(int i = 0; i < vetor.length; i++)
        System.out.println( vetor[i]);
    
    for(int i = 0; i < matriz.length; i++)
        for(int j = 0; j < matriz[i].length; j++)
        vetorResposta[i] += vetor[j] * matriz[i][j];// inverteu os elemento ij da matriz

    System.out.println("\nVetor Resposta");
        for(int i = 0; i < vetorResposta.length; i++)
            System.out.println(vetorResposta[i]);

    vetorResposta = new int[N];
        for(int i = 0; i < matriz.length; i++)
            for(int j = 0; j < matriz[i].length; j++)
                vetorResposta[i] += vetor[j] * matriz[j][i];// só inverteu os elemento ij da matriz
                    
    System.out.println("\nVetor Resposta");
        for(int i = 0; i < vetorResposta.length; i++)
            System.out.printf("%5d", vetorResposta[i]);

}
}