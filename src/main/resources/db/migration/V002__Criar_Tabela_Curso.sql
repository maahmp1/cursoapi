Create Table Curso (
id int not null primary key auto_increment,
nomecurso varchar (100),
id_cidade int,
id_aluno int
);

insert into curso(nomecurso) values ('ADS');
insert into curso(nomecurso) values ('Biologia');
insert into curso(nomecurso) values ('Administração');
