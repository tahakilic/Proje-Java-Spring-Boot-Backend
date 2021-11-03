package com.Work.controller;

import com.Work.entity.CommentEntity;
import com.Work.entity.WorkerEntity;
import com.Work.model.dto.CommentDto;
import com.Work.service.ICommentService;
import com.Work.service.IWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/comment/",produces = "application/json")
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @RequestMapping(value = "create/{id}",method = RequestMethod.POST)
    public CommentEntity create(@RequestBody CommentDto commentDto,@PathVariable Long id){
        return commentService.create(id,commentDto);
    }


    @RequestMapping(value="{userId}",method = RequestMethod.GET)
    public  List<CommentEntity> userCommentList(@PathVariable Long userId){
        return commentService.userCommentList(userId);
    }




}
