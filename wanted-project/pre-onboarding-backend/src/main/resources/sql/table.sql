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

