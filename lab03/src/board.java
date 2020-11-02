import java.lang.Math;

public class board {
    boolean[][] tab;
    int size_x;
    int size_y;
    board(int sizeX, int sizeY,int preset){
        size_x = sizeX;
        size_y = sizeY;
        tab = new boolean[sizeX][sizeY];
        start(preset);
    }

    void show(){
        for(int i = 0; i < size_x; i++){
            for(int j = 0; j < size_y; j++){
                if(tab[i][j] == true){
                    System.out.print("X");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
    void start(int preset){
        if(preset == 0){
            for(int i = 0; i < size_x; i++){
                for(int j = 0; j < size_y; j++) {
                    if(Math.random() > 0.5){
                        tab[i][j] = true;
                    }
                    else{
                        tab[i][j] = false;
                        }
                    }
                }
            return;
        }
        int center_x = (int)Math.ceil(size_x/2);
        int center_y = (int)Math.ceil(size_y/2);
        for(int i = 0; i < size_x; i++){
            for(int j = 0; j < size_y; j++) {
                tab[i][j] = false;
            }
        }
        if(preset == 1){
            tab[center_x][center_y] = true;
            tab[center_x+1][center_y] = true;
            tab[center_x-1][center_y] = true;
        }
        if(preset == 2){
            tab[center_x - 1][center_y] = true;
            tab[center_x - 1][center_y - 1] = true;
            tab[center_x - 1][center_y + 1] = true;
            tab[center_x][center_y - 1] = true;
            tab[center_x + 1][center_y] = true;
        }


    }
    void live(){
        boolean[][] new_tab = new boolean[size_x][size_x];
        for(int i = 0; i < size_x; i++){
            for(int j = 0; j < size_y; j++){
                new_tab[i][j] = check_if_live(i,j);
            }
        }
        for(int i = 0; i < size_x; i++){
            for(int j = 0; j < size_y; j++){
                tab[i][j] = new_tab[i][j];
            }
        }
    }

    boolean check_if_live(int i, int j){
        int neighbours = 0;
        for(int r = -1; r < 2; r++) {
            for (int c = -1; c < 2; c++) {
                if((r == 0)&&(c == 0))
                        continue;
                try {
                    if (tab[i + r][j + c] == true) {
                        neighbours += 1;
                    }
                }
                catch (Exception a){

                }

            }
        }
        if (tab[i][j] == false){
            if(neighbours == 3){
                return true;
            }
        }else{
            if((neighbours == 3 )||(neighbours == 2)){
                return true;
            }
        }
        return false;
    }
}

