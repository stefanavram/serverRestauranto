create table pizza (id varchar(255) not null, version int8 not null, can_purchase boolean, image varchar(255), ingredients varchar(255), name varchar(255), price float8, sold_out boolean, weight int4, primary key (id))
create table pizza_reviews (pizza_entity_id varchar(255) not null, reviews_id varchar(255) not null)
create table review (id varchar(255) not null, version int8 not null, author varchar(255), body varchar(255), created_on int8, stars int4, primary key (id))
alter table pizza_reviews add constraint UK_1tg70ujegdg8857lb4ccqtpf8 unique (reviews_id)
alter table pizza_reviews add constraint FKhtku8i6p0l4my3nh96vu9la6j foreign key (reviews_id) references review
alter table pizza_reviews add constraint FK2lw8bvltqm13y3hp77ffqwy4j foreign key (pizza_entity_id) references pizza
