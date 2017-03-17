create table users(
  user_id INTEGER auto_increment,
  email VARCHAR(25),
  password VARCHAR(25),
  first_name varchar(25),
  last_name varchar(25),
  primary key(user_id)
);

create table roles(
  role_id INTEGER AUTO_INCREMENT,
  role_name VARCHAR(25),
  role_description VARCHAR(50),
  PRIMARY KEY (role_id)
);


create table user_roles(
  user_role_id INTEGER AUTO_INCREMENT,
  user_id INTEGER,
  role_id INTEGER,
  PRIMARY KEY (user_role_id)
);