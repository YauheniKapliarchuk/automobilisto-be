create table models
(
    id                   BIGINT not null,
    brand                VARCHAR (255),
    count_of_generations INTEGER,
    name                 VARCHAR (255),
    CONSTRAINT models_primary_key PRIMARY KEY (id)
);

CREATE TABLE generations (
     id                   BIGINT not null,
     brand                VARCHAR (255),
     production_start      INTEGER,
     production_end        INTEGER,
     name                 VARCHAR (255),
     model_id                   BIGINT not null,
     CONSTRAINT generations_primary_key PRIMARY KEY (id),
     CONSTRAINT models_foreign_key FOREIGN KEY (model_id) REFERENCES models (id)
);
