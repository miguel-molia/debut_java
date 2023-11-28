public class Pyramide {
    public static void main(String[] args) {
        int colone = 0;
        int ligne = 0;
        for (int i = 0; i < 5; i = i + 1) {

            for (int j = 0; j < 10; j = j + 1) {
                colone = j;
                ligne = i;
                if (ligne == 0 && colone == 5) {
                    System.out.print("000010000");
                }
                if (ligne == 1 && colone == 4) {
                    System.out.print("000111000");
                }
                if (ligne == 2 && colone == 3) {
                    System.out.print("001111100");
                }
                if (ligne == 3 && colone == 2) {
                    System.out.print("011111110");
                }
                if (ligne == 4 && colone == 1) {
                    System.out.print("111111111");
                }
            }
            System.out.println("");
        }
    }
}
