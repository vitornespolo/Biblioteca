CREATE TABLE pessoa_livro(
  id                      INTEGER NOT NULL AUTO_INCREMENT,
  titulo                  VARCHAR(30),
  paginas_lidas           INTEGER,
  nota                    VARCHAR(10),
  livo                    BIT,
  id_pessoa               INTEGER,
  id_livro                INTEGER,
  ativo                   BIT,
  PRIMARY KEY pk_pessoa_livro(id),
  INDEX idx_pessoa_livro_pessoa_01(id_pessoa),
  INDEX idx_pessoa_livro_livro_02(id_livro),
  CONSTRAINT fk_pessoa_livro_pessoa_01 FOREIGN KEY (id_pessoa) REFERENCES pessoa (id),
  CONSTRAINT fk_pessoa_livro_livro_02 FOREIGN KEY (id_livro) REFERENCES livro (id)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;