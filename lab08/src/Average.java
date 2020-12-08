public class Average {
    private int sum = 0;
    private int amount = 0;
    void add_to_average(int x){
        sum += x;
        amount += 1;
    }
    void add_to_average(String x) throws NumberFormatException{
        int n = (int)Double.parseDouble(x);
        sum += n;
        amount += 1;
    }

    double get_average() throws ArithmeticException{
        if(amount == 0)
            throw new ArithmeticException("Error - Cannot divide by 0");
        return (double)sum / amount;
    }
    public String toString(){
      return Double.toString(get_average());
    }

}
