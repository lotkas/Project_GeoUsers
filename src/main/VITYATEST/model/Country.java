package VITYATEST.model;

public class Country extends BaseModel {         //POJO CLASS
    private String name;
    private Long id;

    @Override
    public Long getId() {
        return super.getId();
    }

    public String getName() {
        return name;
    }

    public void setCountry(String name) {
        this.name = name;
    }
}

