import java.util.Random;
import java.util.Scanner;

public class game {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    static game Main = new game();

    public int NextInt(String TxT) {
        System.out.print(TxT);
        return input.nextInt();
    }

    public boolean[][] BoardInit() {
        int[] Dimensions = new int[2];
        Dimensions[0] = Main.NextInt("Introdueix les dimensions del tauler:\nEix Y: ");
        Dimensions[1] = Main.NextInt("Eix X: ");
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

    public int[][] CelGetFreeNeighbors(boolean[][] Board, int[] Cords) {
        int[][] FreeNeighbors = new int[0][2];
        int[] Dimensions = {Board.length, Board[0].length};
        for (int y = -1; y != 2; y++) {
            for (int x = -1; x != 2; x++) {
                if ((Cords[0] + y >= 0) && (Cords[0] + y < Dimensions[0])) {
                    if ((Cords[1] + x >= 0) && (Cords[1] + x < Dimensions[1])) {
                        if (!Board[Cords[0] + y][Cords[1] + x]) {
                            int[][] tmp = FreeNeighbors;
                            FreeNeighbors = new int[tmp.length + 1][2];
                            System.arraycopy(tmp, 0, FreeNeighbors, 0, tmp.length);
                            FreeNeighbors[tmp.length] = new int[]{Cords[0] + y, Cords[1] + x};
                        }
                    }
                }
            }
        }
        return FreeNeighbors;
    }

    public boolean[][] BoardDrawnAuto(boolean[][] Board) {
        int[] Dimensions = {Board.length, Board[0].length};
        int cels = Main.NextInt("Introdueix el número de conjunts de celdas: ");
        for (int i = 0; i != cels;){
            int[] RandomCords = {random.nextInt(Dimensions[0]), random.nextInt(Dimensions[1])};
            if (!Board[RandomCords[0]][RandomCords[1]]) {
                i ++;
                Board[RandomCords[0]][RandomCords[1]] = true;
                int[][] FreeCells;
                for (int j = 0; j != 5;) {
                    FreeCells = Main.CelGetFreeNeighbors(Board, RandomCords);
                    if (FreeCells.length == 0) j = 5;
                    else {
                        int[] RandomCel = FreeCells[random.nextInt(FreeCells.length)];
                        if (!Board[RandomCel[0]][RandomCel[1]]) {
                            Board[RandomCel[0]][RandomCel[1]] = true;
                            j++;
                        }
                    }
                }
            }
        }
        return Board;
    }

    public boolean[][] BoardDrawnManual(boolean[][] Board) {



        return Board;
    }

    public static void main(String[] args) {
    }
}

