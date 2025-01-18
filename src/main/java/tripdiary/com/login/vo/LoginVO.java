package tripdiary.com.login.vo;

import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
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

}
