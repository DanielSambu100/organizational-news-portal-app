package models;

public class Department {
    private String departmentName;
    private String description;
    private int departmentId;
    private int numberOfEmployees;

    public Department(String departmentName, String description, int departmentId, int numberOfEmployees) {
        this.departmentName = departmentName;
        this.description = description;
        this.departmentId = departmentId;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return departmentId;
    }

    public void setId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

}
