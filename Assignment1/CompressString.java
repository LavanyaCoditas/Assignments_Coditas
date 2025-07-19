package Assignment1;
import java.util.Arrays;
import java.util.Scanner;
public class CompressString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string ");
        String str=sc.nextLine();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        StringBuilder sb= new StringBuilder();
        int count=1;
        for(int i=1;i<charArray.length;i++)
        {
            char c=charArray[i-1];
            if(c==charArray[i])
            {
                count ++;
            }
            else {
                sb.append(c);
                sb.append(count);
                count=1;
            }
            if(i==charArray.length-1)
            {
                sb.append(c);
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
}
