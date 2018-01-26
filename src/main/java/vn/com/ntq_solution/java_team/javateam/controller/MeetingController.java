package vn.com.ntq_solution.java_team.javateam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/meeting")
public class MeetingController {

    @RequestMapping(method = RequestMethod.GET)
    public String recentActivity() {
        return "activity";
    }

}
