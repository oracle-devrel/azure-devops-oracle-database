CREATE USER aiuser identified BY [Yourpassword];
GRANT CREATE session TO aiuser;
GRANT RESOURCE TO aiuser;
GRANT unlimited tablespace TO aiuser;
GRANT execute on DBMS_CLOUD to aiuser;