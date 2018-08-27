package models;

public class Register {
    private String username;
    private String password;
    private String name;
    private String add;
    private String email;
    private String tel;


    public Register() {
    }

    public Register(String username, String password, String name, String add, String email, String tel) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.add = add;
        this.email = email;
        this.tel = tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}