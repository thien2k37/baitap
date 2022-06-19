package com.example.test_case_md4.repository;

import com.example.test_case_md4.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Iterable<Post> findAllByTitleContaining(String title);
    @Query(value = "select * from post order by likes desc limit 4 ", nativeQuery = true)
    Iterable<Post> findTop4New();
    @Query(value = "select * from post order by likes asc ", nativeQuery = true)
    Iterable<Post> findAllByLikes();
}