package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bo.BO;
import com.model.Person;

@Controller
public class Mycontroller {

    @Autowired
    private BO bo;

    @RequestMapping(value = "/")
    public String Home() {
        return "Home";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/Login")
    public String login() {
        return "Login";
    }

    // ✅ Inserts person, then redirects to /show (which loads list)
    @RequestMapping(value = "/insert")
    public String insert(HttpServletRequest request) {
        Person p = new Person();
        p.setName(request.getParameter("name"));
        p.setGender(request.getParameter("ugender"));
        p.setAddress(request.getParameter("address"));
        p.setCity(request.getParameter("ucity"));
        p.setState(request.getParameter("ustate"));
        p.setEmail(request.getParameter("uemail"));
        p.setPassword(request.getParameter("upassword"));

        bo.inserData(p);

        return "redirect:/show"; // ✅ redirect to re-fetch and show updated list
    }

    // ✅ Displays person list on show.jsp
    @RequestMapping("/show")
    public String show(ModelMap map) {
        List<Person> list = bo.viewdata();
        map.addAttribute("list", list); // matches request.getAttribute("list") in show.jsp
        return "show";
    }

    // ✅ Deletes person and redirects to show
    @RequestMapping(value = "/delete")
    public String delete(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        bo.deletedata(id);
        return "redirect:/show";
    }

    // ✅ Loads person data for editing
    @RequestMapping(value = "/edit")
    public String edit(HttpServletRequest request, ModelMap map) {
        int id = Integer.parseInt(request.getParameter("id"));
        Person p = bo.getPersonById(id);
        map.addAttribute("p", p); // used in update.jsp
        return "update";
    }

    // ✅ Updates person and redirects to show
    @RequestMapping(value = "/update")
    public String update(HttpServletRequest request) {
        Person p = new Person();
        p.setId(Integer.parseInt(request.getParameter("id")));
        p.setName(request.getParameter("name"));
        p.setGender(request.getParameter("ugender"));
        p.setAddress(request.getParameter("address"));
        p.setCity(request.getParameter("ucity"));
        p.setState(request.getParameter("ustate"));
        p.setEmail(request.getParameter("uemail"));
        p.setPassword(request.getParameter("upassword"));

        bo.updatedata(p);
        return "redirect:/show";
    }
}
