package adapter;

public class LittleRedHood implements IHuman {
    private String sound;

    public LittleRedHood() {
        this.sound = "No time long see GrandMa";
    }

    @Override
    public String makeHumanSound() {
        return sound;
    }
}
