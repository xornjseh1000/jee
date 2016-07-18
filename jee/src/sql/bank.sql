----------[내부 스키마:물리적]-----------------------
create table account(
	account_no int primary key,
	money int,
	id varchar2(20)
);
select * from account;
drop table account;


create view account_member as
select 
   	g.seq as seq, 	
   	g.grade as grade ,
	g.java as java,
	g.sql as sql,
	g.html as html,
	g.javascript as js,
	g.exam_date as exam_date,
	m.id as id,
	m.pw as pw,
	m.name as name,
	m.ssn as ssn,
	m.regDate as reDate
from member m,account g
where m.id = g.id;

insert into account(
		account_no,money,id
)values(
 	23145,56200,'song'
);

select * from account;
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


select  
    account_no as acc,
    id as id,
	name as name,
    money as money,
	ssn as birth
from account_member;
