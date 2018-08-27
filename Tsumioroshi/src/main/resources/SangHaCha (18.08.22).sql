// Drop 문
drop table release_log;
drop table stock_log;
drop table members;
drop table message;
drop table product;
drop table first_category;
drop table second_category;
drop table shelf;

// Create 문
// 출고 기록 테이블 생성
create table release_Log(
    Product_Name varchar2(20 char) not null,
    Product_Number varchar2(12 char) primary key,
    Order_Number number not null,
    Order_Date date not null,
    Log_Date date default sysdate not null,
    destination varchar2(100 char) not null,
    delivery_amount number not null,
    charge1 varchar2(20),
    charge2 varchar2(20),
    confirm_date date default sysdate
);

// 입고 기록 테이블 생성
create table stock_Log(
    Product_Name varchar2(20 char) not null,
    Product_Number varchar2(12 char) primary key,
    Order_Number number not null,
    Order_Date date not null,
    Log_Date date default sysdate not null,
    departure varchar2(100 char) not null,
    stock_amount number not null,
    charge1 varchar2(20),
    charge2 varchar2(20),
    confirm_date date default sysdate
);

// 사용자 테이블 생성
create table members(
    id varchar2(20) CONSTRAINT members_id_PK PRIMARY KEY,
    password varchar2(20) not null,
    masterpw VARCHAR2(20),
    authority varchar2(20) CONSTRAINT members_authority_CK CHECK
    (authority = 'WareHouse' OR authority = 'OfficeWork' OR authority  = 'Master')
);

// 멤버 넣기 예문 (임시)
insert INTO members VALUES ('master', 'master','master', 'Master');
insert Into members values ('work', 'work', null, 'OfficeWork');
insert Into members values ('ware', 'ware', null, 'WareHouse');

// 메세지 테이블 생성
create table message(
    message_no number primary key,
    id varchar2(20),
    password varchar2(20) not null,
    title varchar2(20) not null,
    regdate date default sysdate not null,
    content varchar2(1000) not null,
    confirm varchar2(20)
);

// 제품 테이블 생성 (PK 삭제)
create table product(
    Product_Name varchar2(20 char) not null,
    Product_Number varchar2(12 char) not null,,
    Tag_Number varchar2(7) not null,
    quantity number not null,
    expiration_date date,
    stock_date date default sysdate not null,
    product_Location varchar2(7) not null
);

// 대분류 테이블 생성
create table first_category(
    fc_code varchar2(20) primary key,
    fc_name varchar2(20) not null
);

// 소분류 테이블 생성
create table second_category(
    fc_code varchar2(20),
    sc_code varchar2(20) primary key,
    sc_name varchar2(20) not null,
    constraint fk_second_category_fc_code foreign key(fc_code) references first_category(fc_code)
);

// 선반 테이블 생성
create table shelf(
    shelf_name varchar2(20) primary key,
    shelf_size varchar2(40) not null,
    shelf_location varchar2(40) not null,
    shelf_condition char(1) default 'T',
    shelf_Tag varchar2(7) not null
);

commit;