package ru.jmentor.controllers;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.servlet.ModelAndView;import ru.jmentor.service.UserService;@Controllerpublic class MainController {    private UserService service;    @Autowired    public void setService(UserService service) {        this.service = service;    }    @GetMapping(value = "/")    public ModelAndView viewLoginPage(ModelAndView modelAndView) {        modelAndView.setViewName("mainPage");        return modelAndView;    }}