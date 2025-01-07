import java.util.ArrayList;
import java.util.Scanner;

public class List {
    static ArrayList<Integer>list = new ArrayList<>();
    
    static public void remove(int a){
          list.remove(a);
    }
    static public void add(int a){
        list.add(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        add(9);
        System.out.println(list);

      boolean a =true;
      while (a!=false){
        int input =sc.nextInt();
        list.add(input);
        System.out.println("do you want to continue giving input: True or False " );
        a=sc.nextBoolean();
      }
      System.out.println(list);

    }
}
