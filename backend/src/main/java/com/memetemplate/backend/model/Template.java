package com.memetemplate.backend.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;

@Document( collection = "template")
public class Template {
    private String id;
    private String name;
    private HashSet<String> tags;
    private String description;
    private String templateLink;
}
