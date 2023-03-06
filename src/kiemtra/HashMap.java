package kiemtra;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class HashMap  {
        java.util.HashMap<String,String> hms = new java.util.HashMap<>();

    public String Add(String name,String phone){
        return this.hms.put(name,phone);
    }
    public void Display() {
        Set<String> Display = this.hms.keySet();
        System.out.println(Arrays.toString(Display.toArray()));
    }
    public String find(String phone){
        String name = this.hms.get(phone);
        return name;
    }
    public static void main(String[] args){
        HashMap HashMap = new HashMap();
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("CRM\n" +
                    "1. Add\n" +
                    "2. Display\n" +
                    "3. Find\n" +
                    "4. Exit" +
                    "");
            luachon = sc.nextInt(); sc.nextLine();
            if (luachon == 1){
               System.out.println("Enter Name");
               String name = sc.nextLine();
                System.out.println("phone");
                String phone = sc.nextLine();
                HashMap.Add(name,phone);
            } else if (luachon==2) {
                HashMap.Display();
            } else if (luachon==3) {
                System.out.println("Enter phone");
                String phone = sc.nextLine();
                System.out.println(HashMap.find(phone));
            }
        }while (luachon!=4);
        }
    }


