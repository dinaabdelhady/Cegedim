package com.cegedim.docMngSys.services;

import com.cegedim.docMngSys.model.Users;
import com.cegedim.docMngSys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

@Component
public class UserDao {
    @Autowired
    UserRepository userRepository;
    public Users findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
