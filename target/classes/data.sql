
insert into tchaine (id, nomdelachaine, shortname, accesauxchaines, codeenvironnement, ibmexportpath, buildpath,
                     rpmpath, langage, outildetest, version, sed, optiondecimal, optionpmml, callsed,
                     applicationappelante, business, prod, groupe, datedecreation, auteurcreation, datedemodification,
                     auteurdemodification)
values (1, 'aaaa', 'short', 'gjghjghj', 'a', 'ibmexportpath', 'buildpath', 'rpmpath', 'langage', 'outildetest',
        'version', 'sed', 'True', 'True', 'True', 'applicationappelante', 'business', 'True', 'groupe',
        '2020-03-09T10:29', 'auteurcreation', '2020-03-09T10:29', 'auteurdemodification');



insert into tuser (id, iud, nom, prenom, email, entite, ismanager, emailmanager, isadmin, accesauxchaines, serveurunix,
                   loginunix, datedecreation, auteurcreation, datedemodification, auteurdemodification, refmyaccess)
values (1, 'b48022', 'schwab', 'philippe', 'ps77@ggil.fr', 'pf', true, '', false, 'ee', 'servu', false, '2020-02-24 8:00',
        'psc', '2020-02-20 8:45', 'psc2', '000');

insert into tuser (id, iud, nom, prenom, email, entite, ismanager, emailmanager, isadmin, accesauxchaines, serveurunix,
                   loginunix, datedecreation, auteurcreation, datedemodification, auteurdemodification, refmyaccess)
values (2, 'b48023', 'schwab', 'philippe', 'ps77@ggil.fr', 'pf', true, '', false, 'ee', 'servu', false, '2020-03-09T10:29',
        'psc', '2020-03-09T10:29', 'psc2', '000');



insert into tuser (id, iud, nom, prenom, email, entite, ismanager, emailmanager, isadmin, accesauxchaines, serveurunix,
                   loginunix, datedecreation, auteurcreation, datedemodification, auteurdemodification, refmyaccess)
values (3, 'b48024', 'wayne', 'pierre', 'pw77@ggil.fr', 'pf', true, '', false, 'ee', 'servu', false, '2020-02-24 8:00',
        'psc', '2020-02-20 8:45', 'psc2', '000');

insert into tuser (id, iud, nom, prenom, email, entite, ismanager, emailmanager, isadmin, accesauxchaines, serveurunix,
                   loginunix, datedecreation, auteurcreation, datedemodification, auteurdemodification, refmyaccess)
values (4, 'b48025', 'mitchum', 'suzanne', 'sm77@ggil.fr', 'pff', true, '', false, 'ee', 'servu', true, '2021-03-09T10:29',
        'psc', '2020-03-09T10:29', 'psc2', '000');


insert into taccesauxchaines (id, created_at, updated_at, accesauxchaines)
values (1000, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'Group1');

insert into taccesauxchaines (id, created_at, updated_at, accesauxchaines)
values (2000, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'Group2');


insert into tentity (id, created_at, updated_at, entite)
values (1000, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'PF');

insert into tentity (id, created_at, updated_at, entite)
values (2000, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'BPLS');



insert into toutildetest (id, created_at, updated_at, outildetest)
values (1000, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'Cosby');

insert into toutildetest (id, created_at, updated_at, outildetest)
values (2000, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'Osiris');

insert into toutildetest (id, created_at, updated_at, outildetest)
values (3000, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'Sedbatch');

insert into toutildetest (id, created_at, updated_at, outildetest)
values (4000, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'executable');



insert into tunixserver (id, created_at, updated_at, serveurunix)
values (1, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'Serveur1');

insert into tunixserver (id, created_at, updated_at, serveurunix)
values (2, '2030-03-19 10:20:46.017000', '2030-03-19 10:20:46.017000', 'Serveur2');



