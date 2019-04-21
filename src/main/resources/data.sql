INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO) VALUES ('Piccadilly', 'P1', '1Q');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO) VALUES ('Piccadilly', 'P2', '1Q');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO) VALUES ('Piccadilly', 'P3', '1Q');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO) VALUES ('Piccadilly', 'P4', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO) VALUES ('Piccadilly', 'P5', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO) VALUES ('Piccadilly', 'P6', '2D');


insert into projects ( id, description, bill_to, bill_code, rate, max_hours) values ('T1', 'test project 1', 'ATT', '02923-01', 100, 2000);
insert into projects ( id, description, bill_to, bill_code, rate, max_hours) values ('EXXON1', '2 week eval', 'Exxon', '0001', 10000, 1);


insert into hours ( project, starts, ends, hours, description, est_paydate, payment_id) values ('T1', '2019-01-01 08:00:00.000', '2019-01-01 10:00:00.000', 2, 'planning', null, null);
