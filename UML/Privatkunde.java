package UML;

public class Privatkunde extends Kunde {
    private String vorname;
    private String nachname;

    private final Adresse postAdresse;


    public Privatkunde(Konto[] konto, Adresse postAdresse) {
        super(konto);
        this.postAdresse = postAdresse;
    }
}
