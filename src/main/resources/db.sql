DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS author;

CREATE TABLE author (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50),

  CONSTRAINT pk_t_author PRIMARY KEY (ID)
);

CREATE TABLE book (
  id INT NOT NULL AUTO_INCREMENT,
  author_id INT NOT NULL,
  title VARCHAR(400) NOT NULL,

  CONSTRAINT pk_t_book PRIMARY KEY (id),
  CONSTRAINT fk_t_book_author_id FOREIGN KEY (author_id) REFERENCES author(id) ON DELETE CASCADE,
);

INSERT INTO author VALUES (DEFAULT, 'George Orwell');
INSERT INTO author VALUES (DEFAULT, 'Paulo Coelho');

INSERT INTO book VALUES (DEFAULT, 1, '1984');
INSERT INTO book VALUES (DEFAULT, 1, 'Animal Farm');
INSERT INTO book VALUES (DEFAULT, 2, 'O Alquimista');
INSERT INTO book VALUES (DEFAULT, 2, 'Brida');