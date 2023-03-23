create database fullStack; 
create table orders(
	Id INT PRIMARY KEY AUTO_INCREMENT,
    description varchar(30), 
    rating INT, 
    orderAgain Boolean
);

insert into orders (description, rating, orderAgain)
values('Pasta Primavera', 8, true), 
('Pizza', 10,true), 
('sushi', 11, true), 
('Pasta Alfredo', 1, false);

select * from orders;