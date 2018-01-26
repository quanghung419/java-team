package vn.com.ntq_solution.java_team.javateam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/members")
public class MembersController {

    @RequestMapping(method = RequestMethod.GET)
    public String listMembers() {
        return "members";
    }

}
