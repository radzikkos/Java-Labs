import java.io.*;

public class lab08 {
    public static void main(String[] args) {

        String input_txt = args[0];

        Average average = new Average();
        try {
            File file = new File(input_txt);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;

            try {
                while ((st = br.readLine()) != null) {

                    try {
                        average.add_to_average(st);
                    }catch (NumberFormatException e){
                        System.out.println("In the file are lines which cannot be converted to int and I've omitted them");
                    }

                }
                try {

                    System.out.println(average.get_average());

                }catch (ArithmeticException e){
                    System.out.println(e.getMessage());
                }

            }catch (IOException e){
                System.out.println("Error - Wrong input");
            }
        }catch (FileNotFoundException e){
            System.out.println("Error - File not found");
        }

        String output_txt = args[1];
        try (FileWriter writer = new FileWriter(output_txt,true);
             BufferedWriter bw = new BufferedWriter(writer)) {
            try {
                bw.write(average.toString() + "\n");
            }catch (ArithmeticException e){
                System.out.println("Cannot count average");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

    }
}
