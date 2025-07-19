package Assignment1;
import java.io.*;

public class FileReadString
{
        public static void main(String[] args) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Coditas\\IdeaProjects\\firstprogram\\Assignments\\document1.txt"));
                String line;  int c = 0;
                while ((line = reader.readLine()) != null) {
                    //System.out.println(line);

                    for(int i=0; i<line.length(); i++) {

                        if(Character.isLowerCase(line.charAt(i))) {
                            c++;
                        }
                    }
                }
                System.out.println("Number of lower case characters are : "+c);
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }


