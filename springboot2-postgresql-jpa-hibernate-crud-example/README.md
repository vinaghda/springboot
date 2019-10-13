# Project Title

Aplikasi backend menggunakan spring boot di Openshift 3.11

## Desription

Aplikasi backend ini menggunakan database enterprisedb (postgresql) 

## Prerequisite

Image Openjdk8

docker login -u user_docker -p password_docker registry.redhat.io
docker pull registry.redhat.io/redhat-openjdk-18/openjdk18-openshift

Environment variable:
DB_CONNSTRING = jdbc:postgresql://172.29.149.198:5444/karyawan
DB_USER=enteprisedb
DB_PASSWORRD = <menggunakan OCP secret>

## Build sourcecode to image

oc new-app registry.redhat.io/redhat-openjdk-18/openjdk18-openshift~https://github.com/vinaghda/springboot.git --context-dir=springboot2-postgresql-jpa-hibernate-crud-example --name=employees -e DB_CONNSTRING=jdbc:postgresql://172.29.149.198:5444/karyawan DB_USER=enteprisedb
