package rugeekbrains.Ni1.HomeWork4;

import java.util.Random;

public class minesweeper {
    private static final int HEIGHT=10; //высота
    private static final int WIDTH=10;  //ширина
    private static final int MINES_COUNT=10;
    private static final int MINE=1000;
    private static final int EMPTY=0;

    public static void main(String[] args) {
        boolean win = play();
        if (win) {
            System.out.println("Победа!");
        } else {
            System.out.println("Проиграл!");
        }
    }
    private static boolean play() {
        int[][] board = generateBoard();
        printBoard(board);
        return true;
    }


    private static int[][] generateBoard() {
        int[][] board =new int[HEIGHT][WIDTH];
        Random random = new Random();
        int mines = MINES_COUNT;
        while (mines>0){
            int x,y;
            do {
                x = random.nextInt(HEIGHT);
                y = random.nextInt(WIDTH);
            } while (board[x][y] == MINE);
            board[x][y] = MINE;
            mines--;
        }
        //for (int i=0; i<HEIGHT; i++){
           // for (int j=0;j<WIDTH; j++){
               // if (board[i][j] == MINE){
                   // continue;
               // }
           // int mcount = 0;
              //  for (int k=i-1; k<=i+1;k++){
                  //  for (int l=j-1; l<=j+1; l++){
                      //  if (board[k][l] == MINE){
                         //   mcount++;
                       // }
                   // }
               // }
               // board[i][j]=mcount;
           // }
       // }
        return board;
    }

    private static void printBoard(int[][] board) {
        System.out.print("   ");
        for (char i='A'; i<'A'+WIDTH; i++){
            System.out.print(" "+i);
        }
        System.out.println();
        for (int i = 0; i < HEIGHT; i++) {
            System.out.printf("%3d", i);
            for (int j = 0; j < WIDTH; j++) {
                switch (board[i][j]) {
                    case EMPTY:
                        System.out.print(" .");
                        break;
                    case MINE:
                        System.out.print(" *");
                        break;
                }
            }
            System.out.println();
        }
    }
}
