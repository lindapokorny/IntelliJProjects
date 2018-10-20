

public class Main {

    public static void main(String[] args) {

        int count = 10;
        while (count >= 0) {
            if (count != 0) {
                System.out.println(count);
                if (count == 0)
                    System.out.println("Blastoff!");

                count = (count - 1);
            }
        }
    }}
