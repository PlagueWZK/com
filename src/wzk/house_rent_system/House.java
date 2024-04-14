package wzk.house_rent_system;

public class House {
    private final int id;
    private String name;
    private String telephone;
    private String address;
    private double rent;
    private String status;
    private String password;

    public House(int id, String name, String telephone, String address, double rent, String status, String password) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rent = rent;
        this.status = status;
        this.password = password;
    }


    @Override
    public String toString() {
        return String.format("%-4s", getId()) + String.format("%-8s", getName()) + String.format("%-20s", getTelephone()) +
                String.format("%-16s", getAddress()) + String.format("%-8s", getRent()) + String.format("%-4s", getStatus());
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
