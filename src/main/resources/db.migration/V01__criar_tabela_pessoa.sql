CREATE TABLE pessoa(
  id                    INTEGER NOT NULL AUTO_INCREMENT,
  nome                  VARCHAR(30),
  sobrenome             VARCHAR(20),
  ativo                 BIT,
  PRIMARY KEY pk_pessoa(id)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;