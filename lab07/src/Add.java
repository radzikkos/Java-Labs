public class Add {
    public int add(int ... tab){
        int sum = 0;
        for(var elem : tab){
            System.out.print(elem + " ");
            sum += elem;
        }
        System.out.println(" = " + sum);
        return sum;
    }
}
