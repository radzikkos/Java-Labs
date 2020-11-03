/**
 * Implemented class on lab which represents some function for class String
 */
public class lab04string {
    /**
     *
     * @param obj A reference of obj
     * @return int which means that this is the lenght of obj
     */
    static int dlugosc(String obj){
        return obj.length();
    }

    /**
     *
     * @param obj A reference of obj
     * @param x char which is checking if exist and how many in obj
     * @return number of x in obj
     */
    static int ile_razy_literka_wystepuje(String obj, char x){

        int repeated = 0;
        for(int i = 0; i < obj.length(); i++){
            if (x == obj.charAt(i))
                repeated += 1;
        }
        return repeated;
    }

    /**
     * Check if two object are the same
     * @param obj1
     * @param obj2
     * @return
     */
    static boolean czy_takie_same(String obj1, String obj2){
        return obj1.equals(obj2);
    }

    /**
     * Reverse and obj and return new object
     * @param obj
     * @return
     */
    static String wspak(String obj){
        StringBuilder tempString = new StringBuilder();
        for(int i = 0; i < obj.length(); i++){
            tempString.append(obj.charAt(obj.length() - 1 - i));
        }

        return tempString.toString();
    }

    /**
     * Check if palindrom
     * @param obj
     * @return
     */
    static boolean czy_plaindrom(String obj){
        for(int i = 0; i < obj.length() / 2; i++){
            if(obj.charAt(i) != obj.charAt(obj.length() - 1 - i))
                return false;
        }
        return true;
    }

    /**
     * check if every next letter is next in alphabet
     * @param obj
     * @return
     */
    static boolean czy_abecadlowe(String obj){
        if(obj.length() == 1){
            return true;
        }
        for(int i = 0; i < obj.length() - 1; i++){
            if(obj.charAt(i) > obj.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Move every letter in obj by 13 positions
     * @param obj
     * @return
     */
    static String rot13(String obj){
        int rot = 13;
        int x ;
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < obj.length(); i++){
            x = (int)obj.charAt(i) + rot;
            if (x > 'z')
                x -= 26;
            temp.append((char)(x));
        }
        return temp.toString();
    }

}
