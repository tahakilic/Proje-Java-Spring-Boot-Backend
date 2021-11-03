package com.Work.serviceImpl;

import com.Work.dao.ICommentDao;
import com.Work.dao.IWorkerDao;
import com.Work.entity.CommentEntity;
import com.Work.entity.WorkerEntity;
import com.Work.model.dto.CommentDto;
import com.Work.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommentService implements ICommentService {

    @Autowired
    private ICommentDao commentDao;

    @Autowired
    private IWorkerDao  workerDao;

    @Override
    public CommentEntity create(Long userId,CommentDto commentDto) {
        CommentEntity commentEntity=new CommentEntity();
        commentEntity.setFirstName(commentDto.getFirstName());
        commentEntity.setLastName(commentDto.getLastName());
        commentEntity.setWorkName(commentDto.getWorkName());
        commentEntity.setComment(commentDto.getComment());
        commentEntity.setDate(new Date());
        if(userId != null){
            WorkerEntity workerEntity=workerDao.getById(userId);
            commentEntity.setWorker(workerEntity);
        }

        return commentDao.create(commentEntity) ;
    }

    @Override
    public List<CommentEntity> userCommentList(Long userId) {
        return commentDao.userCommentList(userId) ;
    }
}
