package Assignment1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Gst {
    int id;
    String name;
    int price;
    int gst;
    int quantity;
    Gst(int id, String name, int price, int gst, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gst = gst;
        this.quantity = quantity;
    }
    double getTotalPriceWithGST(int no) {
        double base = price * no;
        return base + (base * gst / 100.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gst> list = new ArrayList<>();
        ArrayList<Gst> cart = new ArrayList<>();
        ArrayList<Integer> qty = new ArrayList<>();

        try {
            BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\Coditas\\IdeaProjects\\firstprogram\\Assignments\\src\\Demo.txt"));
            String line;

            while((line = buff.readLine()) != null) {
//                int indSpace = line.indexOf(" ");
//                int id = Integer.parseInt(line.substring(0,indSpace));

                String words[] = line.split(" ");
                int id = Integer.parseInt(words[0]);
                String name = words[1];
                int price = Integer.parseInt(words[2]);
                int gst = Integer.parseInt(words[3]);
                int quantity = Integer.parseInt(words[4]);
                list.add(new Gst(id,name,price,gst,quantity));
            }
            buff.close();

            while(true) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Following are the available products with their ID : ");
                for(Gst p : list) {
                    System.out.println(p.id + " " + p.name);
                }
                System.out.println("-------------------------------------------------------");
                System.out.println("1. Add to cart");
                System.out.println("2. Checkout");
                System.out.print("Enter your choice : ");
                int choice = sc.nextInt();

                if(choice == 1) {
                    System.out.print("Enter product ID : ");
                    int pid = sc.nextInt();
                    Gst selected = null;
                    //boolean found = false;
                    for(Gst p : list) {
                        if(p.id == pid) {
                            selected = p;
                            //found = true;
                            break;
                        }
                    }
                    if(selected!=null) {
                        System.out.print("Enter the quantity : ");
                        int no = sc.nextInt();
                        if(no <= selected.quantity) {
                            cart.add(selected);
                            qty.add(no);
                            selected.quantity -= no;
                            System.out.println("* Added to cart.");
                        } else {
                            System.out.println("* Not enough stock.");
                        }
                    } else {
                        System.out.println("Invalid ID!");
                    }
                } else if (choice == 2) {
                    double total = 0;
                    System.out.println("x-----x-----x-----x-----x-----x-----x");
                    System.out.println("Checkout Summary : ");
                    for (int i = 0; i < cart.size(); i++) {
                        Gst p = cart.get(i);
                        int no = qty.get(i);
                        double cost = p.getTotalPriceWithGST(no);
                        total += cost;
                        System.out.printf("%s x%d => Rs. %.2f\n", p.name, no, cost);
                    }
                    System.out.printf("Total Amount Payable : Rs. %.2f\n", total);
                    break;
                } else {
                    System.out.println("Invalid option!");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}