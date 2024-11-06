
/**
 * Beschreiben Sie hier die Klasse Turnier.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Turnierplan
{
    Mannschaft[] mannschaften = new Mannschaft[4];
    Spiel[] spielplan = new Spiel[40];

    /**
     * Konstruktor für Objekte der Klasse Turnier
     * 
     */
    public Turnierplan()
    {
        // hier müssten Abfragen nach den Mannschaften
        // usw. rein: Wie viele Mitspieler, wie viele Mannschaften
        // welches Turniersystem, ...
    }

    /**
     * Mannschaften eintragen
     * Turnierplan erstellen (turnierKonfigurieren)
     * loop: Spiel starten
     *       Spiel erfassen
     *       Spiel beenden
     */
    public void starteTurnier()
    {
        // Mannschaften eintragen

        // Neue Mannschaft erstellen:
        // Erstellen von Mannschaften
        Mannschaft m1 = new Mannschaft("Die wilde 13");
        Mannschaft m2 = new Mannschaft("Schnelles Ende");
        Mannschaft m3 = new Mannschaft("Die Unbesiegbaren");
        Mannschaft m4 = new Mannschaft("Die Blauen Besten");

        mannschaften[0] = m1;
        mannschaften[1] = m2;
        mannschaften[2] = m3;
        mannschaften[3] = m4;
        
        // Erstellen von Spielern und Hinzufügen zu den Mannschaften
        m1.spielerHinzufuegen(new Spieler("Mustermann", "Max"), 0);
        m1.spielerHinzufuegen(new Spieler("Musterfrau", "Maria"), 1);
        m1.spielerHinzufuegen(new Spieler("Schmidt", "Peter"), 2);
        m1.spielerHinzufuegen(new Spieler("Schulze", "Anna"), 3);
        m1.spielerHinzufuegen(new Spieler("Meyer", "Thomas"), 4);
        m1.spielerHinzufuegen(new Spieler("Nowak", "Julia"), 5);

        m2.spielerHinzufuegen(new Spieler("Miller", "John"), 0);
        m2.spielerHinzufuegen(new Spieler("Johnson", "Emma"), 1);
        m2.spielerHinzufuegen(new Spieler("Davis", "David"), 2);
        m2.spielerHinzufuegen(new Spieler("Rodriguez", "Sophia"), 3);
        m2.spielerHinzufuegen(new Spieler("Wilson", "Oliver"), 4);
        m2.spielerHinzufuegen(new Spieler("Anderson", "Charlotte"), 5);

        m3.spielerHinzufuegen(new Spieler("Thomas", "Lisa"), 0);
        m3.spielerHinzufuegen(new Spieler("Hernandez", "Daniel"), 1);
        m3.spielerHinzufuegen(new Spieler("Martinez", "Olivia"), 2);
        m3.spielerHinzufuegen(new Spieler("Taylor", "Noah"), 3);
        m3.spielerHinzufuegen(new Spieler("Moore", "Ava"), 4);
        m3.spielerHinzufuegen(new Spieler("Baker", "Ethan"), 5);

        m4.spielerHinzufuegen(new Spieler("Lee", "Emily"), 0);
        m4.spielerHinzufuegen(new Spieler("Gonzalez", "Benjamin"), 1);
        m4.spielerHinzufuegen(new Spieler("Wilson", "Mia"), 2);
        m4.spielerHinzufuegen(new Spieler("Brown", "Liam"), 3);
        m4.spielerHinzufuegen(new Spieler("James", "Sophia"), 4);
        m4.spielerHinzufuegen(new Spieler("Miller", "Oliver"), 5);
        
        turnierKonfigurieren();
    }

    /**
     * Gewinner anzeigen
     */
    public void beendeTurnier()
    {

    }

    /**
     * Turnierplan erstellen
     * Liste der Spiele erstellen
     */
    public void turnierKonfigurieren()
    {
        // Turnierplan erstellen (Vorrunde)
        spielplan[0] = new Spiel(mannschaften[0], mannschaften[1]);
        spielplan[1] = new Spiel(mannschaften[0], mannschaften[2]);
        spielplan[2] = new Spiel(mannschaften[0], mannschaften[3]);
        spielplan[3] = new Spiel(mannschaften[1], mannschaften[2]);
        spielplan[4] = new Spiel(mannschaften[1], mannschaften[3]);
        spielplan[5] = new Spiel(mannschaften[2], mannschaften[3]);

        // TODO: Weitere Spiele eintragen

    }
    
    public void alleSpieleAusgeben()
    {
        for(int i=0; i < spielplan.length; i++)
        {
            if(spielplan[i] != null)
            {
                // Spiel holen:
                Spiel aktuell = spielplan[i];
                
                System.out.println("Spielnummer " + (i+1) + "---------------------------------------------");
                System.out.println("Es spielen " + aktuell.getNameMannschaftA() + " gegen " +aktuell.getNameMannschaftB());
                System.out.println("Spielstand " + aktuell.getSpielstand());
                System.out.println("Status: "+ aktuell.getStatus());
            }
        }
    }

}
