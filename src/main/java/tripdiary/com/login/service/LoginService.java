package tripdiary.com.login.service;

import tripdiary.com.login.dto.LoginDTO;

public interface LoginService {

    public void addUser(LoginDTO loginDTO) throws Exception;
}
