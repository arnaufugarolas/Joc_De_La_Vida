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
        //Dimensions[0] = 10;
        System.out.print("Eix X: ");
        Dimensions[1] = input.nextInt();
        //Dimensions[1] = 20;
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

    public boolean[][] BoardDrawnAuto(boolean[][] Board) {
        int[] Dimensions = {Board.length, Board[0].length};
        System.out.print("Introdueix el número de conjunts de celdes: \n");
        //int cels = input.nextInt();
        int cels = 3;
        for (int i = 0; i != cels;){
            int[] RandomCords = {random.nextInt(Dimensions[0]), random.nextInt(Dimensions[1])};
            if (!Board[RandomCords[0]][RandomCords[1]]) {
                Board[RandomCords[0]][RandomCords[1]] = true;
                i ++;
                for (int j = 0; j != 5;) {
                    int[] RandomCel = {(random.nextInt(5) - 2), random.nextInt(5) - 2};
                    if (!(RandomCel[0] == 0 && RandomCel[1] == 0)) {
                        if (!(RandomCel[0] + RandomCords[0] <= -1 || RandomCel[1] + RandomCords[1] <= -1)) {
                            if (!(RandomCel[0] + RandomCords[0] >= Dimensions[0] || RandomCel[1] + RandomCords[1] >= Dimensions[1])) {
                                if (!Board[RandomCel[0] + RandomCords[0]][RandomCel[1] + RandomCords[1]]) {
                                    Board[RandomCel[0] + RandomCords[0]][RandomCel[1] + RandomCords[1]] = true;
                                    j++;
                                }
                            }
                        }
                    }
                    System.out.println("Otra");
                }
            }
        }
        return Board;
    }


    public static void main(String[] args) {
        for (int i = 0; i != 100; i++) {
            Main.BoardPrint(Main.BoardDrawnAuto(Main.BoardInit()));
        }
    }
}

