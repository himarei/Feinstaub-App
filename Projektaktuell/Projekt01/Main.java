import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main
{
    MTemperatur messreiheT;
    MLuftfeuchtigkeit messreiheL;
    MFeinstaub messreiheF;
    
    public Main()
    {
        messreiheT = new MTemperatur();
        messreiheL = new MLuftfeuchtigkeit();
        messreiheF = new MFeinstaub();
        
        aktualisieren();
        
    }
    
    
    public void aktualisieren()
    {   int tag = (int) (Math.random()*365);
        int jahr = 2021;
        double zeit = ((int) ((Math.random()*24)*100))/100;
        double wertT = ((int) ((Math.random()*10)*100))/100;
        double wertL = ((int) ((Math.random()*100)*100))/100;
        double wertF = ((int) ((Math.random()*10)*100))/100;
        
        messreiheT.getArrayList().add(new Temperatur( tag , jahr , zeit ,  wertT));
        messreiheL.getArrayList().add(new Luftfeuchtigkeit( tag , jahr , zeit ,  wertL));
        messreiheF.getArrayList().add(new Feinstaub( tag , jahr , zeit ,  wertF));
        
    }
    
    }
    
