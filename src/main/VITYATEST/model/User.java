package VITYATEST.model;

public class User extends BaseModel {           //POJO CLASS

    private String username;

    private String email;

    private String countryId;

    @Override
    public Long getId() {
        return super.getId();
    }

    public String getUsername() {
        return username;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getEmail() {
        return email;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
