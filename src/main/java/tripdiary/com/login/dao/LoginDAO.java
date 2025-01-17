package tripdiary.com.login.dao;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.dao.DataAccessException;
import tripdiary.com.login.vo.LoginVO;
@Mapper("loginDAO")
public class LoginDAO {
    public void insertLogin(LoginVO loginVO) throws DataAccessException{

    };
}
