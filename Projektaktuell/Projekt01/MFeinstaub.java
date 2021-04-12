import java.util.ArrayList;
import java.util.List;
public class MFeinstaub
{
    ArrayList<Feinstaub> messreiheF; 
    
    public MFeinstaub()
    {
        messreiheF = new ArrayList<Feinstaub>();
    }
    
    public ArrayList<Feinstaub> getArrayList()
    {
        return messreiheF;
    }
    
    public void ausgeben()
    {
        for (Feinstaub f : messreiheF)
        {
               System.out.println("Datum: "+ f.getTag() + f.getJahr() + "Zeit: " + f.getZeit() + "Wert: " + f.getWert());
        }
    }
}