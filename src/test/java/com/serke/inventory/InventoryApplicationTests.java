package com.serke.inventory;

import com.serke.inventory.models.Device;
import com.serke.inventory.repositories.DeviceRepository;
import com.serke.inventory.services.impl.DeviceServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class InventoryApplicationTests {

	private DeviceServiceImpl service;

	private DeviceRepository deviceRepository;

	@BeforeEach
	void setUp() {
		this.deviceRepository = mock(DeviceRepository.class);
		this.service = new DeviceServiceImpl(this.deviceRepository);
	}

	@Test
	void contextLoads() {
		when(this.deviceRepository.findById(1L)).thenReturn(Optional.of(Datos.PANTALLA_SERKE));
		when(this.deviceRepository.findById(2L)).thenReturn(Optional.of(Datos.PANTALLA_ROBER));
		when(this.deviceRepository.findByOwner(1L)).thenReturn(Datos.DEVICES_SERKE);
		when(this.deviceRepository.findByOwner(2L)).thenReturn(Datos.DEVICES_ROBER);

		Device patallaSerke = this.service.findById(1L).orElseThrow();
		Device patallaRober = this.service.findById(2L).orElseThrow();

		List<Device> dispositivosSerke = this.service.findByOwner(1L);
		List<Device> dispositivosRober = this.service.findByOwner(2L);

		assertAll(
				() -> assertEquals(Datos.PANTALLA_SERKE, patallaSerke),
				() -> assertEquals(1L, patallaSerke.getId()),
				() -> assertEquals(1L, patallaSerke.getOwner()),
				() -> assertTrue(dispositivosSerke.contains(patallaSerke)),
				() -> assertEquals(Datos.PANTALLA_ROBER, patallaRober),
				() -> assertEquals(2L, patallaRober.getId()),
				() -> assertEquals(2L, patallaRober.getOwner()),
				() -> assertTrue(dispositivosRober.contains(patallaRober))
		);

		verify(this.deviceRepository, times(2)).findById(anyLong());
		verify(this.deviceRepository).findById(1L);
		verify(this.deviceRepository).findById(2L);
		verify(this.deviceRepository, times(2)).findByOwner(anyLong());
		verify(this.deviceRepository).findByOwner(1L);
		verify(this.deviceRepository).findByOwner(2L);
	}

}
