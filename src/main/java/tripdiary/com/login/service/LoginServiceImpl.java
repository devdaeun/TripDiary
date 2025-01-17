package tripdiary.com.login.service;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tripdiary.com.login.dao.LoginDAO;
import tripdiary.com.login.vo.LoginVO;

@Service("loginService")
public class LoginServiceImpl extends EgovAbstractServiceImpl implements LoginService {

    @Autowired
    private LoginDAO loginDAO;

    @Override
    public void addUser(LoginVO loginVO) throws Exception {
        loginDAO.insertLogin(loginVO);
    }
}
