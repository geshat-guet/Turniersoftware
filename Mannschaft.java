
/**
 * Beschreiben Sie hier die Klasse Mannschaft.
 * 
 * @author guet 
 * @version 2024
 */
public class Mannschaft
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private Spieler[] spieler;
    
    private int turnierpunkte;

    /**
     * Konstruktor für Objekte der Klasse Mannschaft
     */
    public Mannschaft(String pName)
    {
        name = pName;
        spieler = new Spieler[6];
        turnierpunkte = 0;
    }

    public void spielerHinzufuegen(Spieler pNeuerSpieler, int pPosition)
    {
        spieler[pPosition] = pNeuerSpieler;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setTurnierpunkte(int punkte) 
    { 
        this.turnierpunkte = punkte; 
    }
}
