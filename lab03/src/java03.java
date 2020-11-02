
public class java03 {
    public static void main(String args[]){
        int size_x = Integer.parseInt(args[0]);
        int size_y = Integer.parseInt(args[1]);
        int preset = Integer.parseInt(args[3]);
        int steps = Integer.parseInt(args[2]);

        board BoardGame = new board(size_x,size_y,preset);
        for(int i = 0; i < steps; i++){
            System.out.println("-".repeat(3) + i + "-".repeat(3));
            BoardGame.show();
            BoardGame.live();
        }

    }
}
