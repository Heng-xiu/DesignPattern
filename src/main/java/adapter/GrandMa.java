package adapter;

public class GrandMa implements IHuman {
    private String sound;

    public GrandMa() {
        this.sound = "Hello LittleRedHood";
    }

    @Override
    public String makeHumanSound() {
        return sound;
    }
}
