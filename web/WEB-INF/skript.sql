
set search_path = DAT108Oblig3;

CREATE TABLE bruker
(
   fornavn          VARCHAR (40),
   etternavn        VARCHAR (40),
   id               INTEGER (4) UNIQUE,
   mobil            VARCHAR (40),
   passwordHash     VARCHAR (40),
   kjonn            VARCHAR (40),
   PRIMARY KEY (id),
);







