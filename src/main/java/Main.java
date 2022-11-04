import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<CovidData> allData = new ArrayList<>();

        File f = new File("Java noegletal_pr_region_pr_aldersgruppe.csv");

        try
        {
            Scanner sc = new Scanner(f, StandardCharsets.ISO_8859_1);
            while (sc.hasNext())
            {
                String line = sc.nextLine();
                String[] attributes = line.split(";");

                CovidData readData = new CovidData(
                        attributes[0],
                        attributes[1],
                        Integer.parseInt(attributes[2]),
                        Integer.parseInt(attributes[3]),
                        Integer.parseInt(attributes[4]),
                        Integer.parseInt(attributes[5]),
                        attributes[6]);

                allData.add(readData);
            }
            for (CovidData cd : allData)
            {
                System.out.println(cd);
            }
        }

        catch (Exception e)
        {
            System.out.println("Fejl i indlæsning: " + e.getMessage());
        }
    }
}