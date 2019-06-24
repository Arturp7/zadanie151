import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {


    Map<String, Country> readCountries() throws FileNotFoundException {
        String fileName = "Countries.csv";
        Scanner scanner = new Scanner(new File(fileName));
        Map<String, Country> readCountries = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            String[] split = nextLine.split(";");
            readCountries.put(split[0], new Country(split[0], split[1], Integer.valueOf(split[2])));

        }
        return readCountries;
    }


}
