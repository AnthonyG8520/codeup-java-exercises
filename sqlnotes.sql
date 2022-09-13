mysql.server status
mysql.server start
mysql -u USERNAME -p

shows user and host from user table in mysql database
SELECT user, host FROM mysql.user;

CREATE USER 'billy'@'localhost' IDENTIFIED BY 'billysSecretP@ass123';
creating using ip address
CREATE USER 'sally'@'192.168.77.1' IDENTIFIED BY 'passwordForSally321';
DROP USER 'sally'@'localhost';

GRANT ALL ON *.* TO 'billy'@'localhost';
SHOW GRANTS for 'username'@'hostname';


creating tables
CREATE TABLE table_name (
                            column1_name data_type,
                            column2_name data_type,
    ...
);
table example
CREATE TABLE quotes (
                        author_first_name VARCHAR(50),
                        author_last_name  VARCHAR(100) NOT NULL,
                        content TEXT NOT NULL
);

showing primary key for table
A primary key is a special type of column with the following rules:
Each value must be unique.
They cannot be NULL.
There can only be one primary key in a table.
CREATE TABLE quotes (
                        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                        author_first_name VARCHAR(50),
                        author_last_name  VARCHAR(100) NOT NULL,
                        content TEXT NOT NULL,
                        PRIMARY KEY (id)
);

Showing default value for when a field has no value
CREATE TABLE quotes (
                        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                        author_first_name VARCHAR(50) DEFAULT 'NONE',
                        author_last_name  VARCHAR(100) NOT NULL,
                        content TEXT NOT NULL,
                        PRIMARY KEY (id)
);

sub-query syntax
SELECT column_a, column_b, column_c
FROM table_a
WHERE column_a IN (
    SELECT column_a
    FROM table_b
    WHERE column_b = true
);

join syntax - reading tables using join
SELECT columns
FROM table_a as A
JOIN table_b as B ON A.id = B.fk_id;

For WINDOWS:
to run an sql file from within a running mysql instance use keyword 'source'
if script has embedded files that are in the same directory they must also have the full path specified (as shown below)
mysql> source /Users/nsebhastian/Desktop/test/main.sql





