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
            Country contPL =  fileReader.readCountries().get("PL");
            System.out.println(contPL.getName()+contPL.getCode()+contPL.getPopulation());
        }else if (kod.equals("DE")){
           Country contDE =  fileReader.readCountries().get("DE");
           System.out.println(contDE);
        }else  if (kod.equals("FR")){
            Country contFR =  fileReader.readCountries().get("FR");
            System.out.println(contFR.getName()+contFR.getCode()+contFR.getPopulation());
        }else {
            System.out.println("Kraju nie ma na liście");
        }


   }
}
