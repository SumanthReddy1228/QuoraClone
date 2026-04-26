package com.example.quora.repositories;

import com.example.quora.models.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findByAnswerId(Long answerId, Pageable pageable);
    Page<Comment> findByParentCommentId(Long parentCommentId, Pageable pageable);
}
