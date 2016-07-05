create sequence seq
increment by 1
start with 1000
nocycle;

drop table grade;

create table grade(
	seq number constraint grade_pk primary key,
	grade varchar2(1),
	java number,
	sql number,
	html number,
	javascript number,
	id varchar2(20),
	constraint grade_member_fk foreign key (id)
	references member(id) on delete cascade
);
alter table grade add exam_date varchar2(10);
-- create
insert into grade(	seq,grade,java,sql,html,javascript,id,exam_date)values(	seq.nextval,'C',75,72,72,73,'kkk','2016-06');
-- read : list
select * from grade;
-- read : findByPK
select * from grade where seq='1000';
-- read : findByID
select * from grade where id = 'hong';
-- read : count
select count(*) from grade;

-- update : update 
update grade set 과목명 = 점수 where seq = 시퀀스 
where seq = 1000;
-- delete
delete from grade where seq = '1001';
 