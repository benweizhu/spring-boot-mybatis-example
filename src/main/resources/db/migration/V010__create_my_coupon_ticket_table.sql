create table my_coupon_ticket
(
    id           serial     not null,
    code         varchar(8) not null,
    type         serial     not null,
    created_by   serial     not null,
    created_time timestamp  not null
);

create unique index my_coupon_ticket_code_uindex on my_coupon_ticket (code);

create unique index my_coupon_ticket_id_uindex on my_coupon_ticket (id);

alter table my_coupon_ticket
    add constraint my_coupon_ticket_pk primary key (id);

