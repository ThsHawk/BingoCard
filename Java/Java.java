import java.util.Random;

public class Java {
    public static void main(String[] args){
        int varLoop;
        int[][] Bingo = new int[5][5];
        do{            
            for (int r = 0; r < 5; r++) {
                for (int c = 0; c < 5; c++) {
                    Bingo[r][c]= nRandom();
                }
            }
            varLoop = antiDouble(Bingo);            
        } while (varLoop == 1);
        for (int r = 0; r < 5; r++) {
            System.out.println("\t");
            for (int c = 0; c < 5; c++) {
                System.out.print(Bingo[r][c] + "\t");
            }
        }
    }
    public static int nRandom(){
        Random gen = new Random();
        int x = gen.nextInt(100);
        return x;
    }
    public static int antiDouble(int[][] matrix){
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++){
                for (int i2 = 0; i2 < 5; i2++) {
                    for (int j2 = 0; j2 < 5; j2++){
                        if(i == i2 && j == j2)break;
                        if(matrix[i][j] == matrix[i2][j2])return 1;
                    }
                }
            }
        }
        return 0;
    }
}