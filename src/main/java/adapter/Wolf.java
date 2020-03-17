package adapter;

public class Wolf implements IBeat{
    private String sound;

    public Wolf() {
        this.sound = "Ohhhhhhh";
    }

    @Override
    public String makeSound() {
        return sound;
    }
}
