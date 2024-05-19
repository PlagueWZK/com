package Exercise.houserent.domain;

import Exercise.houserent.util.HouseRentUtil;


public class House {
    private final int id;
    private String name;
    private String telephone;
    private String address;
    private double rent;
    private String status;


    public House(int id, String name, String telephone, String address, double rent, String status) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rent = rent;
        this.status = status;
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

    public void setStatus() {
        String status;
        while (true) {
            status = HouseRentUtil.readKeyBoard(3, false);
            if (status.equals("未出租") || status.equals("已出租")) {
                this.status = status;
                return;
            } else if (status.equals("1") || status.equals("2")) {
                this.status = (status.equals("1")) ? ("未出租") : ("已出租");
                return;
            } else {
                System.out.println("输入有误！(未出租[1] OR 已出租[2])");
            }

        }


    }

    @Override
    public String toString() {
        return String.format("%-8s", this.id) + String.format("%-12s", this.name)
                + String.format("%-16s", this.telephone) + String.format("%-16s", this.address)
                + String.format("%-12s", this.rent) + String.format("%-8s", this.getStatus()) + "\n";
    }
}
