-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Projeto (
CodProjeto NUMERIC(15) PRIMARY KEY,
NomeProjeto CHAR(100),
CursoProjeto CHAR(30)
)

CREATE TABLE Detalhes Projeto (
fk_codprojeto NUMERIC(),
fk_idparticipante NUMERIC(),
DataCriacao SMALLDATETIME,
OrcamentoProj NUMERIC(15),
FOREIGN KEY(fk_codprojeto) REFERENCES Projeto (CodProjeto)
)

CREATE TABLE Participantes (
IdParticipante NUMERIC(15) PRIMARY KEY,
NomeParticipante CHAR(30),
DtNascimento SMALLDATETIME
)

ALTER TABLE Detalhes Projeto ADD FOREIGN KEY(fk_idparticipante) REFERENCES Participantes (IdParticipante)
