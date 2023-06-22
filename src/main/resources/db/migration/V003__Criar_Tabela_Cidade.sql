Create Table Cidade(
id int not null auto_increment primary key,
nomecidade varchar (30),
uf varchar(2)
);

Alter Table Curso add CONSTRAINT FK_Aluno_Curso foreign key(id_aluno) references Aluno(id);
Alter Table Curso add CONSTRAINT FK_Aluno_Cidade foreign key(id_cidade) references Cidade(id);

