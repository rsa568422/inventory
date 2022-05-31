package com.serke.inventory.repositories;

import com.serke.inventory.models.Device;

import java.util.List;
import java.util.Optional;

public interface DeviceRepository {

    List<Device> findAll();

    Optional<Device> findById(Long id);

    List<Device> findByOwner(Long userId);

    void update(Device device);

}
