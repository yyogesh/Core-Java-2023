package com.ysquare.JavaSpringWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpSession session) {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        session.setAttribute("result", num1 + num2);
        return "result";
    }

    @RequestMapping("/sum")
    public ModelAndView sum(@RequestParam("num1") int numFN, @RequestParam("num2") int numSf, ModelAndView modelAndView) {
        modelAndView.addObject("result", numFN + numSf);
        modelAndView.setViewName("result");
        return modelAndView;
    }

    @RequestMapping("/sum3")
    public String sum3(@RequestParam("num1") int numFN, @RequestParam("num2") int numSf, Model model) {
        model.addAttribute("result", numFN + numSf);
        return "result";
    }

    @RequestMapping("/sum1")
    public String sum1(int num1, int num2, HttpSession session) {
        session.setAttribute("result", num1 + num2);
        return "result.jsp";
    }

    @RequestMapping("/sum2")
    public String sum2(@RequestParam("num1") int numFN, @RequestParam("num2") int numSf, HttpSession session) {
        session.setAttribute("result", numFN + numSf);
        return "result.jsp";
    }


}
