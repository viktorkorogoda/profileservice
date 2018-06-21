package by.viktor.profile.service.profileservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor.
 */
@Component
public class ProfileBean {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public ProfileBean(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}
