drop table if exists videojuego;
drop table if exists consola;
drop table if exists distribuidor;
drop table if exists desarrollador;
create table videojuego (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(5000),
    fecha int,
    precio double not null
);

insert into videojuego
(nombre, descripcion, imagen_url,precio, fecha )values
("Borderlands 3", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/591676-borderlands-3-playstation-4-front-cover.jpg", "60", "2019"),
("Spiderman Ps4", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/504571-marvel-spider-man-digital-deluxe-edition-playstation-4-front-cover.png","60", "2018"),
("God of war 4", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/474565-god-of-war-playstation-4-front-cover.png", "20", "2018"),
("Minecraft", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.mobygames.com/images/covers/l/489345-minecraft-nintendo-switch-front-cover.png", "10", "2017"),
("Red Dead Redemption II", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://cdn-products.eneba.com/resized-products/6M1qP76B-j6vdX0T4bFCHgJeX99MaKBpXFxbpif1MqY_390x400_1x-0.jpeg", "40", "2018"),
("Sekiro: Shadows Die Twice ", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://playtecgames.com/wp-content/uploads/2019/03/81sY3MF2U8L._AC_SL1500_.jpg","50", "2019"),
("Halo: The Master Chief Collection ", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://media.gamestop.com/i/gamestop/10115398/Halo-The-Master-Chief-Collection?$pdp$", "20", "2014"),
("Fifa 20", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://media.playstation.com/is/image/SCEA/fifa-20-champions-edition-01-ps4-us-05sep19?$native_nt$", "30", "2019");

create table consola(
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(5000),
    precio double not null
);

insert into consola
(nombre, descripcion, imagen_url,precio )values
("PlayStation 4", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://psmedia.playstation.com/is/image/psmedia/ps4-slim-black-two-column-buy-01-en-13nov18_1542102620416?$Icon$", "250"),
("Xbox one S", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE3SQnt?ver=5797&q=90&m=6&h=1445&w=1849&b=%23FFFFFFFF&f=jpg&o=f&aim=true","200"),
("Xbox 360", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://www.traitech.co/wp-content/uploads/2018/05/Xbox360.jpg", "100"),
("Nintendo Switch", "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://images-na.ssl-images-amazon.com/images/I/61JnrafZ7zL._AC_SL1457_.jpg", "300");

create table distribuidor(
    id int primary key auto_increment,
    nombre varchar(200) not null,
    sitio_web varchar(500)
);

insert into distribuidor
(nombre, sitio_web)values 
("2k","https://2k.com/en-US/"),
("Sony Interactive Entertainment", "https://www.playstation.com/es-ar/"),
("Mojang", "https://www.mojang.com"),
("Take2", "https://www.take2games.com"),
("Activision", "https://www.activision.com/es/"),
("Xbox Games Studios", "https://www.xbox.com/es-AR/xbox-game-studios"),
("Electronic Arts","https://www.ea.com/es-es/games");

alter table videojuego
add column distribuidor_id int,
add foreign key(distribuidor_id) references distribuidor(id);

update videojuego set distribuidor_id = 1 where id in (1);
update videojuego set distribuidor_id = 2 where id in (2,3);
update videojuego set distribuidor_id = 3 where id in (4);
update videojuego set distribuidor_id = 4 where id in (5);
update videojuego set distribuidor_id = 5 where id in (6);
update videojuego set distribuidor_id = 6 where id in (7);
update videojuego set distribuidor_id = 7 where id in (8);

create table desarrollador(
    id int primary key auto_increment,
    nombre varchar(200),
    sitio_web varchar(500)
);
insert into desarrollador
(id, nombre, sitio_web)values 
("1" ,"Gearbox Software","https://www.gearboxsoftware.com"),
("2" ,"Insomniac Games", "https://www.insomniacgames.com"),
("3" ,"SCE Santa Monica Studio", "https://sms.playstation.com"),
("4" ,"Mojang AB", "https://www.mojang.com"),
("5" ,"Rockstar Games", "https://www.rockstar.com"),
("6" ,"From Software", "https://www.fromsoftware.jp/en/"),
("7" ,"343 Industries", "https://www.343industries.com"),
("8" ,"EA Canada","https://www.ea.com/careers/careers-overview/vancouver");

alter table videojuego
add column desarrollador_id int,
add foreign key(desarrollador_id) references desarrollador(id);

update videojuego set desarrollador_id = 1 where id in (1);
update videojuego set desarrollador_id = 2 where id in (2);
update videojuego set desarrollador_id = 3 where id in (3);
update videojuego set desarrollador_id = 4 where id in (4);
update videojuego set desarrollador_id = 5 where id in (5);
update videojuego set desarrollador_id = 6 where id in (6);
update videojuego set desarrollador_id = 7 where id in (7);
update videojuego set desarrollador_id = 8 where id in (8);