FROM postgres:10.3

ADD docker/db/schema.sql /docker-entrypoint-initdb.d/00-schema.sql

ENV POSTGRES_DB=test
ENV POSTGRES_USER=test_user
ENV POSTGRES_PASSWORD=test_password