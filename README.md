# Description
This sample  project makes insert, update and delete by using spring mvc and mysql database.

Technologies used:
```sh
Backend: Spring 4.1.1,JDK 1.8,Maven 3.3.9;
Frontend: JQuery;
IDE: Eclipse (Spring Tool Suite 3.8.0);
DATABASE: MySQL;
```

Function List:
```sh
1.Create Person
2.Read Person
3.Update Person
4.Delete Person
```
To use this application, create db and table column by using this query:

```sh
CREATE TABLE `contact` (
  `contact_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `telephone` varchar(45) NOT NULL,
  PRIMARY KEY (`contact_id`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8;
```

Application can be used by entering ```"localhost:8080/ContactListMySQL/person"``` to your web browser.
