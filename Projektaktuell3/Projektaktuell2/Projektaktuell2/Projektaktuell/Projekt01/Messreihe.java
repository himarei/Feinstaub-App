import java.util.ArrayList;
import java.util.List;

public class Messreihe
{
    ArrayList<Messung> messreihe; 
    String id;
    String title;
    String einheit;
    
    public Messreihe(String id_, String title_, String einheit_)
    {
        id = id_;
        title = title_;
        einheit = einheit_;
        messreihe = new ArrayList<Messung>();
    }
    
    public ArrayList<Messung> getArrayList()
    {
        return messreihe;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    
    public void ausgeben()
    {
        for (Messung t : messreihe)
        {
        }
    }
}