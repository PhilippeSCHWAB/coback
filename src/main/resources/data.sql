/*
insert into employee (employeeId, employeeName , employeeAddress,employeeEmail) values('2','Jack','USA','jack@gmail.com');

*/
/*
insert into tchaine (Nomdelachaine, Shortname, Outildetest, Accessauxchaines, datedemodification, auteurdemodification)
values('eee','short','sdsdstest','ouddsdsd','2020-03-09T10:29',  'SC');

insert into tchaine (Nomdelachaine, Shortname, Outildetest, Accessauxchaines, datedemodification, auteurdemodification)
values('aaa','short','gjghjghj','ouddsdgjghjsd','2020-03-09T10:29',  'SC');
*/


insert into tchaine (nomdelachaine, shortname, accessauxchaines, codeenvironnement, ibmexportpath, buildpath ,rpmpath, langage, outildetest, version, sed, optiondecimal, optionpmml, callsed, applicationappelante, business, prod, groupe, datedecreation, auteurcreation, datedemodification, auteurdemodification)
values('aaaa','short','gjghjghj','a','ibmexportpath', 'buildpath', 'rpmpath' ,'langage','outildetest','version','sed','True','True','True','applicationappelante', 'business','True','groupe','2020-03-09T10:29','auteurcreation','2020-03-09T10:29','auteurdemodification');



/*
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
callsed boolean DEFAULT NULL,
applicationappelante varchar(256) DEFAULT NULL,
business varchar(256) DEFAULT NULL,
prod boolean DEFAULT NULL,
groupe varchar(256) ,
datedecreation       timestamp  not null,
auteurcreation       varchar(100)    not null ,
datedemodification   timestamp   ,
auteurdemodification varchar(100)    ,

*/



insert into tuser (iud, nom, prenom, email, entite, ismanager, emailmanager, isadmin, accesauxchaines, serveurunix, loginunix, datedecreation, auteurcreation, datedemodification, auteurdemodification, refmyaccess)
values('b48022','schwab','philippe','ps77@ggil.fr', 'pf',true,'',false,'ee','',false,'2020-02-24 8:00','psc', '2020-02-20 8:45', 'psc2', '000');

insert into tuser (iud, nom, prenom, email, entite, ismanager, emailmanager, isadmin, accesauxchaines, serveurunix, loginunix, datedecreation, auteurcreation, datedemodification, auteurdemodification, refmyaccess)
values('b48023','schwab','philippe','ps77@ggil.fr', 'pf',true,'',false,'ee','',false,'2020-03-09T10:29','psc', '2020-03-09T10:29', 'psc2', '000');

/*
insert into tuser (nom )
values('schwab');
*/
