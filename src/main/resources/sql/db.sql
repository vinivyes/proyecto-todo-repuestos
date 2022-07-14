CREATE IF NOT EXISTS SCHEMA todorepuestos;

USE todorepuestos;

CREATE TABLE IF NOT EXISTS marcas (
    id_marca INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    logo_url VARCHAR(1024) NOT NULL,
    descripcion VARCHAR(512) NOT NULL
);

CREATE TABLE IF NOT EXISTS repuestos (
    id_repuesto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_marca INT NOT NULL FOREIGN KEY fk_repuesto_marca_id REFERENCES marcas(id_marca)
    nombre VARCHAR(100) NOT NULL,
    imagen_url VARCHAR(1024) NOT NULL,
    descripcion VARCHAR(512) NOT NULL
);