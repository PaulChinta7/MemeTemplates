package com.memetemplate.backend.service;

import com.memetemplate.backend.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {
    
    @Autowired
    private TemplateRepository templateRepository;
    
    public String getTemplates(){
        return "yes";
    }
    
}
