CREATE TABLE tasks (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      description VARCHAR(255) NOT NULL,
                      status VARCHAR(20) NOT NULL,
                      creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO tasks (description, status) VALUES ('Заказать еду', 'NOT_STARTED');
INSERT INTO tasks (description, status) VALUES ('Проверить уроки', 'IN_PROGRESS');
INSERT INTO tasks (description, status) VALUES ('Подготовить стирку', 'COMPLETED');
INSERT INTO tasks (description, status) VALUES ('Сделать уборку', 'NOT_STARTED');
INSERT INTO tasks (description, status) VALUES ('Позвонить другу', 'IN_PROGRESS');
