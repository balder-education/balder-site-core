create table class (
	id bigint NOT NULL AUTO_INCREMENT,
	description varchar(255),	
	image varchar(255),
	primary key (id)
);

insert into class (id, description, image) values (1, 'class1', 'https://image.freepik.com/vetores-gratis/fazenda-fundo-colorido-dos-desenhos-animados_270-161129.jpg');
insert into class (id, description, image) values (2, 'class2', 'https://image.freepik.com/vetores-gratis/fazenda-fundo-colorido-dos-desenhos-animados_270-161129.jpg');
insert into class (id, description, image) values (3, 'class3', 'https://image.freepik.com/vetores-gratis/fazenda-fundo-colorido-dos-desenhos-animados_270-161129.jpg');
insert into class (id, description, image) values (4, 'class4', 'https://image.freepik.com/vetores-gratis/fazenda-fundo-colorido-dos-desenhos-animados_270-161129.jpg');
insert into class (id, description, image) values (5, 'class5', 'https://image.freepik.com/vetores-gratis/fazenda-fundo-colorido-dos-desenhos-animados_270-161129.jpg');

create table lesson (
	id bigint NOT NULL AUTO_INCREMENT,
	description varchar(255),
	result_word varchar(255),
	class_id bigint not null,
	image varchar(255),
	primary key (id)
);

insert into lesson (id, description, result_word, class_id, image) values (1, 'lesson1', 'banana', 1, 'http://static.hsw.com.br/gif/how-to-draw-construction-vehicles-57.jpg');
insert into lesson (id, description, result_word, class_id, image) values (2, 'lesson2', 'banana', 2, 'http://static.hsw.com.br/gif/how-to-draw-construction-vehicles-57.jpg');
insert into lesson (id, description, result_word, class_id, image) values (3, 'lesson3', 'banana', 3, 'http://static.hsw.com.br/gif/how-to-draw-construction-vehicles-57.jpg');
insert into lesson (id, description, result_word, class_id, image) values (4, 'lesson4', 'banana', 4, 'http://static.hsw.com.br/gif/how-to-draw-construction-vehicles-57.jpg');
insert into lesson (id, description, result_word, class_id, image) values (5, 'lesson5', 'banana', 5, 'http://static.hsw.com.br/gif/how-to-draw-construction-vehicles-57.jpg');

create table lesson_word (
	id bigint NOT NULL AUTO_INCREMENT,
	word varchar(255),
	lesson_id bigint not null,
	primary key (id)
);

insert into lesson_word (id, word, lesson_id) values (1, 'a', 1);
insert into lesson_word (id, word, lesson_id) values (2, 'e', 1);
insert into lesson_word (id, word, lesson_id) values (3, 'i', 1);
insert into lesson_word (id, word, lesson_id) values (4, 'o', 1);
insert into lesson_word (id, word, lesson_id) values (5, 'u', 1);

insert into lesson_word (id, word, lesson_id) values (6, 'ba', 1);
insert into lesson_word (id, word, lesson_id) values (7, 'be', 1);
insert into lesson_word (id, word, lesson_id) values (8, 'bi', 1);
insert into lesson_word (id, word, lesson_id) values (9, 'bo', 1);
insert into lesson_word (id, word, lesson_id) values (10, 'bu', 1);

insert into lesson_word (id, word, lesson_id) values (11, 'na', 1);
insert into lesson_word (id, word, lesson_id) values (12, 'ne', 1);
insert into lesson_word (id, word, lesson_id) values (13, 'ni', 1);
insert into lesson_word (id, word, lesson_id) values (14, 'no', 1);
insert into lesson_word (id, word, lesson_id) values (15, 'nu', 1);

