package tripdiary.com.login.dao;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import tripdiary.com.login.vo.LoginVO;

@Mapper
@Repository("loginDAO")
public class LoginDAO extends EgovAbstractMapper {

    public int insertMember(LoginVO vo) {
        return insert("loginDAO.insertMember", vo);
    }
}
