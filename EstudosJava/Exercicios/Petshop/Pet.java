package Exercicios.Petshop;

public class Pet {
    private final String name;

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
        this.clean = false; // 
    }

    private boolean clean;

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
