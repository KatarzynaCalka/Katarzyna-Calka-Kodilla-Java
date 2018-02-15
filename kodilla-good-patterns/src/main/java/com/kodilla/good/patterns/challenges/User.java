package com.kodilla.good.patterns.challenges;

public class User {

    private String UserName;
    private String UserSurname;
    private String UserAddressEmail;
    private String UserTelNumber;

    public User(String userName, String userSurname, String userAddressEmail, String userTelNumber) {
        UserName = userName;
        UserSurname = userSurname;
        UserAddressEmail = userAddressEmail;
        UserTelNumber = userTelNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserSurname() {
        return UserSurname;
    }

    public String getUserAddressEmail() {
        return UserAddressEmail;
    }

    public String getUserTelNumber() {
        return UserTelNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!UserName.equals(user.UserName)) return false;
        if (!UserSurname.equals(user.UserSurname)) return false;
        if (!UserAddressEmail.equals(user.UserAddressEmail)) return false;
        return UserTelNumber.equals(user.UserTelNumber);
    }

    @Override
    public int hashCode() {
        int result = UserName.hashCode();
        result = 31 * result + UserSurname.hashCode();
        result = 31 * result + UserAddressEmail.hashCode();
        result = 31 * result + UserTelNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserSurname='" + UserSurname + '\'' +
                ", UserAddressEmail='" + UserAddressEmail + '\'' +
                ", UserTelNumber='" + UserTelNumber + '\'' +
                '}';
    }
}
