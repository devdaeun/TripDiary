package tripdiary.com.login.service;

import tripdiary.com.login.vo.LoginVO;

public interface LoginService {

    //화면 등록 처리 (저장)
    public int insertMember(LoginVO vo) throws Exception;
}
