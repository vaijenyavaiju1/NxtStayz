CREATE TABLE IF NOT EXISTS hotel(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    location varchar(255),
    rating int
);

CREATE TABLE IF NOT EXISTS room(
    id int PRIMARY KEY AUTO_INCREMENT,
    roomNumber varchar(255),
    type varchar(255),
    price double ,
    hotelId int ,
    FOREIGN KEY(hotelId) REFERENCES hotel(id)
);