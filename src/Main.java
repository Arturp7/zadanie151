import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        FileReader fileReader = new FileReader();
       // System.out.println(fileReader.readCountries());
        System.out.println("Podaj kod kraju o którym chcesz wyświeltlić informacje, do wyboru PL, FR , DE ");
        Scanner scan = new Scanner(System.in);
        String kod  = scan.nextLine();


            Country country =  fileReader.readCountries().get(kod);
            System.out.println(country);







   }
}
