FROM mysql/mysql-server

MAINTAINER bingwenwuhen bingwenwuhen@163.com

# Copy the database initialize script:
# Contents of /docker-entrypoint-initdb.d are run on mysqld startup
ADD  mysql/ /docker-entrypoint-initdb.d/