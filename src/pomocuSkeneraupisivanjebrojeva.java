import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class pomocuSkeneraupisivanjebrojeva {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        List<Integer>lista=new ArrayList<>();
// želim upisivati brojeve  Upis broja zavrsava broje-1;
        System.out.println("upisi brojeve");
        int broj=0;
        int counter=0;

        while (broj!=-1){
            broj=sc.nextInt();
            lista.add(broj);
        }
System.out.println(counter+"brojač");
        System.out.println(lista+"lista");
        // napravi program koji ce sortirati najvece brojeve iz liste
        int Max=0;
        for (int broj2:lista){
            while (broj2>Max){
                Max=broj2;
            }
        }
        System.out.println("najveci broj liste je"+Max);
    }
}
