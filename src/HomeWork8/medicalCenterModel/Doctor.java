package HomeWork8.medicalCenterModel;

public class Doctor extends Person {
    private String email;
    private String profession;

    public Doctor() {
    }

    public Doctor(String id, String name, String surname, String phone,
                  String email, String profession) {
        super(id, name, surname, phone);
        this.email = email;
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}

