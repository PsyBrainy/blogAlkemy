package com.psybrainy.blogAlkemy.persistence.crud;

import com.psybrainy.blogAlkemy.persistence.entity.PostEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostCrudRepository extends CrudRepository<PostEntity,Long > {

    @Query(value = "SELECT * FROM post ORDER BY post.date DESC",
            nativeQuery = true)
    List<PostEntity> getAllByDate();
}
