/**
 * Troche nazwa nieudana, ale wyszlo tak w praniu, ze bedzie lepiej
 */
public class Food implements Product {
    boolean outdated = false;
    int day = 0;
    int validity;
    int soldPrice;
    int buyPrice;
    String name;
    public String getName(){
        return name;
    }
    Food(int validity, int buyPrice, int soldPrice, String name){
        this.validity = validity;
        this.buyPrice = buyPrice;
        this.soldPrice = soldPrice;
        this.name = name;
    }
    @Override
    public void nextDay() {
        day += 1;
    }

    @Override
    public int sellPrice() {
        return soldPrice;
    }

    @Override
    public int buyPrice() {
        return buyPrice;
    }

    @Override
    public boolean checkValidity() {
        if(day == validity){
            return false;
        }
        return true;
    }
}
