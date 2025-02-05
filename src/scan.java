import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class scan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> lista=new ArrayList<>();
        System.out.println("upisi niz");
        int brojevi = sc.nextInt();
        int niz[]=new int[brojevi];
       lista.add((int) brojevi);
       if (brojevi !=-1){
       sc.close();
       lista.remove(10);}
       System.out.println(lista);

    }
}
