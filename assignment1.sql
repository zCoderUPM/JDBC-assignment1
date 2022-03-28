 create database db1;
 create table db1.Student (
  `rollNo` int DEFAULT NULL,
  `studentID` int NOT NULL,
  `studentName` varchar(25) DEFAULT NULL,
  `department` varchar(35) DEFAULT NULL,
  PRIMARY KEY (`studentID`)
 );
 
 insert into Student values (1, 278875, 'Ikmal Hazim', 'Computer System');
 insert into Student values (2, 334998, 'Low Ying Ling', 'Computer Network');
 insert into Student values (3, 200982, 'Kaneshwaren', 'Multimedia');
 insert into Student values (4, 233709, 'Mohammed', 'Software Engineering');
 insert into Student values (5, 109984, 'Dini Mokhtar', 'Computer Network');
