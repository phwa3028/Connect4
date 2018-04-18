import java.io.IOException;

public class InOut {

    public static int getInt() throws IOException{
        int i;
        do {
            System.out.println();
            System.out.print(">");
            do {
                i = System.in.read();
            } while (i == '\n' || i == '\r');

            if (i <= '0' || i > '9')
                errorNaN();

        } while (i <= '0' || i > '9');

        i -= '0';
        System.out.println();
        return i;

    }

    public static void errorNaN() {
        System.out.println("Falsche Eingabe, versuchs nochmal!");
    }

    public static void errorTooBig() {
        System.out.println("Zahl zu groß, versuchs nochmal!");
    }

    public static void errorFull() {
        System.out.println("Spalte voll, versuchs nochmal!");
    }

    public static void draw(char[][] boardArray) {

        for(int i = 0; i < boardArray.length; i++)
            System.out.print(i+1);
        System.out.println();

        for(int i = 0; i < boardArray[0].length; i++) {

            for(int z = 0; z < boardArray.length; z++)
                System.out.print(boardArray[z][i]);

            System.out.println();
        }

        for(int i = 0; i < boardArray.length; i++)
            System.out.print(i+1);
        System.out.println();

    }

    public static void winMsg(char player) {
        System.out.println(player + " Gewinnt!");
    }

    public static void drawMsg() {
        System.out.println("Unentschieden!");
    }

}
