package com.example.test_case_md4.service;


import com.example.test_case_md4.model.Post;

public interface IPostService extends IGeneralService<Post> {
    Iterable<Post> findAllByTitleContaining(String title);
    Iterable<Post> findTop4New();
    Iterable<Post> findAllByLikes();
}
