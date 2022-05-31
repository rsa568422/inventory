package com.serke.inventory;

import com.serke.inventory.models.Device;
import com.serke.inventory.models.User;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Datos {

    public static final User USER_SERKE = new User(1L, "Bernat", "Tortosa", "Moltó", "Serke", "serke@email.com");
    public static final User USER_ROBER = new User(2L, "Roberto", "Sánchez", "Arévalo", "rsa568422", "rsa568422@email.com");

    public static final List<User> USERS = Arrays.asList(USER_SERKE, USER_ROBER);

    public static final Device PANTALLA_SERKE = new Device(1L, new Date(), null, null, null, null, null, "display", 1L, "ready", null, false, null, null, null);
    public static final Device PANTALLA_ROBER = new Device(2L, new Date(), null, null, null, null, null, "display", 2L, "ready", null, false, null, null, null);
    public static final Device PANTALLA_LIBRE = new Device(3L, new Date(), null, null, null, null, null, "display", null, "ready", null, false, null, null, null);

    public static final Device TECLADO_SERKE = new Device(4L, new Date(), null, null, null, null, null, "keyboard", 1L, "ready", null, false, null, null, null);
    public static final Device TECLADO_ROBER = new Device(5L, new Date(), null, null, null, null, null, "keyboard", 2L, "ready", null, false, null, null, null);
    public static final Device TECLADO_LIBRE = new Device(6L, new Date(), null, null, null, null, null, "keyboard", null, "ready", null, false, null, null, null);

    public static final Device RATON_SERKE = new Device(7L, new Date(), null, null, null, null, null, "mouse", 1L, "ready", null, false, null, null, null);
    public static final Device RATON_ROBER = new Device(8L, new Date(), null, null, null, null, null, "mouse", 2L, "ready", null, false, null, null, null);
    public static final Device RATON_LIBRE = new Device(9L, new Date(), null, null, null, null, null, "mouse", null, "ready", null, false, null, null, null);

    public static final List<Device> DEVICES = Arrays.asList(PANTALLA_SERKE, PANTALLA_ROBER, PANTALLA_LIBRE, TECLADO_SERKE, TECLADO_ROBER, TECLADO_LIBRE, RATON_SERKE, RATON_ROBER, RATON_LIBRE);
    public static final List<Device> DEVICES_SERKE = Arrays.asList(PANTALLA_SERKE, TECLADO_SERKE, RATON_SERKE);
    public static final List<Device> DEVICES_ROBER = Arrays.asList(PANTALLA_ROBER, TECLADO_ROBER, RATON_ROBER);
    public static final List<Device> DEVICES_LIBRE = Arrays.asList(PANTALLA_LIBRE, TECLADO_LIBRE, RATON_LIBRE);

}
