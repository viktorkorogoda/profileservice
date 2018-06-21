package by.viktor.profile.service.profileservice.service;

import by.viktor.profile.service.profileservice.mapper.ProfileJpaToProfileConverter;
import by.viktor.profile.service.profileservice.mapper.ProfileToProfileJpaConverter;
import by.viktor.profile.service.profileservice.model.common.Profile;
import by.viktor.profile.service.profileservice.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Viktor.
 */
@Service
public class ProfileService {

    @Autowired
    private ProfileRepository repository;

    public Profile saveProfile(Profile profile) {
        by.viktor.profile.service.profileservice.model.jpa.Profile jpaProfile = ProfileToProfileJpaConverter.map(profile);
        return ProfileJpaToProfileConverter.map(repository.save(jpaProfile));
    }

    public List<Profile> findAllProfiles() {
        return repository.findAll().stream()
                .map(ProfileJpaToProfileConverter::map)
                .collect(Collectors.toList());
    }
}
