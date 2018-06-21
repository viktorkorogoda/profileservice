package by.viktor.profile.service.profileservice.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Created by Viktor.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    private UUID id;
    private String login;
    private String password;
    private String name;
    private String dateOfBirth;
}
