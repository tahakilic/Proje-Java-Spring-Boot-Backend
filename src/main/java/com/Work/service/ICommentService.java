package com.Work.service;

import com.Work.entity.CommentEntity;
import com.Work.entity.WorkerEntity;
import com.Work.model.dto.CommentDto;

import java.util.List;

public interface ICommentService {
    CommentEntity create(Long id,CommentDto commentDto);

    List<CommentEntity> userCommentList(Long userId);
}
