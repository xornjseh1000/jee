insert into member(id,pw,name,regdate,ssn,email,profile_img) values('xornjseh10000','1','박보영','2015-05-19','900102','parklove@naver.com','lee.jpg');
insert into member values('xornjseh10000','1','박보영','2015-05-19','900102','parklove@naver.com','lee.jpg');
insert into member values('xornjseh10000','1','박보영','2015-05-19','900102','parklove@naver.com','lee.jpg');


drop table member;

-- CREATE
create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	regDate varchar2(20),
	ssn varchar2(20),
	email varchar2(30),
	profile_img varchar2(100)
);
-------------[외부 스키마 : 논리적]---------------------
create view account_member as
select  
a.account_no as account_no,
    a.money as money,
    m.id as id,
    m.pw as pw,
    m.name as name,
    m.reg_date as reg_date,
    m.ssn as ssn
from
member m, account a 
where m.id = a.id;
-- READ()
select * from member; --list
select * from member where id = 'lee'; -- findByPK
select * from member where gender = '남'; -- findByNotPK
select count(*) from member ; -- count

-- UPDATE
update member set profile_img = id || '.jpg';
update member set email = id || 'hong@test.com'; where id = 'hong';
update member set regdate = '2014-07-15' where id = 'iu';
alter table member add email varchar2(30);
alter table member add profile_img varchar2(100);
-- DELETE
delete from account
where id = 'bbb';
delete member;


select * from tab;			
				
create view account_member as
select 
 	a.account_no as account_no,
    a.money as money,
    m.id as id,
    m.pw as pw,
    m.name as name,
    m.regdate as regdate,
    m.ssn as ssn
from 
	member m, account a 
where m.id = a.id;
				
			select count(*) as count from member where id = 'kkk';