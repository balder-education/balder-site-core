create table user (
	id bigint NOT NULL AUTO_INCREMENT,
	username varchar(255), 
	password varchar(255), 
	email varchar(255), 
	primary key (id)
);

insert into user (id, username, password, email) values (1, 'root','root','root@root.com');

create table user_role (
	id bigint NOT NULL AUTO_INCREMENT,
	role_name varchar(255), 
	user_id bigint,
	primary key (id)
);

insert into user_role (id, role_name, user_id) values (1, 'ROLE_ADMIN', 1);