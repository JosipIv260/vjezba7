import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class relist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ucitavaniBroj=0;
//        ArrayList<Integer>lista=new ArrayList<>();
        List<Integer>lista=new ArrayList<>();

        do{
            System.out.print("ucitani brij");
            ucitavaniBroj=sc.nextInt();
            if (ucitavaniBroj!=-1){
                lista.add(ucitavaniBroj);//dodavanje brojeva u listu

            }
        } while (ucitavaniBroj !=-1);

        for (Integer i:lista){
            System.out.print(i+"\n");
        }
   lista.remove(1);
        System.out.print("\nUnesena lista"+lista);
        System.out.print("\nlista je veličine"+lista.size());
        System.out.print("\n ispis liste pomoću obicnog fora:");
        for (int i=0; i<lista.size(); i++){
            System.out.print(i+"");}
        }
    }

