package exemple;
import bandeau.Bandeau;

public class Spin extends Effet {

    public Spin() {
        super("Effet Spin");
    }

    @Override
    public void use(Bandeau bandeau) {
        System.out.println(this.getEffectType());
        for (int i = 0; i <= 100; i++) {
            bandeau.setRotation(2 * Math.PI * i / 100);
            bandeau.sleep(30);
        }
    }
    
}