create table IF NOT EXISTS EVENT  (
     id INT AUTO_INCREMENT NOT NULL,
     name VARCHAR(255),
     PRIMARY KEY (id)
) ENGINE=InnoDB;

create table IF NOT EXISTS TIMETABLE  (
     id INT AUTO_INCREMENT NOT NULL,
     name VARCHAR(255),
     PRIMARY KEY (id)
) ENGINE=InnoDB;

create table IF NOT EXISTS TT_EVENT  (
     tt_id INT NOT NULL,
     event_id INT NOT NULL,
     PRIMARY KEY (tt_id, event_id)
) ENGINE=InnoDB;
