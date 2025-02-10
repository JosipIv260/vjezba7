import java.util.ArrayList;
import  java.util.List;
public class ponavljanje {
    public static void main(String[] args) {
    String datum= "Danas je 27.02.2002.";
        int e=0;
        int b=0;
        List<Integer>lista=new ArrayList<>();
        List<Integer>lista2=new ArrayList<>();
        List<Integer>lista3=new ArrayList<>();
        for (int a1=0;a1<datum.length();a1++) {
            if (Character.isDigit(datum.charAt(a1))) {
                e++;

            } else if (Character.isLetter(datum.charAt(a1))) {
                b++;
            }
        }System.out.println(e+"Broj brojeva u tekstu");
        System.out.println(b+"Broj slova ");
        System.out.println("ostali znakovi"+((-e-b)+datum.length()));

        int broj=0;
        int broj2=broj-1;
        String a2="Dobar dan svima";
        String[] rijeci=a2.split(" ");
        for (int i=0;i<rijeci.length;i++){
            broj+=i;
        }

        while ((broj-1)>=0){
            System.out.println(rijeci[(broj-1)]);
            broj=broj-1;
        }




    }
}

