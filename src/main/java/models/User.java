package models;

import java.util.Objects;

public class User {
    private String userName;
    private int userId;
    private String position;
    private String role;
//    for one-to-many r/ship
    private int departmentId;

    public User(String userName, int userId, String position, String role, int departmentId) {
        this.userName = userName;
        this.userId = userId;
        this.position = position;
        this.role = role;
        this.departmentId = departmentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && departmentId == user.departmentId && Objects.equals(userName, user.userName) && Objects.equals(position, user.position) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userId, position, role, departmentId);
    }
}
