package by.viktor.profile.service.profileservice.repository;

import by.viktor.profile.service.profileservice.model.jpa.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

/**
 * Created by Viktor.
 */
public interface ProfileRepository extends MongoRepository<Profile, UUID> {
    Page<Profile> findAll(Pageable pageable);
}
