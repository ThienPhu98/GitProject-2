package Week4.TextFile.Pack3;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class CopyFile {
    public List<Integer> readFile(String filePath){
        List<Integer> data = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                data.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File does not exit or fail element!");
        }
        return data;
    }

    public void writeFile(String filePath, String data){
        try {
            File newFile = new File(filePath);

            if (newFile.exists()) {
                throw new FileAlreadyExistsException(filePath);
            }

            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(data);
            bw.close();
        } catch (FileAlreadyExistsException e) {
            System.err.println("File '" + filePath + "' already exit!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
