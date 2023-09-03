package pro.sky.java.course3.school.service;

import org.springframework.web.multipart.MultipartFile;
import pro.sky.java.course3.school.model.Avatar;

import java.io.IOException;

public interface AvatarService {
    void addAvatar(Long studentId, MultipartFile avatarFile) throws IOException;

    Avatar findAvatar(long id);
}
