package com.example.test_case_md4.service.impl;

import com.example.test_case_md4.service.IPostService;
import com.example.test_case_md4.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.test_case_md4.repository.PostRepository;

import java.util.Optional;

@Service
public class PostServiceImpl implements IPostService {
    @Autowired
    PostRepository postRepository;
    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }


    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void remove(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Iterable<Post> findAllByTitleContaining(String title) {
        return postRepository.findAllByTitleContaining(title);
    }

    @Override
    public Iterable<Post> findTop4New() {
        return postRepository.findTop4New();
    }

    @Override
    public Iterable<Post> findAllByLikes() {
        return postRepository.findAllByLikes();
    }
}
