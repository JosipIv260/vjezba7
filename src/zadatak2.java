import java.util.Scanner;
public class zadatak2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("upiši ime");
        String ime=sc.nextLine();
        System.out.println("upiši prezime");
        String prezime=sc.nextLine();
        String ime2=ime.trim();
        System.out.println("grad rođenja");
        String grad=sc.nextLine();
        if (ime2.length()>7){
            System.out.println("ime sadrži više od sedam znakova");
            System.out.println("upišite novo ime");
            String ime3=sc.nextLine();
            ime=ime3;
        }
        System.out.print("ime i prezime\t"+ime+"\t"+prezime);
        boolean slovoA=grad.contains("a");if (true){System.out.println("\n"+slovoA+ "sadrži slovo a");}
        boolean slovoE=grad.contains("e");if (true){System.out.println(slovoE+ "sadrži slovo e");}
        boolean slovoI=grad.contains("i");if (true){System.out.println(slovoI+ "sadrži slovo i");}
        boolean slovoO=grad.contains("o");if (true){System.out.println(slovoO+ "sadrži slovo o");}
        boolean slovoU=grad.contains("u");if (true){System.out.println(slovoU+ "sadrži slovo u");}



    }
}
