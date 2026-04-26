package com.example.quora.repositories;

import com.example.quora.models.Question;
import com.example.quora.models.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Set;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
    @Query("SELECT q from Question q join q.tags t where t.id In :tagIds")
    Page<Question> findQuestionByTags(Set<Long> tagIds, Pageable pageable);

}
