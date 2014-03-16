package com.realtech.web;

import com.realtech.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pc on 16/03/14.
 */
@Controller
public class HelloController {
    @Autowired
    private CampaignService campaignService;

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return this.campaignService.sayHello();
    }
}
