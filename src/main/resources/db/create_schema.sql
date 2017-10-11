CREATE SCHEMA `app`;
CREATE USER 'app_admin'@'localhost' IDENTIFIED BY '@dmin_app';
GRANT ALL ON app.* TO 'app_admin'@'localhost';