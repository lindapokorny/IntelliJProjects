
package org.pursuit;

public class Main {


    public static void main(String[] args) {
    }


}

//
//package org.pursuit;
//        public class Main {
//
//            public static void main(String[] args) {
//                Parrot parrot = new Parrot("fruits", 80, "tropical");
//
//                parrot.printCharacteristics();
//
//
//                FruitBat fruitBat = new FruitBat("fruits", "nocturnal", "cave");
//
//                fruitBat.printCharacteristics();
//
//                parrot.fly();
//                fruitBat.fly();
//
//                Octopus octopus = new Octopus(8);
//
//                octopus.printCharacteristics();
//
//                Squid squid = new Squid(10);
//
//                squid.printCharacteristics();
//
//                squid.swim();
//                octopus.swim();
//
//            }
//
//        }
//
//
//    public static int countCode(String input) {
//        int count = 0;
//
//        for (int i = 0; i < input.length() - 3; i++) {
//            if (input.charAt(i) == 'c' && input.charAt(i) + 1 == 'o' && input.charAt(i) + 3 == 'o') {
//                count++;
//            }
//        }
//        return count;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// elide();
//    }
//
//    public static void elide() {
//
//
//        Scanner scanner = new Scanner(System.in);
//        String ans = "";
//
//        do {
//            System.out.println("What food are you trying to feed the hippo?");
//            ans = scanner.nextLine();
//
//            if ((ans.charAt(0) == 'H') || (ans.charAt(0) == 'h')) {
//                System.out.println("Yum");
//            } else {
//                System.out.println("Yuck!");
//            }
//        }
//