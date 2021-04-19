package com.psybrainy.blogAlkemy.persistence.mapper;

import com.psybrainy.blogAlkemy.domain.Post;
import com.psybrainy.blogAlkemy.persistence.entity.PostEntity;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    public Post toPost(PostEntity postEntity){

        return Post
                .builder()
                .id_post(postEntity.getId())
                .title(postEntity.getTitle())
                .date(postEntity.getDate())
                .category(postEntity.getCategory().getName())
                .build();

    }
}
