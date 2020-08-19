/** create the stocks database */

DROP TABLE IF EXISTS quotes CASCADE;
CREATE TABLE quotes(
   id INT NOT NULL AUTO_INCREMENT,
   symbol VARCHAR(4) NOT NULL,
   time DATETIME NOT NULL,
   price DECIMAL NOT NULL,
   PRIMARY KEY ( id )
);

INSERT INTO quotes (symbol,time,price) VALUES ('GOOG','2004-08-19 00:00:01','85.00');
INSERT INTO quotes (symbol,time,price) VALUES ('GOOG','2015-02-03 00:00:01','527.35');
INSERT INTO quotes (symbol,time,price) VALUES ('APPL','2000-01-01 00:00:01','118.27');
INSERT INTO quotes (symbol,time,price) VALUES ('AMZN','2015-02-03 00:00:01','363.21');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-03-15 00:00:01','128.15');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-03-16 00:00:01','142.42');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-03-17 00:00:01','148.65');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-03-18 00:00:01','156.23');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-03-19 00:00:01','115.90');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-03-20 00:00:01','118.03');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-04-10 00:00:01','137.47');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-04-10 01:00:01','142.36');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-04-10 02:00:01','143.54');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-04-10 03:00:01','144.29');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-04-10 04:00:01','145.11');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-04-10 05:00:01','146.54');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-04-10 06:00:01','149.87');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-06-11 00:00:01','171.63');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-06-11 12:00:01','173.54');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-06-13 00:00:01','167.78');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-06-13 12:00:01','164.29');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-06-14 00:00:01','161.12');
INSERT INTO quotes (symbol,time,price) VALUES ('UML','2020-06-14 12:00:01','158.29');
