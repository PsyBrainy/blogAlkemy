package com.psybrainy.blogAlkemy.persistence;

import com.psybrainy.blogAlkemy.domain.Post;
import com.psybrainy.blogAlkemy.domain.repository.PostRepository;
import com.psybrainy.blogAlkemy.persistence.crud.PostCrudRepository;
import com.psybrainy.blogAlkemy.persistence.entity.PostEntity;
import com.psybrainy.blogAlkemy.persistence.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PostImplRepo implements PostRepository {

    @Autowired
    private PostCrudRepository repo;

    @Autowired
    private PostMapper mapper;

    @Override
    public List<Post> getAll(){
        List<PostEntity> postEntityList = (List<PostEntity>) repo.getAllByDate();

        return postEntityList
                .stream()
                .map(postEntity -> mapper.toPost(postEntity))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Post> getPostById(long idPost) {

        return repo.findById(idPost).map(postEntity -> mapper.toPost(postEntity));
    }

    @Override
    public Post savePost(Post post) {
        PostEntity postEntity = repo.save(mapper.toPostEntity(post));
        return mapper.toPost(postEntity);
    }
}
