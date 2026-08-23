public class addmat {
    public static void main(String[]args){
        int mat1[][] = {{2,4,6},
                       {6,4,2 }};

        int mat2[][] = {{2,4,6},
                       {6,4,2 }};

         int sum[][] = {{0,0,0},
                       {0,0,0 }};

        for(int i = 0; i<mat1.length; i++){ // rows numbers of thimes
            for(int j= 0; j<mat2[i].length; j++){// colums numbers of times
                System.out.format(" Setting the value for i=%d and i=%d\n",i,j);

                sum[i][j] = mat1[i][j] + mat2[i][j];

            }
           

        }
        for(int i = 0; i<mat1.length; i++){ // rows numbers of thimes
            for(int j= 0; j<mat2[i].length; j++){// colums numbers of times
                System.out.print(sum[i][j]+" ");

                sum[i][j] = mat1[i][j] + mat2[i][j];
        
        
        }
        System.out.println("");
    }
}
}
    

