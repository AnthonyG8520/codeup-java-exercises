mysql.server status
mysql.server start
mysql -u USERNAME -p

SELECT user, host FROM mysql.user;

CREATE USER 'billy'@'localhost' IDENTIFIED BY 'billysSecretP@ass123';
create using ip address
CREATE USER 'sally'@'192.168.77.1' IDENTIFIED BY 'passwordForSally321';
DROP USER 'sally'@'localhost';

GRANT ALL ON *.* TO 'billy'@'localhost';
SHOW GRANTS for 'username'@'hostname';

