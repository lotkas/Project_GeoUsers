package VITYATEST.model;

public class User extends BaseModel {           //POJO CLASS

    private String username;

    private String email;

    private Long countryId;

    public User(Long id, String username, String email, Long countryId) {
        super(id);
        this.username = username;
        this.email = email;
        this.countryId = countryId;
    }
    public Long getCountryId() {
        return countryId;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", countryId=" + countryId +
                '}';
    }
}