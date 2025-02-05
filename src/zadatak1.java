
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Double> lista2=new ArrayList<>();
        int []novčanice={500,200,100,50,20,10,2,1};
        double []kovanice={0.50,0.20,0.10,0.05,0.02,0.01};
        int canter=0;
        System.out.print("molim upišite broj date količine novca");
        float novac=  sc.nextFloat();
        System.out.println("Hvala na unesenom broju");
        for (int pare:novčanice)
        {while (novac>=pare){
        novac=novac-pare;
        System.out.println("vraćam"+pare);
        }
        }if (novac>=0.01){for (double kovanica:kovanice){
            while (novac>=kovanica){
                novac= (float) (novac-kovanica);
                System.out.println(kovanica+"vracam kovanice");}}

        }
    }
}
