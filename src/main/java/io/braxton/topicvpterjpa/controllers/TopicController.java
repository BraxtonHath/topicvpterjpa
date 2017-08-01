package io.braxton.topicvpterjpa.controllers;


import io.braxton.topicvpterjpa.interfaces.TopicRepoistory;
import io.braxton.topicvpterjpa.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TopicController {

    @Autowired
    TopicRepoistory repo;

    @RequestMapping("/")
    public String index(Model model){
        Iterable<Topic> topics = repo.findAll();
        return "index";
    }
}
