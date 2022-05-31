INSERT INTO users (id, name, surname_1, surname_2, user_name, email) VALUES (1, "Bernat", "Tortosa", "Moltó", "Serke", "serke@email.com");
INSERT INTO users (id, name, surname_1, surname_2, user_name, email) VALUES (2, "Roberto", "Sánchez", "Arévalo", "rsa568422", "rsa568422@email.com");

INSERT INTO devices (id, purchase, category, owner, technical_state, do_not_show) VALUES (1, SYSDATE, "display", 1L, "ready", false);
INSERT INTO devices (id, purchase, category, owner, technical_state, do_not_show) VALUES (2, SYSDATE, "display", 2L, "ready", false);
INSERT INTO devices (id, purchase, category, owner, technical_state, do_not_show) VALUES (3, SYSDATE, "display", NULL, "ready", false);
INSERT INTO devices (id, purchase, category, owner, technical_state, do_not_show) VALUES (4, SYSDATE, "keyboard", 1L, "ready", false);
INSERT INTO devices (id, purchase, category, owner, technical_state, do_not_show) VALUES (5, SYSDATE, "keyboard", 2L, "ready", false);
INSERT INTO devices (id, purchase, category, owner, technical_state, do_not_show) VALUES (6, SYSDATE, "keyboard", NULL, "ready", false);
INSERT INTO devices (id, purchase, category, owner, technical_state, do_not_show) VALUES (7, SYSDATE, "mouse", 1L, "ready", false);
INSERT INTO devices (id, purchase, category, owner, technical_state, do_not_show) VALUES (8, SYSDATE, "mouse", 2L, "ready", false);
INSERT INTO devices (id, purchase, category, owner, technical_state, do_not_show) VALUES (9, SYSDATE, "mouse", NULL, "ready", false);
