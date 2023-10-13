CREATE TABLE users (
    user_id VARCHAR(255) PRIMARY KEY,
    posting_id INT,
    FOREIGN KEY (posting_id) REFERENCES job_posting(id)
);

CREATE TABLE posting (
    posting_id INT AUTO_INCREMENT PRIMARY KEY,
    company_id VARCHAR(255),
    position VARCHAR(255),
    pay INT,
    content TEXT,
    technology VARCHAR(255),
    FOREIGN KEY (company_id) REFERENCES company(company_id)
);
CREATE TABLE company (
    company_id VARCHAR(255) PRIMARY KEY,
	country VARCHAR(255),
    region VARCHAR(255),
    company_name VARCHAR(255)
);

-- SQL 명령어를 사용하여 DB View 생성
CREATE VIEW post_list AS
SELECT p.posting_id, c.company_name, c.country, c.region, p.position, p.pay, p.technology
FROM posting p
JOIN company c ON p.company_id = c.company_id;

CREATE TABLE posting_id_list (
     id INT AUTO_INCREMENT PRIMARY KEY,
     company_id VARCHAR(255),
     posting_id INT )

CREATE TABLE Member (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id VARCHAR(255),
    pwd VARCHAR(255),
    applied BOOLEAN
);

