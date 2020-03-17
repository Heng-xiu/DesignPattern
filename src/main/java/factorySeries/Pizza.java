package factorySeries;

public abstract class Pizza {
    protected String dough;

    public void prepare(){
        System.out.println("Pizza prepare");
    }
    public void bake(){
        System.out.println("Pizza bake");
    }
    public void cut(){
        System.out.println("Pizza cut");
    }

    protected void setDough(String dough) {
        this.dough = dough;
    }
}
