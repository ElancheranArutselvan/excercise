package com.elan.exercise.Repository;

import com.elan.exercise.Entity.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface ChildrenRepository extends JpaRepository<Children, Long> {

    @Query(value = "select*from childrens where age =:age", nativeQuery = true)
    ArrayList<Children> findByAge(int age);

}
