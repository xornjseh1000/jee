insert into account values('101031232','박보영','32000','7055658','parklove');

drop table member;

-- CREATE
create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	ssn varchar2(20),
	regDate varchar2(20)
);

-- READ
select * from member
where id = 'choilove';
-- UPDATE
update account set pw = '999'
where id = 'xornjseh';
-- DELETE
delete from account
where id = 'xornjseh'


			
				
				
			