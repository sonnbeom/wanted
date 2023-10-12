//company query
INSERT INTO Company (company_id, country, company_name, region)
VALUES ('company_Id1', '한국', 'it 서울', '서울');

INSERT INTO Company (company_id, country, company_name, region)
VALUES ('company_Id2', '한국', 'it 대구', '대구');

INSERT INTO Company (company_id, country, company_name, region)
VALUES ('company_Id3', '미국', 'it 텍사스', '텍사스');

INSERT INTO Company (company_id, country, company_name, region)
VALUES ('company_Id4', '영국', 'it 런던', '런던');

INSERT INTO Company (company_id, country, company_name, region)
VALUES ('company_Id5', '영국', 'it 런던', '런던');

INSERT INTO Company (company_id, country, company_name, region)
VALUES ('company_Id6', '일본', 'it 도쿄', '도쿄');

// posting query
-- 예시 데이터 1
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id2', 'Software Engineer', 80000, 'This is an example job description for Software Engineer.', 'Java, Spring');

-- 예시 데이터 2
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id2', 'Data Scientist', 90000, 'This is an example job description for Data Scientist.', 'Python, Machine Learning');

-- 예시 데이터 3
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id2', 'Product Manager', 100000, 'This is an example job description for Product Manager.', 'Product Management');

-- 예시 데이터 4
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id3', 'Software Engineer', 85000, 'This is an example job description for Software Engineer.', 'C#, .NET');

-- 예시 데이터 5
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id3', 'Data Scientist', 92000, 'This is an example job description for Data Scientist.', 'R, Data Analysis');

-- 예시 데이터 6
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id3', 'Product Manager', 105000, 'This is an example job description for Product Manager.', 'Product Strategy');

-- 예시 데이터 7
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id4', 'Software Engineer', 82000, 'This is an example job description for Software Engineer.', 'JavaScript, Node.js');

-- 예시 데이터 8
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id4', 'Data Scientist', 91000, 'This is an example job description for Data Scientist.', 'SQL, Data Mining');

-- 예시 데이터 9
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id4', 'Product Manager', 99000, 'This is an example job description for Product Manager.', 'Agile, Scrum');

-- 예시 데이터 10
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id5', 'Software Engineer', 83000, 'This is an example job description for Software Engineer.', 'Python, Django');

-- 예시 데이터 11
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id5', 'Data Scientist', 93000, 'This is an example job description for Data Scientist.', 'Scala, Data Analysis');

-- 예시 데이터 12
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id5', 'Product Manager', 97000, 'This is an example job description for Product Manager.', 'Product Development');

-- 예시 데이터 13
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id6', 'Software Engineer', 81000, 'This is an example job description for Software Engineer.', 'Ruby on Rails, Web Development');

-- 예시 데이터 14
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id6', 'Data Scientist', 94000, 'This is an example job description for Data Scientist.', 'Python, Data Analysis');

-- 예시 데이터 15
INSERT INTO posting (company_id, position, pay, content, technology)
VALUES ('company_id6', 'Product Manager', 102000, 'This is an example job description for Product Manager.', 'Product Lifecycle');

