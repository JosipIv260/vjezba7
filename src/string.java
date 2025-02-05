public class string {
    public static void main(String[] args) {
        // niz znakova -String
        String fakultet= "Fakultet organizacije i informatike Varaždin";
        String []riecFakultet=fakultet.split(" "); // sa znakom razmaka radimo zaseban elemen polja razmak izmedu navodnika daje rijec razmak rijec
        // ako nema razmaka slovkat ce
        for (String s: riecFakultet){
            System.out.println(s);
        }
        String recenica="  danas je bio hladan dan  ";
        System.out.println("unos ima znakova"+recenica.length());// broji znakove koje smo unjeli
        recenica=recenica.trim(); // uklanja početne i zavrsne razmake
        System.out.println("broj znakova nakon skracivanja"+recenica.length());
    }
}
