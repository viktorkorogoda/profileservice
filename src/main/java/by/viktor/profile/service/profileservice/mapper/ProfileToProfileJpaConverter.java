package by.viktor.profile.service.profileservice.mapper;


import by.viktor.profile.service.profileservice.model.jpa.Profile;

/**
 * Created by Viktor.
 */
public class ProfileToProfileJpaConverter {
    public static Profile map(by.viktor.profile.service.profileservice.model.common.Profile profile) {
        return new Profile(
                profile.getId(),
                profile.getLogin(),
                profile.getPassword(),
                profile.getName(),
                profile.getDateOfBirth()
        );
    }
}
