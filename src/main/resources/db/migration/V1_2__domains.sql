create table class (
	id bigint NOT NULL AUTO_INCREMENT,
	description varchar(255),	
	primary key (id)
);

insert into class (id, description) values (1, 'class1');
insert into class (id, description) values (2, 'class2');
insert into class (id, description) values (3, 'class3');
insert into class (id, description) values (4, 'class4');
insert into class (id, description) values (5, 'class5');

create table lesson (
	id bigint NOT NULL AUTO_INCREMENT,
	description varchar(255),
	class_id bigint not null,
	primary key (id)
);

insert into lesson (id, description, class_id) values (1, 'lesson1', 1);
insert into lesson (id, description, class_id) values (2, 'lesson2', 2);
insert into lesson (id, description, class_id) values (3, 'lesson3', 3);
insert into lesson (id, description, class_id) values (4, 'lesson4', 4);
insert into lesson (id, description, class_id) values (5, 'lesson5', 5);


