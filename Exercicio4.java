class Exercicio4{
    public static void main(String[] args) {
        int M = 4;
        int N = 4;
        int[][] matriz1 = new int[M][N];
        int[][] matriz2 = new int[M][N];
        int[][] matrizResult = new int [M][N];

        int valor = 0;
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++)
                matriz1[i][j] = valor++;
            
        }
        System.out.println("Matriz 1");
        for(int i = 0; i< matriz1.length; i++){
            for(int j = 0;j < matriz1[i].length; j++)
                System.out.printf("%2d ", matriz1[i][j]);
                System.out.println();
            }

            valor = 0;    
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++)
                    matriz2[i][j] = valor++;
                
            }
        System.out.println("Matriz 2");
        for(int i = 0; i< matriz2.length; i++){
            for(int j = 0;j < matriz2[i].length; j++)
                System.out.printf("%2d ", matriz2[i][j]);
                System.out.println();
                }

        for(int i = 0; i <matrizResult.length; i++){
            for (int j = 0; j < matrizResult[i].length; j++){
                for (int k = 0; k < matriz1[i].length; k++)
                    matrizResult[i][j] += matriz1[i][k] * matriz2[k][j];

            }
        }
        System.out.println("\n MatrizResult ");
        for(int i = 0; i <matrizResult.length; i++){
            for (int j = 0; j < matrizResult[i].length; j++)
            System.out.printf("%-6d", matrizResult[i][j]);
            System.out.println();
    }
}
}