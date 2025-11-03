package com.expense.userservice.repository;

import com.expense.userservice.entities.UserInfoDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfoDTO, String> {
    UserInfoDTO findByUserId(String userId);
}
