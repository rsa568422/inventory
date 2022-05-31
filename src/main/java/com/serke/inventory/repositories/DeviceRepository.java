package com.serke.inventory.repositories;

import com.serke.inventory.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, Long> {

    List<Device> findByOwner(Long userId);

    @Query("SELECT d from Device d where d.owner is null")
    List<Device> findFreeDevices();

}
