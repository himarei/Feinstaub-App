import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Modell
{
    MTemperatur messreiheT;
    MLuftfeuchtigkeit messreiheL;
    MFeinstaub messreiheF;
    
    Messstation messstation;
    
    public Modell()
    {
        
        messstation = new Messstation();
        
        aktualisieren();
        ausgeben();
        
    }
    
    
    private void aktualisieren()
    {   
        messstation.aktualisieren();
        
    }
    
    private void ausgeben()
    {
        messreiheT.ausgeben();
        messreiheL.ausgeben();
        messreiheF.ausgeben();
    }
    
}