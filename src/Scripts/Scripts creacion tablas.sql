CREATE TABLE Tipo_Id (
  Id_tipo_Id int,
  nombre varchar(50),
  PRIMARY KEY (Id_tipo_Id)
);

CREATE TABLE estado_civil (
  Id_estado_civil int,
  nombre varchar(50),
  PRIMARY KEY (Id_estado_civil)
);

CREATE TABLE sexo (
  Id_sexo int,
  nombre varchar(50),
  PRIMARY KEY (Id_sexo)
);

CREATE TABLE funcionario (
  Id_funcionario int,
  Id_tipo_Id int,
  numero_Id int,
  nombres varchar(50),
  apellidos varchar(50),
  direccion varchar(250),
  telefono varchar,
  fecha_nacimiento date,
  Id_estado_civil int,
  Id_sexo int,
  PRIMARY KEY (Id_funcionario),
  FOREIGN KEY (Id_tipo_Id) REFERENCES tipo_Id(Id_tipo_Id),
  FOREIGN KEY (Id_sexo) REFERENCES sexo(Id_sexo),
  FOREIGN KEY (Id_estado_civil) REFERENCES estado_civil(Id_estado_civil)
);

CREATE TABLE rol_familiar (
  Id_rol_familiar int,
  nombre varchar(50),
  PRIMARY KEY (Id_rol_familiar)
);

CREATE TABLE grupo_familiar (
  Id_grupo_familiar int,
  nombres varchar(50),
  apellidos varchar(50),
  direccion varchar,
  telefono varchar,
  fecha_creacion timestamp,
  fecha_actualizacion timestamp,
  Id_funcionario int,
  Id_rol_familiar int,
  PRIMARY KEY (Id_grupo_familiar),
  FOREIGN KEY (Id_funcionario) REFERENCES funcionario(Id_funcionario),
  FOREIGN KEY (Id_rol_familiar) REFERENCES rol_familiar(Id_rol_familiar)
);


CREATE TABLE estado_formacion (
  Id_estado_formacion int,
  nombre varchar(250),
  fecha_creacion timestamp,
  fecha_actualizacion timestamp,
  PRIMARY KEY (Id_estado_formacion)
);

CREATE TABLE nivel_educativo(
  Id_nivel_educativo int,
  nombre varchar(250),
  fecha_creacion timestamp,
  fecha_actualizacion timestamp,
  PRIMARY KEY (Id_nivel_educativo)
);

CREATE TABLE universidad (
  Id_universidad int,
  nombre varchar(250),
  PRIMARY KEY (Id_universidad)
);

CREATE TABLE formacion_academica (
  Id_formacion_academica int,
  fecha_inicio date,
  fecha_fin date,
  Id_estado_formacion int,
  Id_nivel_educativo int,
  Id_universidad int,
  Id_funcionario int,
  fecha_creacion timestamp,
  fecha_actualizacion timestamp,
  PRIMARY KEY (Id_formacion_academica),
  FOREIGN KEY (Id_nivel_educativo) REFERENCES nivel_educativo(id_nivel_educativo),
  FOREIGN KEY (Id_estado_formacion) REFERENCES estado_formacion(id_estado_formacion),
  FOREIGN KEY (Id_universidad) REFERENCES universidad(id_universidad),
  FOREIGN KEY (Id_funcionario) REFERENCES funcionario(id_funcionario)
);