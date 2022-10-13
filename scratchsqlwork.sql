create table classes(
                        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                        subject VARCHAR(40),
                        crn VARCHAR(20),
                        class VARCHAR(60),
                        start_time TIME(0),
                        end_time TIME(0),
                        day VARCHAR(10),
                        teacher VARCHAR(50),
                        PRIMARY KEY (id)
);


insert into classes(subject, crn, class, start_time, end_time, online_only, day, teacher)
values ('Art', '21665', 'Ceramics(non art)', '12:00:00', '14:45:00', 'false', 'MW', 'Mary Wuest')
       ('Art','21664','Ceramics(non art)','16:00:00','18:45:00', 'false', 'MW','Mary Wuest'),
       ('Art','22311','Ceramics(non art)','08:00:00','10:45:00', 'false', 'TT','Audrey LeGalley'),
       ('Art','21711','Ceramics(non art)','12:00:00','14:45:00', 'false','TT', 'N/A'),
       ('Art','21690','Photography Int.','16:00:00','18:45:00', 'false','MW', 'N/A'),
       ('Art History','21629','Contemporary Art','10:00:00','11:15:00', 'false','TT','Kristy Masten'),
       ('Art History','21719','TAHC: Art And The Holocaust','0','0','True','N/A', 'Julie Johnson'),
       ('Art History','21720','TAHC: Art Of The Andes','08:00:00','09:15:00','false','TT', 'Juliet Wiersema'),
       ('Art History','21722','TAHC: Narrative and Visual Culture','09:00:00','11:45:00','false','F', 'Scott Sherer'),
       ('Art History','21631','TAHC: Performing Gender','13:00:00','14:15:00','MW','false', 'Teresa Eckmann'),
       ('Art History','21718','TAHC: Japanese Art Material','13:00:00','14:15:00','false','TT', 'Edit Toth'),
       ('Classics','17866','Mythology','0','0','True','N/A', 'N/A'),
       ('Classics','15781','Mythology','11:00:00','11:50:00','false','MW', 'Susan Rosenberg'),
       ('Classics','15782','Mythology','11:30:00','12:45:00','false','TT', 'N/A'),
       ('Museum Studies','22010','Fundamentals of Museum Studies','12:00:00','14:45:00','false','F', 'Edit Toth'),
       ('Honors','21868','Professional Dev: Gender and Leadership','18:00:00','20:45:00','false','Wed', 'Tara Schwegler'),
       ('Honors','16771','Professional Dev: Power, Culture, Consequence','13:00:00','14:15:00','false','Tues', 'Brent Floyd');





SELECT * FROM classes WHERE day = 'TT';
+----+-------------+-------+-----------------------------+------------+----------+-------------+------+-----------------+
| id | subject     | crn   | class                       | start_time | end_time | online_only | day  | teacher         |
+----+-------------+-------+-----------------------------+------------+----------+-------------+------+-----------------+
| 21 | Art         | 22311 | Ceramics(non art)           | 08:00:00   | 10:45:00 | false       | TT   | Audrey LeGalley |
| 22 | Art         | 21711 | Ceramics(non art)           | 12:00:00   | 14:45:00 | false       | TT   | N/A             |
| 24 | Art History | 21629 | Contemporary Art            | 10:00:00   | 11:15:00 | false       | TT   | Kristy Masten   |
| 26 | Art History | 21720 | TAHC: Art Of The Andes      | 08:00:00   | 09:15:00 | false       | TT   | Juliet Wiersema |
| 29 | Art History | 21718 | TAHC: Japanese Art Material | 13:00:00   | 14:15:00 | false       | TT   | Edit Toth       |
| 32 | Classics    | 15782 | Mythology                   | 11:30:00   | 12:45:00 | false       | TT   | N/A             |
+----+-------------+-------+-----------------------------+------------+----------+-------------+------+-----------------+
6 rows in set (0.00 sec)

SELECT * FROM classes WHERE day = 'TT' GROUP BY start_time;
+----+-------------+-------+-----------------------------+------------+----------+-------------+------+-----------------+
| id | subject     | crn   | class                       | start_time | end_time | online_only | day  | teacher         |
+----+-------------+-------+-----------------------------+------------+----------+-------------+------+-----------------+
| 21 | Art         | 22311 | Ceramics(non art)           | 08:00:00   | 10:45:00 | false       | TT   | Audrey LeGalley |
| 22 | Art         | 21711 | Ceramics(non art)           | 12:00:00   | 14:45:00 | false       | TT   | N/A             |
| 24 | Art History | 21629 | Contemporary Art            | 10:00:00   | 11:15:00 | false       | TT   | Kristy Masten   |
| 29 | Art History | 21718 | TAHC: Japanese Art Material | 13:00:00   | 14:15:00 | false       | TT   | Edit Toth       |
| 32 | Classics    | 15782 | Mythology                   | 11:30:00   | 12:45:00 | false       | TT   | N/A             |
+----+-------------+-------+-----------------------------+------------+----------+-------------+------+-----------------+
5 rows in set (0.00 sec)

trying to select row with id(26)

trying to select all that are NOT in the list of the subquery(the above list)

----------------------------------------------------------------------------
the subquery when ran by itself return 5 rows(shown above)
and the outer query without the AND clause returns 6 rows(first table shown above)
entire query return 0 rows currently

        SELECT * FROM classes WHERE day = 'TT' AND id NOT IN (
            SELECT id FROM classes
            WHERE day = 'TT'
            GROUP BY start_time
            );
        THIS DOES NOT WORK^^^^
----------------------------------------------------------------------------------



---------------------------------------------------------------------------------------------
SELECT * FROM classes WHERE day = 'TT' AND id NOT IN (
    SELECT id FROM (
    SELECT id FROM classes
    WHERE day = 'TT'
    GROUP BY start_time) AS t2
    );
THIS ONE WORKS^^
+----+-------------+-------+------------------------+------------+----------+-------------+------+-----------------+
| id | subject     | crn   | class                  | start_time | end_time | online_only | day  | teacher         |
+----+-------------+-------+------------------------+------------+----------+-------------+------+-----------------+
| 26 | Art History | 21720 | TAHC: Art Of The Andes | 08:00:00   | 09:15:00 | false       | TT   | Juliet Wiersema |
+----+-------------+-------+------------------------+------------+----------+-------------+------+-----------------+
1 row in set (0.00 sec)

using the group by clause in a subquery would not work unless
i put it inside the FROM section of the first subquery and
used the FROM section to make another query and give it a table alias(the query for the list of ids with distinct start_times)
------------------------------------------------------------------------------------------------------------------------------------