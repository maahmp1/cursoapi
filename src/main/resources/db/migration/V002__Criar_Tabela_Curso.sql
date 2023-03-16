Create Table Curso (
id int not null auto_increment primary key,
nomecurso varchar (25)
);

Alter Table Curso add CONSTRAINT FK_Aluno_Curso foreign key(id_curso) references Curso(id);
Alter Table Curso add CONSTRAINT FK_Aluno_Cidade foreign key(id_cidade) references Cidade(id);
 --colocar no cidade--

insert into curso(nomecurso) values ('Análise e Desenvolvimento de Sistemas');
insert into curso(nomecurso) values ('Biologia');
insert into curso(nomecurso) values ('Administração');
