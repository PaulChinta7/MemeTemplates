package com.memetemplate.backend.repository;

import com.memetemplate.backend.model.Template;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends MongoRepository<Template,String> {
}
