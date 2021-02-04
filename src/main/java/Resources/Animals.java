package Resources;

public class Animals {

    private int id;
    private int pocetNohou;
    private String name;
    private boolean eatsWeed;

    public int getPocetNohou() {
        return pocetNohou;
    }

    public String getName() {
        return name;
    }

    public boolean isEatsWeed() {
        return eatsWeed;
    }

    public int getId() {
        return id;
    }

    public void setPocetNohou(int pocetNohou) {
        this.pocetNohou = pocetNohou;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEatsWeed(boolean eatsWeed) {
        this.eatsWeed = eatsWeed;
    }

    public void setId(int id) {
        this.id = id;
    }
}
