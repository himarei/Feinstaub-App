
public class Temperatur
{
    
    private int tag;
    private int jahr;
    private double zeit;
    private double wert;
    
    public Temperatur(int t ,int j , double z, double w)
    {
        zeit = z;
        tag = t;
        jahr = j;
        wert = w;
    }
    
    private void setZeit(double z)
    {
        zeit = z;
    }
    
    private void setDatum(int t, int j)
    {
        tag = t;
        jahr = j;
    }
    
    private void setWert(double w)
    {
        wert = w;
    }
    
    public int getTag()
    {
        return tag;
    }
    
    public int getJahr()
    {
        return jahr;
    }
    
    public double getZeit()
    {
        return zeit;
    }
    
    public double getWert()
    {
        return wert;
    }
}