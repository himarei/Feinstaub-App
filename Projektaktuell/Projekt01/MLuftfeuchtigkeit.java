import java.util.ArrayList;
import java.util.List;
public class MLuftfeuchtigkeit
{
    ArrayList<Luftfeuchtigkeit> messreiheL; 
    
    public MLuftfeuchtigkeit()
    {
        messreiheL = new ArrayList<Luftfeuchtigkeit>();
    }
    
    public ArrayList<Luftfeuchtigkeit> getArrayList()
    {
        return messreiheL;
    }
    
    public void ausgeben()
    {
        for (Luftfeuchtigkeit l : messreiheL)
        {
               System.out.println("Datum: "+ l.getTag() + l.getJahr() + "  Zeit: " + l.getZeit() + "  Wert: " + l.getWert());
        }
    }
}