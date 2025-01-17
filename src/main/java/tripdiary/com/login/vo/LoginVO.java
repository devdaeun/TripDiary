package tripdiary.com.login.vo;

import org.springframework.stereotype.Component;

import java.sql.Date;

public class LoginVO {

    private Long user_id;
    private String name;
    private String nickname;
    private String id;
    private String password;
    private String email;
    private Date birth;
    private Role role;
    private char user_stateus;

    public LoginVO() {

    }

    public enum Role {
        일반, 관리자
    }

    public LoginVO(Long user_id, String name, String nickname, String id, String password, String email, Date birth, Role role, char user_stateus) {
        this.user_id = user_id;
        this.name = name;
        this.nickname = nickname;
        this.id = id;
        this.password = password;
        this.email = email;
        this.birth = birth;
        this.role = role;
        this.user_stateus = user_stateus;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public char getUser_stateus() {
        return user_stateus;
    }

    public void setUser_stateus(char user_stateus) {
        this.user_stateus = user_stateus;
    }
}
