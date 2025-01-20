package tripdiary.com.login.service;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tripdiary.com.login.dao.LoginDAO;
import tripdiary.com.login.vo.LoginVO;

import javax.annotation.Resource;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Resource(name="loginDAO")
    public LoginDAO loginDAO;

    @Override
    public int insertMember(LoginVO vo) throws Exception {
        return loginDAO.insertMember(vo);
    }
}
