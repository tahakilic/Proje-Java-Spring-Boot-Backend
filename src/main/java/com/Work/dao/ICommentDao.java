package com.Work.dao;

import com.Work.entity.CommentEntity;

import java.util.List;

public interface ICommentDao {
    CommentEntity create(CommentEntity commentEntity);
    List<CommentEntity> userCommentList(Long userId);
}
