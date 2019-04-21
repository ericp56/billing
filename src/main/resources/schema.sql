CREATE TABLE ROOM(
  ROOM_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(16) NOT NULL,
  ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
  BED_INFO CHAR(2) NOT NULL
);
CREATE TABLE hours (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    project VARCHAR(255),
    starts timestamp ,
    ends timestamp ,
    hours decimal(10,2),
    description VARCHAR(512),
    est_paydate timestamp ,
    payment_id BIGINT
);


CREATE TABLE projects (
    id VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    bill_to VARCHAR(255),
    bill_code VARCHAR(255),
    rate BIGINT,
    max_hours BIGINT
);
CREATE TABLE bill_code_ref (
    project VARCHAR(255),
    bill_code VARCHAR(255)
);


CREATE TABLE categories (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE expenses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    date date,
    amount decimal(10,2),
    description VARCHAR(255),
    receipt VARCHAR(255),
    category_id BIGINT
);

CREATE TABLE miles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    date date,
    mileage decimal(5,1),
    end_odometer decimal(7,1),
    description VARCHAR(255)
);

CREATE TABLE payments (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    project VARCHAR(255),
    received timestamp ,
    amount decimal(10,2),
    description VARCHAR(255)
);

CREATE TABLE resume_info (
    project VARCHAR(255),
    title VARCHAR(255),
    started date,
    ended date,
    description VARCHAR(255),
    skills VARCHAR(255)
);


