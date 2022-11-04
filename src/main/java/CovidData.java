public class CovidData
{
    private String region;
    private String age;
    private int confirmed;
    private int dead;
    private int intensiveHospitalized;
    private int hospitalized;
    private String date;

    public CovidData(String region, String age, int confirmed, int dead, int intensiveHospitalized, int hospitalized, String date)
    {
        this.region = region;
        this.age = age;
        this.confirmed = confirmed;
        this.dead = dead;
        this.intensiveHospitalized = intensiveHospitalized;
        this.hospitalized = hospitalized;
        this.date = date;
    }

    public String getRegion() {
        return region;
    }

    public String getAge() {
        return age;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public int getDead() {
        return dead;
    }

    public int getIntensiveHospitalized() {
        return intensiveHospitalized;
    }

    public int getHospitalized() {
        return hospitalized;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString()
    {
        return
                "Region: " + region + "  " +
                        "Age: " + age + "  " +
                        "Confirmed: " + confirmed + "  " +
                        "Dead: " + dead + "  " +
                        "Intensive-Hospitalized: " + intensiveHospitalized + "  " +
                        "Hospitalized: " + hospitalized + "  " +
                        "Date: " + date;
    }
}