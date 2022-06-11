package com.sparta.studywebpage.repository;

import com.sparta.studywebpage.model.Study;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudyRepository extends JpaRepository<Study, Long> {

    Optional<Study> findById(Long id);

    @Query("select this.user.nickname,this.title  from Study this")
    Page<Study> getAllStudies(Pageable pageable);

    @Query("select this.user.nickname,this.title   from Study this where this.category=:category")
    Page<Study> getStudies( String category,Pageable pageable);

}
