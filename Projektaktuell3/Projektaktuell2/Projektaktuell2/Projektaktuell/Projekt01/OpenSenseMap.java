import java.util.*;

import org.json.*;

/**
 * Regelt den Zugriff auf die OpenSenseMap
 */
public class OpenSenseMap implements SenseMap
{
    private JSONObject boxDaten;
    private String senseBoxId; 
    private ArrayList<Messreihe> vieleMessreihen;

    private String API_URL = "https://api.opensensemap.org/";
    public OpenSenseMap(String senseBoxId_, ArrayList<Messreihe> vieleMessreihen_)
    {
        senseBoxId = senseBoxId_;
        vieleMessreihen = vieleMessreihen_;
        boxDaten = holeSenseBoxDaten();       
    }

    public String nameEinlesen()
    {
        if (boxDaten != null)
        {
            System.out.println(boxDaten.getString("name"));
            return boxDaten.getString("name");
            
        }
        return "Keine Box gefunden";
    }

    public ArrayList<Messreihe> sensorenEinlesen()
    {
        //ArrayList<Messreihe> liste = new ArrayList<Messreihe>();
        if (boxDaten != null)
        {
            JSONArray sensorenJSON = boxDaten.getJSONArray("sensors");

            int maxAnzahl = 8;
            int anzahl = sensorenJSON.length();
            if (anzahl > 8)
            {
                anzahl = 8;
            }

            for (int i = 0; i < anzahl; i++)
            {
                JSONObject sensorJSON = sensorenJSON.getJSONObject(i);
                String title = sensorJSON.getString("title");
                String id = sensorJSON.getString("_id");
                String einheit = sensorJSON.getString("unit");
                Messreihe messreihe = new Messreihe(id, title, einheit);
                vieleMessreihen.add(messreihe);
            }
        }
        for (Messreihe m : vieleMessreihen)
        {
        System.out.println(m.getTitle());
    }
        return vieleMessreihen;
    }

    public Messung getAktMessung(String sensorId)
    {
        String sensorInfos = HTTPAnfrage.get(API_URL,"/boxes/" + senseBoxId+ "/sensors/" + sensorId);
        JSONObject infosJSON = new JSONObject(sensorInfos);
        JSONObject letzteMessungJSON = infosJSON.getJSONObject("lastMeasurement");
        String wertS = letzteMessungJSON.getString("value");
        double wert = Double.parseDouble(wertS);
        String erzeugtAm = letzteMessungJSON.getString("createdAt");
        Messung messung = new Messung(wert,erzeugtAm);
        return messung;
    }

    public ArrayList<Messung> getVieleMessungen(String sensorId)
    {
        ArrayList<Messung> liste = new ArrayList<Messung>();
        String messungen = HTTPAnfrage.get(API_URL,"/boxes/" + senseBoxId + "/data/" + sensorId);
        JSONArray messungenJSON = new JSONArray(messungen);

        for (int i = 0; i < messungenJSON.length(); i++)
        {
            JSONObject messungJSON = messungenJSON.getJSONObject(i);
            Double wert = Double.parseDouble(messungJSON.getString("value"));
            String erzeugtAm = messungJSON.getString("createdAt");
            Messung messung = new Messung(wert,erzeugtAm);
            liste.add(messung);
        }
        return liste;
    }

    private JSONObject holeSenseBoxDaten()
    {
        String senseBoxDatenJsonString = HTTPAnfrage.get(API_URL,"/boxes/"+senseBoxId);
        JSONObject daten = null;
        if (senseBoxDatenJsonString != null) 
        {
            daten = new JSONObject(senseBoxDatenJsonString);
        }
        System.out.println("Daten erfolgreich eingelesen :)");
        return daten;
        
    }

   
   
}
