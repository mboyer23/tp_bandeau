package exemple;

import bandeau.Bandeau;
import java.awt.Font;

public class Zoom extends Effet 
{

    public Zoom() {
        super("Effet Zoom");
    }

    @Override
    public void use(Bandeau bandeau) 
    {
        System.out.println(this.getEffectType());
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
    }
    
}