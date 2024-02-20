create table Bike
(
    id              int     not null,
    name            varchar not null,
    price           int     not null,
    warranty_status varchar not null,
    model           varchar not null,
    date_created    varchar not null
);

insert into Bike(id, name, price, warranty_status, model, date_created) values(1, 'Yamaha', 203, 'Covered', 'XC209','10/01/2001');

insert into Bike(id, name, price, warranty_status, model,date_created) values(2, 'Bajaj', 450, 'Covered', 'XQ991','20/02/2002');

insert into Bike(id, name, price, warranty_status, model,date_created) values(3, 'Suzuki', 790, 'Covered', 'BT450','30/03/2003');

insert into Bike(id, name, price, warranty_status, model,date_created) values(4, 'Honda', 150, 'Covered', 'XR10','04/04/2004');

insert into Bike(id, name, price, warranty_status, model,date_created) values(5, 'Toyota', 620, 'Covered', 'ZY9091','05/05/2005');