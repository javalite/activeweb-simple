drop table books;

CREATE TABLE books (
  id  SERIAL PRIMARY KEY,
  author VARCHAR(128),
  title VARCHAR(128),
  isbn VARCHAR(128),
  created_at timestamp without time zone NOT NULL,
  updated_at timestamp without time zone NOT NULL
);