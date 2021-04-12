import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Modell
{
    MTemperatur messreiheT;
    MLuftfeuchtigkeit messreiheL;
    MFeinstaub messreiheF;
    
    Main main;
    
    public Modell()
    {
        messreiheT = new MTemperatur();
        messreiheL = new MLuftfeuchtigkeit();
        messreiheF = new MFeinstaub();
        main = new Main();
        
        aktualisieren();
        ausgeben();
        
    }
    
    
    private void aktualisieren()
    {   
        main.aktualisieren();
        
    }
    
    private void ausgeben()
    {
        messreiheT.ausgeben();
        messreiheL.ausgeben();
        messreiheF.ausgeben();
    }
    
}