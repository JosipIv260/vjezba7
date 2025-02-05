import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vjezbaarrayiscan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> lista=new ArrayList<>();
        int broj=0;
        int max=0;
        int min=0;
        int min2=0;
        do {
            broj = sc.nextInt();
            if (broj != -1) {
                lista.add(broj);
            }
        } while (broj!=-1);
        for (int brojici:lista){
            int broj2 = 0;
            if (brojici >= max) {
                max = brojici;
            }
        }System.out.println("najveci broj"+ max);





    }
}
