public class AGD extends Food {
    AGD( int buyPrice, int soldPrice, String name) {
        super(0, buyPrice, soldPrice, name);
    }

    @Override
    public boolean checkValidity() {
        return true;
    }
}
