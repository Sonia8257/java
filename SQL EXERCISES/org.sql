create database org;

use org ;

create table Worker (
	worker_id int not null primary key auto_increment,
	first_name varchar(25),
	last_name varchar(25),
	salary int(15),
	joining_date datetime,
	department varchar(25)
);

insert into Worker ( worker_id , first_name , last_name , salary , joining_date , department )  values
(001, 'Monika', 'Arora', 100000, '14-02-20 09.00.00', 'HR'),
(002, 'Niharika', 'Verma', 80000, '14-06-11 09.00.00', 'Admin'),
(003, 'Vishal', 'Singhal', 300000, '14-02-20 09.00.00', 'HR'),
(004, 'Amitabh', 'Singh', 500000, '14-02-20 09.00.00', 'Admin'),
(005, 'Vivek', 'Bhati', 500000, '14-06-11 09.00.00', 'Admin'),
(006, 'Vipul', 'Diwan', 200000, '14-06-11 09.00.00', 'Account'),
(007, 'Satish', 'Kumar', 75000, '14-01-20 09.00.00', 'Account'),
(008, 'Geetika', 'Chauhan', 90000, '14-04-11 09.00.00', 'Admin');

create table Bonus (
worker_ref_id  int,
	bonus_amount int(10),
	bonus_date datetimE,
	foreign key (worker_ref_id)
	references Worker(worker_id)
	on delete cascade
);

insert into Bonus (worker_ref_id , bonus_amount , bonus_date ) values
(001, 5000, '16-02-20'),
(002, 3000, '16-06-11'),
(003, 4000, '16-02-20'),
(001, 4500, '16-02-20'),
(002, 3500, '16-06-11');

create table  Title (
	worker_ref_id int,
	worker_title CHAR(25),
	affected_from DATETIME,
	foreign key (worker_ref_id)
		references Worker(worker_id)
        on delete cascade
);

insert into  Title (worker_ref_id, worker_title ,affected_from ) VALUES
 (001, 'Manager', '2016-02-20 00:00:00'),
 (002, 'Executive', '2016-06-11 00:00:00'),
 (008, 'Executive', '2016-06-11 00:00:00'),
 (005, 'Manager', '2016-06-11 00:00:00'),
 (004, 'Asst. Manager', '2016-06-11 00:00:00'),
 (007, 'Executive', '2016-06-11 00:00:00'),
 (006, 'Lead', '2016-06-11 00:00:00'),
 (003, 'Lead', '2016-06-11 00:00:00');
 
 
 select * from worker ;
 
 -- 1.  Write an SQL query to fetch “FIRST_NAME” from Worker table using the alias name as <WORKER_NAME>.
 
 select first_name as worker_name from Worker;
 
 -- 2. Write an SQL query to fetch “FIRST_NAME” from Worker table in upper case
 
 select upper(first_name) from  Worker ;
 
 -- 3.Write an SQL query to fetch unique values of DEPARTMENT from Worker table.
 
select distinct department from Worker ;

  -- 4. Write an SQL query to print the FIRST_NAME and LAST_NAME from Worker table into a single column COMPLETE_NAME. 
  -- A space char should separate them.
  
  select concat(first_name , last_name ) as COMPLETE_NAME  
  from Worker ; 
 
 -- 5. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending.
 
select worker_id,
	  first_name ,
      last_name , 
      salary , 
      joining_date,
      department
      from Worker order by first_name asc ;
      
      -- 6. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME
      -- Ascending and DEPARTMENT Descending.
      
      select worker_id,
	  first_name ,
      last_name , 
      salary , 
      joining_date,
      department
      from Worker order by first_name asc , department desc ;
  
   -- 7. Write an SQL query to print details for Workers with the first name as “Vipul” and “Satish” from Worker table.

 select * 
      from Worker where first_name in ( ' vipul '  'sathish ') ;

 -- 8. Write an SQL query to print details of workers excluding first names, “Vipul” and “Satish” from Worker table.

select * from Worker 
where first_name not in ('Vipul ' , ' Sathish ' );

-- 9. Write an SQL query to print details of Workers with DEPARTMENT name as “Admin”.

select  worker_id,
	  first_name ,
      last_name , 
      salary , 
      joining_date,
      department 
      from Worker;
      
      -- 10. Write an SQL query to print details of the Workers whose FIRST_NAME contains ‘a’.
      
      select * from Worker 
      where  first_name  like '%a%' ;
  
     -- 11.Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘a’.
     
     select * from Worker
     where first_name like 'a% ' ;
     
     -- 12.Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘h’ and contains six alphabets.
     
     -- 13. Write an SQL query to print details of the Workers whose SALARY lies between 100000 and 500000.

select * from Worker where salary between 100000 and 500000 ;

-- 14.Write an SQL query to print details of the Workers who have joined in Feb’2014.
 select * from Worker where year(joining_date) = and
 
 select now(), year(now()),month(now());
 select joining_date , year( joining_date) , month(joining_date) from Worker;
 
 -- 15. Write an SQL query to fetch the count of employees working in the department ‘Admin’.
 
 select count(worker_id) from Worker;
 
 -- 16. Write an SQL query to fetch worker names with salaries >= 50000 and <= 100000.
 
select * from Worker where salary between 100000 and 500000 ;
 
 -- 17.Write an SQL query to fetch the no. of workers for each department in the descending order
 
 select worker_id from worker order by department desc ;
 
 -- 18.Write an SQL query to print details of the Workers who are also Managers.
 
select *
from Worker 
where (manager   IN (select worker_title from Title));

-- 19 .Write an SQL query to fetch duplicate records having matching data in some fields of a table.

select worker_title , affected_from , count(*)
from title
group by worker_title , affected_from
having count(*)>1;

-- 20. Write an SQL query to show only odd rows from a table

select * from workers where mod (worker_id , 2 ) = 1 ;

select mod(11,2);

select worker_id 
from worker;

-- 21. . Write an SQL query to show only even rows from a table.
select * from workers where mod (worker_id , 2 ) = 0;

select worker_id 
from worker;

 -- 22.  Write an SQL query to show the current date and time.
 
 select getdate();
 select gettime() ;

-- 23. Write an SQL query to show the top n (say 10) records of a table.
SELECT * FROM Worker ORDER BY Salary DESC LIMIT 10;

-- 24. Write an SQL query to determine the nth (say n=5) highest salary from a table.

 Select salary from worker order by salary DESC limit 3,1;
 
 -- 25.. Write an SQL query to fetch the list of employees with the same salary.


-- 26 .Write an SQL query to show the second highest salary from a table.

select *from employee 
group by salary 
order by  salary desc limit 1,1;

-- 27.Write an SQL query to fetch the first 50% records from a table.

select top  percent  from Worker ;

-- 28 .  Write an SQL query to fetch the departments that have less than five people in it.
SELECT worker_id, department_id
FROM Worker WHERE department_id IN
(SELECT department_id FROM worker GROUP
BY DEPARTMENT_NAME HAVING COUNT(*)<2);

-- 29 .Write an SQL query to show all departments along with the number of people in there.

SELECT department_id ,
COUNT(*)
FROM worker
GROUP BY department_id;

-- 30 . Write an SQL query to show the last record from a table

Select  last(worker_id,
	  first_name ,
      last_name , 
      salary , 
      joining_date,
      department)
from Worker;

-- 31. Write an SQL query to fetch the first row of a table.
Select  first(worker_id,
	  first_name ,
      last_name , 
      salary , 
      joining_date,
      department)
from Worker;

-- 32. Write an SQL query to fetch three max salaries from a table.

select distinct salary from Worker
order by salary desc LIMIT 3; 

-- 33. Write an SQL query to fetch three min salaries from a table.

select distinct salary from Worker
order by salary asc LIMIT 3; 

-- 34. Write an SQL query to fetch departments along with the total salaries paid for each of them.

select deparment_id, SUM(salary) 
FROM Worker 
GROUP BY deparment_id;

-- 35. Write an SQL query to fetch the names of workers who earn the highest salary

select first_name , salary
FROM Worker
WHERE salary = (SELECT max(salary) 
                FROM Worker) ;
                

