DROP TABLE Terminoak;
CREATE TABLE Terminoak (
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	euskaraz VARCHAR(20),
	gazteleraz VARCHAR(20));

INSERT INTO TERMINOAK VALUES (null, "sagarra", "manzana");
INSERT INTO TERMINOAK (euskaraz, gazteleraz) VALUES ("madaria", "pera");
INSERT INTO TERMINOAK (euskaraz, gazteleraz) VALUES ("marrubia", "fresa");
	
	