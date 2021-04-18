package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import project.pojo.person;

import javax.annotation.Resource;

@Controller
public class controllerTest {
/*    @Value("1")
    private int i;*/
    private person p;
    @Autowired
    @Qualifier(value="person")
    public void setP(person p) {
        this.p = p;
    }

    @Resource(type = person.class)
    private person p2;


    @RequestMapping("/hello")
    public String test1(){
        System.out.println(p);
        return "success";

    }

}
