CREATE TABLE livro(
  id                      INTEGER NOT NULL AUTO_INCREMENT,
  titulo                  VARCHAR(30),
  numero_de_paginas       VARCHAR(20),
  ativo                   BIT,
  PRIMARY KEY pk_livro(id)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;