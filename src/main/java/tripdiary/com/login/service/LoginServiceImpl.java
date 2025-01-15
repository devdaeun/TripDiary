package tripdiary.com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tripdiary.com.login.dao.LoginDAO;
import tripdiary.com.login.dto.LoginDTO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDAO loginDAO;

    @Override
    public void addUser(LoginDTO loginDTO) throws Exception {
        loginDAO.insertLogin(loginDTO);
    }
}
