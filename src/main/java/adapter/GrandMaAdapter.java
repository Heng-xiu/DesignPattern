package adapter;

public class GrandMaAdapter extends GrandMa {
    IBeat wolf;

    public GrandMaAdapter(IBeat woof) {
        this.wolf = woof;
    }

    @Override
    public String makeHumanSound() {
        return super.makeHumanSound();
    }
}
