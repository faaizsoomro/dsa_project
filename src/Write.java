
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
public class Write {

    public void FileCreate(String s) throws FileNotFoundException, IOException {

        BufferedWriter bw = null;

        File file = new File("D:/" + s + ".txt");

        if (!file.exists()) {
            file.createNewFile();
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Course Registered Successfully");
        }
        else {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Course Already Exists");
        }
    }

    public void FileWrite(String s,String x) throws FileNotFoundException, IOException {
        Boolean check = true;
        String list[] = new String[100];

        BufferedWriter bw = null;
        File file = new File("D:/"+s+".txt");

        BufferedReader br = null;
        br = new BufferedReader(new FileReader("D:/"+s+".txt"));
        String line = null;
        int c = 0;
        while ((line = br.readLine()) != null) {
            list[c] = line;
            c++;
        }
        for (int i = 0; i < c; i++) {
            if (x.equals(list[i])) {
                check = false;
                break;
            }
        }

        if (check == true) {
            try {
                

                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                bw.write(x);
                bw.newLine();
                System.out.println("File written Successfully");

            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                try {
                    if (bw != null) {
                        bw.close();
                    }
                } catch (Exception ex) {
                    System.out.println("Error in closing the BufferedWriter" + ex);
                }
            }
        }
    }
}
