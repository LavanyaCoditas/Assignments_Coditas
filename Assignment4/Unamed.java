
import java.util.ArrayList;
import java.util.Scanner;


//we will need to change the projectstructure  -> language level -> java 21 preview
// to use th unnamed class feature in java 21 as it is not yet standardised
void main() {

    System.out.println("Enter false to stop.");
    System.out.println("Enter items to buy : ");

    ArrayList<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    String item = sc.nextLine();

    while(!item.equalsIgnoreCase("false")) {
        list.add(item);
        item = sc.nextLine();
    }

    int count = 0;
    for(String _ : list) {
        count++;
    }
    System.out.println("You bought " + count + " items");

}


