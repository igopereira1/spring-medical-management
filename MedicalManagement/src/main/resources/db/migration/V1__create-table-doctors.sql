CREATE TABLE doctors (
    id bigint NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    crm varchar(10) NOT NULL UNIQUE,
    specialty varchar(100) NOT NULL,
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