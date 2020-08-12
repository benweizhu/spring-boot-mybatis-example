CREATE TABLE MY_COUPON_TICKET
(
    ID           SERIAL     NOT NULL,
    CODE         VARCHAR(8) NOT NULL,
    TYPE         SERIAL     NOT NULL,
    CREATED_BY   SERIAL     NOT NULL,
    CREATED_TIME TIMESTAMP  NOT NULL DEFAULT NOW()
);

CREATE UNIQUE INDEX MY_COUPON_TICKET_CODE_UINDEX ON MY_COUPON_TICKET (CODE);

CREATE UNIQUE INDEX MY_COUPON_TICKET_ID_UINDEX ON MY_COUPON_TICKET (ID);

ALTER TABLE MY_COUPON_TICKET
    ADD CONSTRAINT MY_COUPON_TICKET_PK PRIMARY KEY (ID);

