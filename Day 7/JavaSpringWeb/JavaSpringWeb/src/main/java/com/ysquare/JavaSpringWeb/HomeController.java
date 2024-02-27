package com.ysquare.JavaSpringWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @ModelAttribute("subject")
    public String courseName(){
        return "Java Spring";
    }
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/developer")
    public String developer() {
        return "developer";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpSession session) {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        session.setAttribute("result", num1 + num2);
        return "result";
    }

    @RequestMapping("/addDeveloper")
    public String addDeveloper(Developer developer) {
        return "developerResult";
    }

    @RequestMapping("/addDeveloper2")
    public String addDeveloper2(@ModelAttribute Developer developer) {
        return "developerResult";
    }


    @RequestMapping("/addDeveloper1")
    public ModelAndView addDeveloper1(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView modelAndView) {
        Developer developer = new Developer();
        developer.setAid(aid);
        developer.setAname(aname);

        modelAndView.addObject("developer", developer);
        modelAndView.setViewName("developerResult");
        return modelAndView;
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
