package com.Work.repository;

import com.Work.entity.CommentEntity;
import com.Work.entity.WorkerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICommentRepository extends CrudRepository<CommentEntity,Long> {

    List<CommentEntity> findByWorker(WorkerEntity workerEntity);

}
