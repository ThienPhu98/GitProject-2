package Week3.StackQueue.CountLetter;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;

public class FindByTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Character, Integer> map = new TreeMap<>();

        map.put('r', 0);
        map.put('t', 0);
        map.put('p', 0);
        map.put('v', 0);

        Set<Character> keys = map.keySet();
        System.out.print("The TreeMap:");
        for(Character key: keys) {
            System.out.print("\nKey: '" + key + "' with value: " + map.get(key));
        }

        System.out.print("\nEnter a string to collect for TreeMap: ");
        String InputString = scanner.nextLine();
        String string = InputString.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if(map.containsKey(string.charAt(i))){
                map.replace(string.charAt(i), map.get(string.charAt(i)) , (map.get(string.charAt(i)) + 1));
            } else {
                map.put(string.charAt(i),1);
            }
        }
        System.out.print("\nThe TreeMap after collect from string: ");
        for(Character key: keys) {
            System.out.print("\nKey: '" + key + "' with value: " + map.get(key));
        }
    }
}
