package com.psybrainy.blogAlkemy.persistence.mapper;

import com.psybrainy.blogAlkemy.domain.Post;
import com.psybrainy.blogAlkemy.persistence.crud.CategoryCrudRepository;
import com.psybrainy.blogAlkemy.persistence.entity.PostEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    @Autowired
    private CategoryCrudRepository categoryCrud;

    public Post toPost(PostEntity postEntity){

        return Post
                .builder()
                .idPost(postEntity.getId().toString())
                .title(postEntity.getTitle())
                .content(postEntity.getContent())
                .image(postEntity.getImage())
                .date(postEntity.getDate())
                .category(postEntity.getCategory().getName())
                .build();
    }

    public PostEntity toPostEntity(Post post){

        return PostEntity
                .builder()
                .title(post.getTitle())
                .content(post.getContent())
                .image(post.getImage())
                .category(categoryCrud.findByName(post.getCategory()).get())
                .build();
    }
}
