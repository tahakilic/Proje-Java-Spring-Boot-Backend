package com.Work.daoImpl;

import com.Work.dao.ICommentDao;
import com.Work.entity.CommentEntity;
import com.Work.entity.WorkerEntity;
import com.Work.repository.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentDao implements ICommentDao {
    @Autowired
    private ICommentRepository repository;

    @Override
    public CommentEntity create(CommentEntity commentEntity) {
        return repository.save(commentEntity);
    }

    @Override
    public List<CommentEntity> userCommentList(WorkerEntity workerEntity) {
        return repository.findByWorker(workerEntity);

    }

}
