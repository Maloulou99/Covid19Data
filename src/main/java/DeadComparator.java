import java.util.Comparator;

public class DeadComparator implements Comparator<CovidData> {
    public int compare(CovidData d1, CovidData d2){
        return d1.getDead() - d2.getDead();
    }
}
