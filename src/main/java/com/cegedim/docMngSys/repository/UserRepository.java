package com.cegedim.docMngSys.repository;

import com.cegedim.docMngSys.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {

    Users findByUserName(String userName);
}
