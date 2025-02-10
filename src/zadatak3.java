
public class zadatak3 {
    public static void main(String[] args) {
        String datum="Danas je 24.02.2010";
        int broj=0;
        for (int i=0; i<datum.length();i++){
            if (Character.isDigit(datum.charAt(i))){
                broj++;
            }
        }
        System.out.println(broj+"broj");
    }
}
