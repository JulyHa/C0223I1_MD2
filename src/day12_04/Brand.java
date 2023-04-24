package day12_04;

public class Brand {
    private static int idUp = 1;
    private int id;
    private String name;

    public Brand() {
        this.id = idUp++;
    }

    public Brand(String name) {
        this.id = idUp++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ". " + name;
    }
}
