package grouping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("********* Hosein Rezaei Q2-HW11 *********\n");
        System.out.println("How Many Enter Word ?");
        int count =scanner.nextInt();
        System.out.println("Please Enter Word: ");
            String[] sc =new String[count];
            for ( int i = 0; i < count; i++) {
                sc[i] = scanner.next();
            }



        System.out.println("------- WordByLength -------\n");
        System.out.println(PracticeStream.wordByLength(sc)+"\n");
        System.out.println("--- GroupingWordByLength ---\n");
        System.out.println(PracticeStream.groupingWordByLength(sc));

    }
}
