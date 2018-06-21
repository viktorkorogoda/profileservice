package by.viktor.profile.service.profileservice.controller;

import by.viktor.profile.service.profileservice.model.common.Profile;
import by.viktor.profile.service.profileservice.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Viktor.
 */
@RestController
@RequestMapping("/profile/")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @RequestMapping("save")
    public Profile saveProfile(Profile profile) {
        return profileService.saveProfile(profile);
    }

    @RequestMapping("findAll")
    public List<Profile> findALlProfiles() {
        return profileService.findAllProfiles();
    }
}
