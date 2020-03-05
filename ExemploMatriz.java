class ExemploMatriz{
    public static void main(String[] args) {
        int M = 10;
        int N = 10;
        int[][] matriz = new int[M][N];
        int[][] matrizB = new int[M][N];
        int[][] mRes = new int[M][N];

        /*Preenche a matriz e matrizB com valores, iniciando em 1
        e indo até M*N-1 */
        int valor = 0;
        for(int linha = 0; //For para passar pelas linhas da matriz
                linha < matriz.length; linha++){
            for(int col = 0; // For para passar pelas colunas da matriz
                col < matriz[linha].length; col++){
                matriz[linha][col] = valor; 
                matrizB[linha][col] = valor++;    
            }
        }
        
        //Imprimindo a Matriz A
        System.out.println("Matriz A");
        for(int linha = 0; 
                linha < matriz.length; linha++){
            for(int col = 0; 
                col < matriz[linha].length; col++)
                System.out.printf("%-6d ",
                    matriz[linha][col]);
            System.out.println();
        }

        //Imprimendo a Matriz B
        System.out.println("\nMatriz B");
        for(int linha = 0; 
                linha < matrizB.length; linha++){
            for(int col = 0; 
                col < matrizB[linha].length; col++)
                System.out.printf("%-6d ",
                    matrizB[linha][col]);
            System.out.println();
        }

        //Fazendo a soma de duas matrizes e atribuindo o resultado a mRes
        for(int linha = 0;
                linha < matriz.length; linha++){
            for (int col = 0;
                col < matriz[linha].length; col++){
                    mRes[linha][col] = matriz[linha][col] 
                        + matrizB[linha][col];
                }
        }

        //Imprimindo matriz Res
        System.out.println("\nMatriz Res");
        for(int linha = 0; 
                linha < mRes.length; linha++){
            for(int col = 0; 
                col < mRes[linha].length; col++)
                System.out.printf("%-6d ",
                    mRes[linha][col]);
            System.out.println();
        }

    }
}