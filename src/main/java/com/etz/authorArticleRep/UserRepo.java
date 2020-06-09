package com.etz.authorArticleRep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etz.authorArticleModel.User;

@Repository
public interface UserRepo extends JpaRepository <User, Long>{
 
}
