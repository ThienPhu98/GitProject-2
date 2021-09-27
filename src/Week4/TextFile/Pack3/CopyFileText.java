package Week4.TextFile.Pack3;

import java.util.List;

public class CopyFileText {
    public static String copyData(List<Integer> numbers) {
        String data = "";
        for (int i = 0; i < numbers.size(); i++) {
            data += numbers.get(i);
            data += "\n";
        }
        return data;
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        List<Integer> numbers = copyFile.readFile("src\\Week4\\TextFile\\Pack3\\Pack3.txt");
        String data = copyData(numbers);
        copyFile.writeFile("src\\Week4\\TextFile\\Pack3\\Pack3.copy.txt", data);
    }
}
