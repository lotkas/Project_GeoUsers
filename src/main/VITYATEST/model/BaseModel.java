package VITYATEST.model;

public abstract class BaseModel {
    private Long id;

    public BaseModel(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}