package com.serke.inventory;

import com.serke.inventory.models.Device;
import com.serke.inventory.repositories.DeviceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@DataJpaTest
public class DeviceRepositoryIntegrationJpaTest {

    @Autowired
    private DeviceRepository deviceRepository;

    @Test
    void testFindById() {
        Device device = this.deviceRepository.findById(1L).orElseThrow();

        assertAll("testFindById",
                () -> assertEquals(1L, device.getId()),
                () -> assertEquals("display", device.getCategory()),
                () -> assertEquals("ready", device.getTechnicalState())
        );

        verify(this.deviceRepository).findById(1L);
    }

    @Test
    void testFindByOwner() {
        List<Device> devices = deviceRepository.findByOwner(1L);

        assertAll("testFindByOwner",
                () -> assertEquals(3, devices.size()),
                () -> assertTrue(devices.stream().allMatch(device -> device.getOwner().equals(1L))),
                () -> assertTrue(devices.contains(Datos.PANTALLA_SERKE)),
                () -> assertTrue(devices.contains(Datos.TECLADO_SERKE)),
                () -> assertTrue(devices.contains(Datos.RATON_SERKE))
        );

        verify(this.deviceRepository).findByOwner(1L);
    }

    @Test
    void testFindFreeDevices() {
        List<Device> devices = deviceRepository.findFreeDevices();

        assertAll("testFindFreeDevices",
                () -> assertEquals(2, devices.size()),
                () -> assertTrue(devices.contains(Datos.PANTALLA_LIBRE)),
                () -> assertTrue(devices.contains(Datos.TECLADO_LIBRE)),
                () -> assertTrue(devices.contains(Datos.RATON_LIBRE)),
                () -> assertTrue(devices.stream().noneMatch(device -> device.getOwner() != null))
        );

        verify(this.deviceRepository).findFreeDevices();
    }

}
