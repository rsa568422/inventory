package com.serke.inventory.services;

import com.serke.inventory.models.Device;

import java.util.List;
import java.util.Optional;

public interface DeviceService {

    Optional<Device> findById(Long deviceId);

    List<Device> findByOwner(Long userId);

    void assignUser(Long deviceId, Long userId);

    void unlock(Long deviceId);

}
