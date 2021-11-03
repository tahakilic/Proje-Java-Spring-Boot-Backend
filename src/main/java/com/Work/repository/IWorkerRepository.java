package com.Work.repository;


import com.Work.entity.WorkerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IWorkerRepository extends CrudRepository<WorkerEntity,Long>  {

    List<WorkerEntity> findByFirstNameContainingOrLastNameContainingOrWorkInLocationsContainingOrAreaOfInterestContaining(String firstName,String lastName,String workInLocation,String areaOfInterest); //veri tabanında arama yapar

    WorkerEntity findByEmailAndPassword(String email, String password);
}
