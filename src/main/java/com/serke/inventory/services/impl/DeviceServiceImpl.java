package com.serke.inventory.services.impl;

import com.serke.inventory.models.Device;
import com.serke.inventory.repositories.DeviceRepository;
import com.serke.inventory.services.DeviceService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class DeviceServiceImpl implements DeviceService {

    private DeviceRepository deviceRepository;

    @Override
    public Optional<Device> findById(Long deviceId) {
        return this.deviceRepository.findById(deviceId);
    }

    @Override
    public List<Device> findByOwner(Long userId) {
        return this.deviceRepository.findByOwner(userId);
    }

    @Override
    public void assignUser(Long deviceId, Long userId) {
        Device device = this.deviceRepository.findById(deviceId).orElseThrow();
        device.setOwner(userId);
        this.deviceRepository.update(device);
    }

    @Override
    public void unlock(Long deviceId) {
        Device device = this.deviceRepository.findById(deviceId).orElseThrow();
        device.setOwner(null);
        this.deviceRepository.update(device);
    }

}
