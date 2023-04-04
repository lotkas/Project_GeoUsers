package VITYATEST.model;

public class Country extends BaseModel {         //POJO CLASS
    private String name;

    public Country(Long id, String name) {
        super(id);
        this.name = name;

    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Country{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                '}';
    }
}