package com.elan.exercise.Repository;

import com.elan.exercise.Entity.RoomMates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomMatesRepository extends JpaRepository<RoomMates, Long> {
}