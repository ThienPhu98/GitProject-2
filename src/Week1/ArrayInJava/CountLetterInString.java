package Week1.ArrayInJava;

import java.util.Scanner;
import java.lang.String;

public class CountLetterInString {
    public static void main(String[] args) {
        String str = "you can’t judge a book by its cover";
        Scanner scanner = new Scanner(System.in);
        char letter;
        int count = 0;
        System.out.println("String is: " + str);


        do {
            System.out.println("Enter the Letter: ");
            letter = scanner.nextLine().charAt(0);
            if (!Check(letter, str)){
                System.out.println("There isn't that word in String");
            } else {
                for (int j = 0; j < str.length(); j++){
                    if (letter == str.charAt(j)){
                        count++;
                        System.out.println("Found the letter '" + letter + "' at position: " + j);
                    }
                }
            }
        } while (!Check(letter, str));

        if (count == 1) {
            System.out.println("There is 1 letter '"+ letter +"' has found in String");
        } else if (count > 1){
            System.out.println("There are " + count + " letters '"+ letter +"' has found in String");
        }
    }
    public static boolean Check(char letter, String str){
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i) == letter){
                return true;
            }
        }
        return false;
    }
}
