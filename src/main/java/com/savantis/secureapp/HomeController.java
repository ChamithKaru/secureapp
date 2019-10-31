package com.savantis.secureapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.savantis.secureapp - HomeController.java
 *
 * @author Chamith Karunakalage {chamith.karunakalage@savantis.com}
 * @since Oct 31, 2019
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }
}
