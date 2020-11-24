import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    int bilans = 0;
    List<Product> list = new ArrayList<Product>();
    void run(){
        boolean stop = false;
        while(true){
            //show_items();
            showMenu();
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()){
                case "1":{
                    add();
                    break;
                }
                case "2":{
                    sell();
                    break;
                }
                case "3":{
                    nextDay();
                    break;
                }
                case "4":{
                    showBilans();
                    break;
                }
                case "X":{
                    stop = true;
                    break;
                }
            }
            if(stop){
                break;
            }
        }
    }
    void showMenu(){
        System.out.println("1) Dodaj towar");
        System.out.println("2) Sprzedaj towar");
        System.out.println("3) Kolejny dzien");
        System.out.println("4) Bilans");
        System.out.println("X) Koniec programu");
    }
    void add(){
        System.out.println("1) Dodaj owoc");
        System.out.println("2) Dodaj warzywo");
        System.out.println("3) Dodaj agd");

        Scanner scanner = new Scanner(System.in);
        String whatToAdd = scanner.nextLine();

        System.out.println("Podaj nazwe");
        String name = scanner.nextLine();

        System.out.println("Podaj cene zakupu");
        int buyPrice = Integer.parseInt(scanner.nextLine());

        System.out.println("Podaj cene sprzedazy");
        int sellPrice = Integer.parseInt(scanner.nextLine());

        switch (whatToAdd){
            case "1":{
                list.add(new Fruit(1,buyPrice, sellPrice, name));
                break;
            }
            case "2":{
                list.add(new Vegetable(2,buyPrice, sellPrice, name));
                break;
            }
            case "3":{
                list.add(new AGD(buyPrice, sellPrice, name));
                break;
            }
        }
    }
    void show_items(){
        for(var el : list){
            System.out.println(el.getName());
        }
    }
    void nextDay(){
        List<Product> temp = new ArrayList<>();
        for(var el : list){
            el.nextDay();
            if(!el.checkValidity()){
                bilans -= el.buyPrice();
                //list.remove(el);
                temp.add(el);
            }
        }
        for (var el : temp){
            list.remove(el);
        }
    }
    void sell(){
        int i = 0;
        for(var el : list){
            System.out.println(i + " " + el.getName());
            i += 1;
        }
        Scanner scanner = new Scanner(System.in);
        int whatToSell = Integer.parseInt(scanner.nextLine());
        bilans += list.get(whatToSell).sellPrice() - list.get(whatToSell).buyPrice();
        list.remove(whatToSell);
    }
    void showBilans(){
        System.out.println(bilans);
    }

}
