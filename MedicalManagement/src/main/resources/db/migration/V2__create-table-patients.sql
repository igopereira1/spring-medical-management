CREATE TABLE patients (
    id bigint NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    cpf varchar(20) NOT NULL UNIQUE,
    email varchar(100) NOT NULL UNIQUE,
    phone varchar(20) NOT NULL,
    street varchar(100) NOT NULL,
    number varchar(10) NOT NULL,
    neighborhood varchar(100) NOT NULL,
    city varchar(100) NOT NULL,
    state varchar(2) NOT NULL,
    zip_code varchar(10) NOT NULL,
    complement varchar(100),
    PRIMARY KEY (id)
);