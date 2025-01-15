package tripdiary.com.login.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import tripdiary.com.login.dto.LoginDTO;

@Mapper
public interface LoginDAO {

    public void insertLogin(LoginDTO loginDTO) throws DataAccessException;
}
