
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class LoginCode {
    public  void log(String un,String p) throws FileNotFoundException, IOException {
        String user[];
        user = new String[50];
        String pass[];
        pass= new String[50];
        
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("D:\\DS.txt"));
        String line = null;
        int counter = 0;
        int i = 0;
        int j = 0;
        while ((line = br.readLine()) != null) {
            counter++;
            
            if (counter % 2 == 1) {
                user[i] = line;
                i++;
            } else {
                pass[j] = line;
                j++;
            }
        }
        Boolean check=false;
        for(int a=0;a<i;a++){
           if(un.equals(user[a]))
               if(p.equals(pass[a])) 
                {
                    check=true;
                   if(user[a].contains("INS"))
                   {
                       new Teacher().setVisible(true);
                   }
                   else if(user[a].contains("ADM")){
                       new Admin().setVisible(true);
                   }
               }        
            }
        if(check==false)
           {
               new Login().setVisible(true);
           }
        }
}
