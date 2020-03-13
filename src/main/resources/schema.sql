CREATE TABLE employee
(
 employeeName varchar(100) NOT NULL,
  employeeId varchar(11) NOT NULL ,
 employeeAddress varchar(100) DEFAULT NULL,
 employeeEmail varchar(100) DEFAULT NULL,
 PRIMARY KEY (employeeId)
);

create table if not exists tuser
(

    /* constraint tuser_pk
         primary key,
*/
    iud                  varchar(6)  not null,
    nom                  varchar(100)    not null,
    prenom              varchar(100)   not null ,
    email               varchar(100)    not null,
    entite               varchar(100)     not null,
    ismanager            boolean not null,
    emailmanager         varchar(100)    not null ,
    isadmin              boolean not null,
    accesauxchaines      varchar(100)   not null  ,
    serveurunix          varchar(100) ,
    loginunix            varchar,
    datedecreation       timestamp  not null,
    auteurcreation       varchar(100)    not null ,
    datedemodification   timestamp   ,
    auteurdemodification varchar(100)    ,
    refmyaccess          integer not null
);



create table if not exists tchaine
(
    nomdelachaine varchar(256) NOT NULL,
    shortname varchar(11) NOT NULL ,
    accessauxchaines varchar(100) DEFAULT NULL,
    codeenvironnement varchar(1) NOT NULL ,
    ibmexportpath varchar(255) NOT NULL ,
    buildpath varchar(255) NOT NULL ,
    rpmpath varchar(255) NOT NULL ,
    langage varchar(10) NOT NULL ,
    outildetest varchar(100) DEFAULT NULL,
    version varchar(10) DEFAULT NULL,
    sed varchar(10) DEFAULT NULL,
    optiondecimal boolean DEFAULT NULL,
    optionpmml boolean DEFAULT NULL,
    callsed varchar(4) ,
    applicationappelante varchar(256) DEFAULT NULL,
    business varchar(256) DEFAULT NULL,
    prod boolean DEFAULT NULL,
    groupe varchar(256) ,
    datedecreation       timestamp  not null,
    auteurcreation       varchar(100)    not null ,
    datedemodification   timestamp   ,
    auteurdemodification varchar(100)    ,

    PRIMARY KEY (nomdelachaine)


);



/*
create table if not exists tuser
(
    id                   integer  ,

       /* constraint tuser_pk
            primary key,
 */
    iud                  varchar(6)  not null,
    nom                  varchar(100)    not null,
    prenom              varchar(100)   not null ,
    email               varchar(100)    not null,
    entite               varchar(100)     not null,
    ismanager            boolean not null,
    emailmanager         varchar(100)    not null ,
    isadmin              boolean not null,
    accesauxchaines      varchar(100)   not null  ,
    serveurunix          varchar(100) ,
    loginunix            boolean,
    datedecreation       timestamp  not null,
    auteurcreation       varchar(100)    not null ,
    datedemodification   timestamp   not null ,
    auteurdemodification varchar(100)   not null  ,
    refmyaccess          varchar(100)  not null
);



alter table tuser
    owner to "db-user";
*/
