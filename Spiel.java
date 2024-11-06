
/**
 * Beschreiben Sie hier die Klasse Spiel.
 * 
 * @author GUET
 * @version 2024
 */
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Mannschaft manA;
    private Mannschaft manB;

    private int spielstandA;
    private int spielstandB;

    private String status;

    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel(Mannschaft pMan1, Mannschaft pMan2)
    {
        // Instanzvariablen initialisieren
        manA = pMan1;
        manB = pMan2;

        spielstandA = 0;
        spielstandB = 0;

        status = "nicht gestartet";
    }

    public void erhoeheSpielstandA()
    {
        spielstandA = spielstandA +1;
    }

    public void erhoeheSpielstandB()
    {
        spielstandB = spielstandB +1;
    }

    public void ergebnisEintragen(int pErgebnisA, int pErgebnisB)
    {
        if(status == "gestartet") 
        {
            spielstandA = pErgebnisA;
            spielstandB = pErgebnisB;
            status = "beendet";
        }
    }

    public void starteSpiel()
    {
        status = "gestartet";
    }

    public void beendeSpiel()
    {
        status = "beendet";
    }

    /********   set- und get- Methoden ****************/
    public String getStatus()
    {
        return status;
    }

    public String getNameMannschaftA()
    {
        return manA.getName();
    }

    public String getNameMannschaftB()
    {
        return manB.getName();
    }

    public String getSpielstand()
    {
        return "" + spielstandA + " : " + spielstandB;
    }
}
