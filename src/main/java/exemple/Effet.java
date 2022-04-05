package exemple;

import bandeau.Bandeau;

public class Effet 
{

    private String effectType;

    public Effet(String type) 
    {
        this.effectType= type;
    }

    public void use(Bandeau bandeau) {}

    public String getEffectType()
    {
        return this.effectType;
    }
}