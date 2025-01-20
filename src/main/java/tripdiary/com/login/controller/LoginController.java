package tripdiary.com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tripdiary.com.login.service.LoginService;
import tripdiary.com.login.vo.LoginVO;

import javax.annotation.Resource;

@Controller
public class LoginController {

    //다른 클래스 메소드를 사용하기 위해 선언 필요
    @Resource(name="loginService")
    public LoginService loginService;

    //회원 등록 화면
    @RequestMapping("/memberForm.do")
    public String addUser() {

        return "login/memberForm";
    }

    //회원 등록 처리(저장)
    @RequestMapping("/memberSave.do")
    @ResponseBody
    public String insertMember(LoginVO vo) throws Exception {

        String msg = "";

        int result = loginService.insertMember(vo);

//        if (result == 1) {
//            msg = "ok";
//        }

        return msg;
    }
}
