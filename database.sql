
set search_path = dat108oblig3;

CREATE TABLE bruker
(
   fornavn          VARCHAR (100),
   etternavn        VARCHAR (100),
   mobil            VARCHAR (60) UNIQUE,
   passwordHash     VARCHAR (100),
   kjonn            VARCHAR (40),
   PRIMARY KEY (mobil)
);







