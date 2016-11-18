create table pizza (id varchar(255) not null, version int8 not null, can_purchase boolean, image varchar(255), ingredients varchar(255), name varchar(255), price float8, sold_out boolean, weight int4, primary key (id))
create table review (id varchar(255) not null, version int8 not null, author varchar(255), body varchar(255), created_on int8, stars int4, pizza_id varchar(255), primary key (id))
alter table review add constraint FKkhvp5sba0alha3036s7s1c85k foreign key (pizza_id) references pizza
