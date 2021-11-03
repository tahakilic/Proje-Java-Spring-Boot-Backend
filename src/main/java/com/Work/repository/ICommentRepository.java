package com.Work.repository;

import com.Work.entity.CommentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICommentRepository extends CrudRepository<CommentEntity,Long> {

    List<CommentEntity> findByWorkerContaining(Long userId);
}
