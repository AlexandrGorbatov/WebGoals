drop database IF exists goal;
create database IF not exists goal;

USE goal;

create table theme(
  id int primary key auto_increment,
  name varchar(100) not null,
  description varchar(100));

create table sub_theme(
  id int primary key auto_increment,
  name varchar(100) NOT NULL,
  start_data datetime NOT NULL,
  end_data datetime NOT NULL,
  is_finished BOOL,
  them_id int,
  foreign key (them_id)references theme(id));