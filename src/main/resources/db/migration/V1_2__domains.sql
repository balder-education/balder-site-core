create table class (
	id bigint NOT NULL AUTO_INCREMENT,
	description varchar(255),	
	image varchar(255),
	primary key (id)
);

insert into class (id, description, image) values (1, 'class1', 'http://i.dailymail.co.uk/i/pix/2013/07/03/article-2355212-1AA67955000005DC-841_634x424.jpg');
insert into class (id, description, image) values (2, 'class2', 'http://i.dailymail.co.uk/i/pix/2013/09/10/article-2416686-1BBBF474000005DC-565_634x384.jpg');

create table lesson (
	id bigint NOT NULL AUTO_INCREMENT,
	description varchar(255),
	result_word varchar(255),
	class_id bigint not null,
	image varchar(255),
	finished bit default 0 not null,
	primary key (id)
);

insert into lesson (id, description, result_word, class_id, image) values (1, 'lesson1', 'Fazenda', 1, 'https://image.freepik.com/vetores-gratis/fazenda-fundo-colorido-dos-desenhos-animados_270-161129.jpg');

create table content (
	id bigint NOT NULL AUTO_INCREMENT,
	description varchar(255),
	result_word varchar(255),
	lesson_id bigint not null,
	image varchar(255),
	finished bit default 0 not null,
	primary key (id)
);

insert into content (id, description, result_word, lesson_id, image) values (1, 'content1', 'trator', 1, 'http://comercialscardua.com.br/shopping/produtos/50/vs_trator1250_p.jpg');
insert into content (id, description, result_word, lesson_id, image) values (2, 'content2', 'banana', 1, 'http://www.vacas.info/wp-content/uploads/2013/07/leche_santa_vaca_mundi.jpg');

create table content_word (
	id bigint NOT NULL AUTO_INCREMENT,
	word varchar(255),
	content_id bigint not null,
	primary key (id)
);

insert into content_word (id, word, content_id) values (1, 'a', 1);
insert into content_word (id, word, content_id) values (2, 'e', 1);
insert into content_word (id, word, content_id) values (3, 'i', 1);
insert into content_word (id, word, content_id) values (4, 'o', 1);
insert into content_word (id, word, content_id) values (5, 'u', 1);

insert into content_word (id, word, content_id) values (6, 'ba', 1);
insert into content_word (id, word, content_id) values (7, 'be', 1);
insert into content_word (id, word, content_id) values (8, 'bi', 1);
insert into content_word (id, word, content_id) values (9, 'bo', 1);
insert into content_word (id, word, content_id) values (10, 'bu', 1);

insert into content_word (id, word, content_id) values (11, 'na', 1);
insert into content_word (id, word, content_id) values (12, 'ne', 1);
insert into content_word (id, word, content_id) values (13, 'ni', 1);
insert into content_word (id, word, content_id) values (14, 'no', 1);
insert into content_word (id, word, content_id) values (15, 'nu', 1);

