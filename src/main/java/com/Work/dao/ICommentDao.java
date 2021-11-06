package com.Work.dao;

import com.Work.entity.CommentEntity;
import com.Work.entity.WorkerEntity;

import java.util.List;

public interface ICommentDao {
    CommentEntity create(CommentEntity commentEntity);
    List<CommentEntity> userCommentList(WorkerEntity workerEntity);
}
