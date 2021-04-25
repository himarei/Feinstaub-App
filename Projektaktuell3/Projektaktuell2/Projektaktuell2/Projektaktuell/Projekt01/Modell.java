import java.util.ArrayList;
import java.util.List;
public class Modell
{
    
    Messstation messstation;
    
    String senseBoxId;
    
    public Modell()
    {
        senseBoxId = "606dabb74393eb001ca6a781";
        
        messstation = new Messstation(senseBoxId);
        
        
        
    }
    
}