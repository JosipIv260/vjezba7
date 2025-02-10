import java.util.ArrayList;
import java.util.List;
public class ifvjezba {
    public static void main(String[] args) {
        List<Integer>lista=new ArrayList<>();
        double []a1={1.2,2.3,5.3};
        int[]a2={1,2,3,4,5};
        double suma=0;
        for (int niz:a2){
            suma+=niz;
        }
        for (double niz2:a1){
            suma+=niz2;
        }System.out.println(suma);
    }
}