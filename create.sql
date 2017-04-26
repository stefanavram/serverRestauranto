CREATE TABLE pizza (
  id           VARCHAR(255) NOT NULL,
  version      INT8         NOT NULL,
  can_purchase BOOLEAN,
  image        VARCHAR(255),
  ingredients  VARCHAR(255),
  name         VARCHAR(255),
  price        FLOAT8,
  sold_out     BOOLEAN,
  weight       INT4,
  PRIMARY KEY (id)
)
CREATE TABLE reservation (
  id              VARCHAR(255) NOT NULL,
  version         INT8         NOT NULL,
  date            TIMESTAMP,
  how_many_people INT4,
  name            VARCHAR(255),
  PRIMARY KEY (id)
)
CREATE TABLE review (
  id         VARCHAR(255) NOT NULL,
  version    INT8         NOT NULL,
  author     VARCHAR(255),
  body       VARCHAR(255),
  created_on INT8,
  stars      INT4,
  pizza_id   VARCHAR(255),
  PRIMARY KEY (id)
)
ALTER TABLE review
  ADD CONSTRAINT FKkhvp5sba0alha3036s7s1c85k FOREIGN KEY (pizza_id) REFERENCES pizza
