package com.Work.repository;


import com.Work.entity.WorkerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IWorkerRepository extends CrudRepository<WorkerEntity,Long>  {

    List<WorkerEntity> findByFirstNameContainingOrLastNameContaining(String firstName,String lastName); //veri tabanında arama yapar

}
