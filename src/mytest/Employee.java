package mytest;

public class Employee {
    private  int id;
    private String name;
    private String gender;

    private boolean married;
    private String husbandName;

    public Employee(int id, String name, String gender, boolean married) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.married = married;
    }

    public Employee(int id, String name, String gender, boolean married, String husbandName) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.married = married;
        this.husbandName = husbandName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", married=" + married +
                ", husbandName='" + husbandName + '\'' +
                '}';
    }
}
