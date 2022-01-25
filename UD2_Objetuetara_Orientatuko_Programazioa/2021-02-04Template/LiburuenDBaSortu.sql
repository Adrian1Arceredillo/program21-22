DROP DATABASE LiburuenDBa;
CREATE DATABASE LiburuenDBa;

USE LiburuenDBa

CREATE TABLE Author(id INTEGER PRIMARY KEY,
	izena VARCHAR(30),
	abizena VARCHAR(30),
	jaiotza DATE,
	heriotza DATE);

CREATE TABLE Book(id INTEGER PRIMARY KEY AUTO_INCREMENT,
	izenburua VARCHAR(50),
	egilea INTEGER,
	prezioa DOUBLE,
	orriak INTEGER,
	FOREIGN KEY (egilea) REFERENCES Author(id));
	
INSERT INTO Author VALUES (1,"Agatha","Christie","1890-09-15",NULL);
INSERT INTO Author VALUES (2,"Francisco","Ibañez","1936-03-15",NULL);
INSERT INTO Author VALUES (3,"Margaret","Atwood","1939-11-18",NULL);
INSERT INTO Author VALUES (4,"J.K.","Rowling","1965-07-31",NULL);
INSERT INTO Author VALUES (5,"Marjane","Satrapi","1969-11-22",NULL);
INSERT INTO Author VALUES (6,"Mariasun","Landa","1949-06-05",NULL);

INSERT INTO Book VALUES(null,"Asesinato en el Orient Express",1,9.95,275);
INSERT INTO Book VALUES(null,"Muerte en el Nilo",1,9.95,300);
INSERT INTO Book VALUES(null,"10 negritos",1,9.95,325);
INSERT INTO Book VALUES(null,"Mortadelo y Filemón",2,19.95,75);
INSERT INTO Book VALUES(null,"El cuento de la criada",3,24.95,410);
INSERT INTO Book VALUES(null,"Cat’s eye",3,6.95,758);
INSERT INTO Book VALUES(null,"Harry Potter",4,99.99,2850);
INSERT INTO Book VALUES(null,"Persepolis",5,19.95,75);
INSERT INTO Book VALUES(null,"Azken balada",6,10.95,225);
INSERT INTO Book VALUES(null,"Matar a un ruiseñor",null,15.95,450);
INSERT INTO Book VALUES(null,"Frankenstein",null,19.95,300);


