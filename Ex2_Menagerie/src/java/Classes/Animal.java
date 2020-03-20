package Classes;

/**
 *
 * @author Rivière Eloi
 */
public abstract class Animal {
    private String nom;
    private String race;
    
    public Animal(String nom, String race)
    {
        setNom(nom);
        setRace(race);
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public String getRace()
    {
        return this.race;
    }
    
    private void setNom(String nom)
    {
        this.nom = nom;
    }
    
    private void setRace(String race)
    {
        this.race = race;
    }
    
    public abstract String cri();
    
    @Override
    public String toString()
    {
        return this.getNom() + ", le " + this.getRace();
    }
}
