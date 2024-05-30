CREATE TABLE tipo_status(
  id                    INTEGER NOT NULL AUTO_INCREMENT,
  status                VARCHAR(30),
  ativo                 BIT,
  PRIMARY KEY pk_tipo_status(id)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;