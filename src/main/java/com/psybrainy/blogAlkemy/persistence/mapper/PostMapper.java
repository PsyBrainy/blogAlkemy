package com.psybrainy.blogAlkemy.persistence.mapper;

import com.psybrainy.blogAlkemy.domain.Post;
import com.psybrainy.blogAlkemy.persistence.entity.PostEntity;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

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
}
