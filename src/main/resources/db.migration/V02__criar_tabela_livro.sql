CREATE TABLE LIVRO(
  ID                      INTEGER NOT NULL AUTO_INCREMENT,
  TITULO                  VARCHAR(30),
  NUMERO_DE_PAGINAS       VARCHAR(20),
  ATIVO                   BIT,
  PRIMARY KEY PK_LIVRO(ID)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;