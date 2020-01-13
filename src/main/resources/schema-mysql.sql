drop table if exists videojuego;

create table videojuego (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(5000),
    precio double not null
);

insert into videojuego
(nombre, descripcion, imagen_url,precio )values
("Borderlands 3", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/591676-borderlands-3-playstation-4-front-cover.jpg", "60d"),
("Spiderman Ps4", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/504571-marvel-spider-man-digital-deluxe-edition-playstation-4-front-cover.png","60d"),
("God of war 4", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/474565-god-of-war-playstation-4-front-cover.png", "20d"),
("Minecraft", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/489345-minecraft-nintendo-switch-front-cover.png", "10d"),
("Borderlands 3", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/591676-borderlands-3-playstation-4-front-cover.jpg", "60d"),
("Spiderman Ps4", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/504571-marvel-spider-man-digital-deluxe-edition-playstation-4-front-cover.png","60d"),
("God of war 4", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/474565-god-of-war-playstation-4-front-cover.png", "20d"),
("Minecraft", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/489345-minecraft-nintendo-switch-front-cover.png", "10d");

create table consola(
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(5000),
    precio double not null
);

insert into consola
(nombre, descripcion, imagen_url,precio )values
("PlayStatio 4", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://psmedia.playstation.com/is/image/psmedia/ps4-slim-black-two-column-buy-01-en-13nov18_1542102620416?$Icon$", "250d"),
("Xbox one s", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE3SQnt?ver=5797&q=90&m=6&h=1445&w=1849&b=%23FFFFFFFF&f=jpg&o=f&aim=true","200d"),
("Xbox 360", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.traitech.co/wp-content/uploads/2018/05/Xbox360.jpg", "100   d"),
("Ninetendo Switch", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://images-na.ssl-images-amazon.com/images/I/61JnrafZ7zL._AC_SL1457_.jpg", "300d");