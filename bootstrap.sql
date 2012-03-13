create database interview;

create table person(
	personid integer, 
	firstname character varying(55), 
	lastname character varying(55),
	PRIMARY KEY (personid)
);

create table location(
	locationid integer,
	personid integer, 
	address character varying(55), 
	PRIMARY KEY (locationid, personid)
);

insert into person values(1, 'Sergio', 'Couture');
insert into person values(2, 'David', 'Labb�');
insert into person values(3, 'Jonathan', 'Goudreau');
insert into person values(4, 'Martin', 'Massicotte');


insert into location values(1, 1, 'L�vis');
insert into location values(2, 1, 'Qu�bec');
insert into location values(3, 1, 'Montr�al');
insert into location values(1, 4, 'Qu�bec');
insert into location values(2, 4, 'Outaouais');
