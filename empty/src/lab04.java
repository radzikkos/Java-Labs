//ProszÄ zaimplementowaÄ klasÄ lab04string
//UWAGA! RozwiÄzanie w stylu:
//String wspak(String a)
// {
//  return "kapsw eizdeb ot";
// }
// oznacza automatycznie 0 (ZERO) punktĂłw (choÄby dotyczyĹo TYLKO JEDNEJ metody).

public class lab04
{
    public static void main(String[] args)
    {
        double punkty = 0.0;

        String s1 = "banan";
        String s2 = "truskawka";

        // 1 punkt
        int dlugosc = lab04string.dlugosc(s1);
        if (dlugosc == 5) punkty = punkty + 0.5;
        System.out.println("Slowo '" + s1 + "' ma " + dlugosc + " liter. (5)");

        dlugosc = lab04string.dlugosc(s2);
        if (dlugosc == 9) punkty = punkty + 0.5;
        System.out.println("Slowo '" + s2 + "' ma " + dlugosc + " liter. (9)");

        // 1 punkt

        int ile_razy = lab04string.ile_razy_literka_wystepuje(s1,'a');
        if (ile_razy == 2) punkty = punkty + 0.5;
        System.out.println("W slowie '" + s1 + "' literka 'a' pojawia sie " + ile_razy + " razy. (2)");

        ile_razy = lab04string.ile_razy_literka_wystepuje(s2,'u');
        if (ile_razy == 1) punkty = punkty + 0.5;
        System.out.println("W slowie '" + s2 + "' literka 'u' pojawia sie " + ile_razy + " raz. (1)");


        // 1 punkt

        boolean takie_same = lab04string.czy_takie_same("test1","test1");
        if (takie_same == true) punkty = punkty + 0.5;
        System.out.println("czy_takie_same(\"test1\",\"test1\") = " + takie_same);

        takie_same = lab04string.czy_takie_same("blabla","test1");
        if (takie_same == false) punkty = punkty + 0.5;
        System.out.println("czy_takie_same(\"blabla\",\"test1\") = " + takie_same);

        // 1 punkt

        String t1 = lab04string.wspak("to bedzie wspak");
        if (t1.equals("kapsw eizdeb ot") == true) punkty = punkty + 1.0;
        System.out.println("wspak(\"to bedzie wspak\") = \"" + t1 + "\" (\"kapsw eizdeb ot\")");

        // 1 punkt

        //palindrom to sĹowo ktĂłre czytane wspak jest takie samo
        boolean palindrom = lab04string.czy_plaindrom("otto");
        if (palindrom == true) punkty = punkty + 0.5;
        System.out.println("czy_plaindrom(\"otto\") = " + palindrom);

        palindrom = lab04string.czy_plaindrom("kot");
        if (palindrom == false) punkty = punkty + 0.5;
        System.out.println("czy_plaindrom(\"kot\") = " + palindrom);

        // 1 punkt

        //sĹowo - nazwijmy je "abecadĹowe" to takie w ktĂłrym litery wystÄpujÄ w kolejnoĹci alfabetycznej
        //np "abc" czy "aceh" to sĹowa abecadĹowe a "zda" juĹź takim sĹowem nie jest
        boolean abecadlowe = lab04string.czy_abecadlowe("abcdef");
        if (abecadlowe == true) punkty = punkty + 0.5;
        System.out.println("czy_abecadlowe(\"abcdef\") = " + abecadlowe);

        abecadlowe = lab04string.czy_abecadlowe("zebra");
        if (abecadlowe == false) punkty = punkty + 0.5;
        System.out.println("czy_abecadlowe(\"zebra\") = " + abecadlowe);

        //2 punkty
        // ROT13 to metoda kodowania polegajÄca na tym, ze przesuwamy litery o 13 do przodu w alfabecie czyli:
        // A staje siÄ N, B przechodzi w O, i tak dalej aĹź do M, ktĂłre przechodzi w Z, potem siÄ to "zawija" czyli:
        // N przechodzi w A, O przechodzi w B, i tak dalej aĹź do Z, ktĂłre przechodzi w M.
        // poniewaĹź w alfabecie jest 26 (bez polskich znakĂłw!) liter to:
        // ROT13(ROT13(x)) = x
        // znaki specjalne nie zostajÄ zmieniane
        System.out.println(lab04string.rot13("Why did the chicken cross the road?"));
        System.out.println(lab04string.rot13("Gb trg gb gur bgure fvqr!"));


        System.out.println("\nPunkty: " + punkty + " (max 6, potem dodam 2 pkt za rot13, reszta za komentarze w javadoc).");
    }
}