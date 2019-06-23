import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        FileReader fileReader = new FileReader();
       // System.out.println(fileReader.readCountries());
        System.out.println("Podaj kod kraju o którym chcesz wyświeltlić informacje, do wyboru PL, FR , DE ");
        Scanner scan = new Scanner(System.in);
        String kod  = scan.nextLine();
        if(kod.equals("PL")) {
            System.out.println(fileReader.readCountries().get("PL"));
        }else if (kod.equals("DE")){
            System.out.println(fileReader.readCountries().get("DE"));
        }else  if (kod.equals("FR")){
            System.out.println(fileReader.readCountries().get("FR"));
        }else {
            System.out.println("Kraju nie ma na liście");
        }


   }
}
