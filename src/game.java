import java.util.Random;
import java.util.Scanner;

public class game {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    static game Main = new game();

    public boolean[][] BoardInit() {
        int[] Dimensions = new int[2];
        System.out.print("Introdueix les dimensions del tauler:\nEix Y: ");
        Dimensions[0] = input.nextInt();
        System.out.print("Eix X: ");
        Dimensions[1] = input.nextInt();
        return new boolean[Dimensions[0]][Dimensions[1]];
    }

    public void BoardPrint(boolean[][] Board) {
        char live = 9209;
        char dead = 11036;
        for (boolean[] y : Board) {
            for (boolean x : y) {
                if (x) System.out.printf("%c ", live);
                else System.out.printf("%c ", dead);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] Board = Main.BoardInit();
        Main.BoardPrint(Board);
    }
}

