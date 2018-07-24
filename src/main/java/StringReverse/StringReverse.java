package StringReverse;

import java.util.Scanner;

public class StringReverse {

    public void useReverse(){
        System.out.println(setWord().reverse());
    }

    private StringBuilder setWord() {
        System.out.println("Enter any word:");
        Scanner input = new Scanner(System.in);
        return new StringBuilder(input.nextLine());
    }
}
