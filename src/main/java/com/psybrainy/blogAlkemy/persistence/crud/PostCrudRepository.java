package com.psybrainy.blogAlkemy.persistence.crud;

import com.psybrainy.blogAlkemy.persistence.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostCrudRepository extends CrudRepository<PostEntity,Long > {
}
