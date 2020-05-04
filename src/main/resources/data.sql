DROP TABLE IF EXISTS lixo;

CREATE TABLE lixo (
  id_lixo INT AUTO_INCREMENT  PRIMARY KEY,
  tipo_lixo         VARCHAR2(40) NOT NULL,
  nome_lixo         VARCHAR2(40) NOT NULL
);

INSERT INTO lixo (tipo_lixo, nome_lixo) VALUES
  ('Metal', 'Lata'),
  ('Papel', 'Folha Sulfite'),
  ('Metal', 'Folha Aluminio');
