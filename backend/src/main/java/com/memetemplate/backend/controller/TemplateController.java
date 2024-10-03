package com.memetemplate.backend.controller;


import com.memetemplate.backend.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/templates")
public class TemplateController {
    
    @Autowired
    private TemplateService templateService;
    @GetMapping("getTemplates")
    public String getTemplates(){
        return templateService.getTemplates();
    }
}
