public class DoWhileExo {

    public static void main(String[] args) {

        int i = 1;

        do {

            System.out.println("Poney numéro " + i);

            i++;
        }

        while (i < 1000001);



        i=1000000;

        do {
            System.out.println("Poney numéro " + i);

            i--;
        }

        while (i>0);

    }


}