package com.LogMasterVehicle.DB.common;

import com.LogMasterVehicle.DB.model.Registers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RegisRepo extends JpaRepository<Registers, String> {
    Optional<Registers> findById(Integer id);


}
