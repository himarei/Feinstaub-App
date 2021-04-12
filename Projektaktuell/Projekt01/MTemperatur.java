import java.util.ArrayList;
import java.util.List;

public class MTemperatur
{
    ArrayList<Temperatur> messreiheT; 
    
    public MTemperatur()
    {
        messreiheT = new ArrayList<Temperatur>();
    }
    
    public ArrayList<Temperatur> getArrayList()
    {
        return messreiheT;
    }
    
    public void ausgeben()
    {
        for (Temperatur t : messreiheT)
        {
               System.out.println("Datum: "+ t.getTag() + t.getJahr() + "Zeit: " + t.getZeit() + "Wert: " + t.getWert());
        }
    }
}