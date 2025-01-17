package tripdiary.com.login.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import tripdiary.com.login.vo.LoginVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoginController {

    //회원가입
    ModelAndView addUser(@ModelAttribute("loginDTO") LoginVO loginVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
