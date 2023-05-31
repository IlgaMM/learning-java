DROP TABLE IF EXISTS STUDENTS;
CREATE TABLE STUDENTS
(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL,
    SURNAME VARCHAR(255) NOT NULL,
    AGE INT NOT NULL DEFAULT 0, SEX VARCHAR(255));
INSERT INTO STUDENTS (NAME, SURNAME, SEX) VALUES ('Olek', 'S.', 'MALE');
INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('Marek', 'W.', 25, 'MALE');
INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('Alina', 'G.', 18, 'FEMALE');
INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('Anna', 'F.', 35, 'FEMALE');
INSERT INTO STUDENTS (NAME, SURNAME, AGE, SEX) VALUES ('EWELINA', 'A.', 40, 'FEMALE');
DELETE FROM STUDENTS WHERE ID = 10;
ALTER TABLE STUDENTS ADD COLUMN GRADE INT;
ALTER TABLE STUDENTS DROP COLUMN GRADE;
ALTER TABLE STUDENTS ADD COLUMN GRADE INT NOT NULL USING 5;
select*
from students;

update students
set age = 18
where id = 1;

select max(id) as max_id, max(age) as max_age, max(grade) as max_grade
from students;

select max(id) + 1
from students;

select *
from STUDENTS;

select max(id) as max_id, max(age) as max_age, max(grade) as max_grade
from students;

select max(id) + 1 from students;


insert into students(name, surname, age, sex, grade)
values ( 'Ela', 'W.', 23, 'FEMALE', 6);
--changing ID column
ALTER TABLE STUDENTS ALTER COLUMN ID SET GENERATED ALWAYS START WITH (select max(id) + 1 from students);

