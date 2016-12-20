# JAVAJDBCAndDAO
JAVA JDBC and DAO

1. 创建表

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

insert into account values(account_seq.nextval,'张三','123456',10,'18538375004');

commit ;

2.创建表对应的实体对象

3.创建DAO 提供增删改查功能

4.测试

