package tripdiary.com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tripdiary.com.login.dto.LoginDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/login")
public class LoginControllerImpl implements LoginController {

    @Override
    public ModelAndView addUser(LoginDTO loginDTO, HttpServletRequest request, HttpServletResponse response) throws Exception {

        return null;
    }
}
