import java.util.ArrayList;
import java.util.List;

public class Messstation
{
    ArrayList<Messreihe> vieleMessreihen;
    
    String senseBoxId;
    public Messstation(String senseBoxId_)
    { senseBoxId  = senseBoxId_;
        vieleMessreihen = new ArrayList<Messreihe>();
        OpenSenseMap oSM = new OpenSenseMap(senseBoxId, vieleMessreihen);
        oSM.nameEinlesen();
        oSM.sensorenEinlesen();
    }
    
    
    
    
    }
    
