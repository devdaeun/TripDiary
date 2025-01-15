package tripdiary.Qna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tripdiary.Qna.service.QnaServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class QnaControllerImpl implements QnaController{

    @Autowired
    private QnaServiceImpl qnaService;

    //Qna작성하기
    @Override
    @RequestMapping("/qna/qnaFrom.do")
    public ModelAndView qnaFrom(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //ModelAndView mav = ModelAndView();
    }

}
