package exemple;
import java.util.*;

import bandeau.Bandeau;

public class Scenario 
{
    private List<Effet> leffets = new ArrayList<Effet>() ;

    public Scenario ()
    {
        this.leffets = new ArrayList<Effet>();
    }

    public void start (Bandeau bandeau)
    {
        for (Effet effet : leffets)
        {
            effet.use(bandeau);
        }
    }

    public void add (Bandeau bandeau, Effet effet, int repetitions)
    {
        for(int i=1; i <= repetitions; i++)
        {
            this.leffets.add(effet);    
        }
    }

}
