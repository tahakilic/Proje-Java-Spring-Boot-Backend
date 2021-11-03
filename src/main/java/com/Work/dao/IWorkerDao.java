package com.Work.dao;

import com.Work.entity.WorkerEntity;
import com.Work.model.dto.UserLogin;

import java.util.List;

public interface IWorkerDao {
    List<WorkerEntity> getAllList();
    WorkerEntity createOrUpdate(WorkerEntity workerEntity);
    int deleteById(Long id);
    WorkerEntity getById(Long id);
    List<WorkerEntity> search(String search);
    WorkerEntity userLogin(UserLogin userLogin);


}
