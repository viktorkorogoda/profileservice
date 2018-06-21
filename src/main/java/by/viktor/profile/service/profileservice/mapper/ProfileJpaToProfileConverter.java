package by.viktor.profile.service.profileservice.mapper;

import by.viktor.profile.service.profileservice.model.common.Profile;

/**
 * Created by Viktor.
 */
public class ProfileJpaToProfileConverter {
    public static Profile map(by.viktor.profile.service.profileservice.model.jpa.Profile jpaProfile) {
        return new Profile(
                jpaProfile.getId(),
                jpaProfile.getLogin(),
                jpaProfile.getPassword(),
                jpaProfile.getName(),
                jpaProfile.getDateOfBirth()
        );
    }
}
