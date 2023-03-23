create database fullStack; 
create table orders(
	Id INT PRIMARY KEY AUTO_INCREMENT,
    description varchar(30), 
    restaurant varchar(30),
    rating INT, 
    orderAgain Boolean
);

insert into orders (description, restaurant, rating, orderAgain)
values('Italian style Pasta favs', 'Pasta Primavera', 8, true), 
('Your Local Pizza Place',' Rishi Pizza', 10,true), 
('Japanese Favorite','sushi', 11, true), 
('Famous for Alfredo Sauce','Pasta Alfredo', 1, false);

select * from orders;