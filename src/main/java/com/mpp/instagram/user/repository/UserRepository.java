package com.mpp.instagram.user.repository;

import com.mpp.instagram.user.entity.UserEntity;
import org.apache.tomcat.jni.User;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    @AllowFiltering
    public UserEntity findByUsernameAndPassword(String username, String password);

    UserEntity findByUsername(String username);

    @AllowFiltering
    public UserEntity findByUserToken(UUID token);



    @AllowFiltering
    UserEntity findByEmail(String email);
}
