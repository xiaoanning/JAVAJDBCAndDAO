1. ������

drop table account ;
 
create table account 
(
	card_id number primary key ,
	username varchar2(50) not null ,
	password varchar(6) not null ,
	balance number(20,2) not null ,
	mobile varchar2(11) not null	
)

create sequence account_seq start with 1000 increment by 1 ;

insert into account values(account_seq.nextval,'����','123456',10,'18538375004');

commit ;

2.�������Ӧ��ʵ�����

3.����DAO �ṩ��ɾ�Ĳ鹦��

4.����


