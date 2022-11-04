import java.util.Comparator;

public class RegionComparator implements Comparator<CovidData> {
    public int compare(CovidData d1, CovidData d2){
        return d1.getRegion().compareTo(d2.getRegion());
    }



}
