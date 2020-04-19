# Myfront

This project was generated with [Angular Cli] version 8.3.21.
Angular CLI: 8.3.25
Node: 12.16.2
OS: linux x64
Angular: 8.2.14
... animations, common, compiler, compiler-cli, core, forms
... language-service, platform-browser, platform-browser-dynamic
... router

IntelliJ Idea Ultimate 2019.3
DataGrip 2019.3.4 (Access to DataBase)

# postgress-boot
Postgress With Spring boot 
DataBase Postgre (Auto-install by pom.xml, application.properties et data.sql)

Package                           Version
-----------------------------------------------------------
@angular-devkit/architect         0.803.25
@angular-devkit/build-angular     0.803.25
@angular-devkit/build-optimizer   0.803.25
@angular-devkit/build-webpack     0.803.25
@angular-devkit/core              8.3.25
@angular-devkit/schematics        8.3.25
@angular/cli                      8.3.25
@ngtools/webpack                  8.3.25
@schematics/angular               8.3.25
@schematics/update                0.803.25
rxjs                              6.4.0
typescript                        3.5.3
webpack                           4.39.2

npm (gestionnaire de paquets officiel de Node.js) 6.14.4

## Install
sudo apt install default-jdk   
sudo apt install default-jre  


Node Js
	sudo npm install -g @angular-devkit/build-angular --force 
	sudo npm install -g @angular/compiler-cli --force 
	ng --version

	wget -qO- https://deb.nodesource.com/setup_12.x | sudo -E bash -
	sudo apt install -y nodejs
	test versioning
	node -v
	ndm -v




## launch

Run postgressapplication
Main class : com.sample.postgress.PostgressApplication
Tomcat started on port(s): 8080 (http) with context path ''



## Structure for CRUD
   	 
	
TABLES PRINCIPALES 
	TUserController
		 @RequestMapping("/api/user")
	TChaineController
		 @RequestMapping("/api/chaine")

TABLES DE PARAMETTRAGE	
	TAccesAuxChainesController
		 @RequestMapping("/api/bdd")
	TEntityController
		 @RequestMapping("/api/entity")
	TOutilDeTestController
		@RequestMapping("/api/outildetest")
	TServeurUnixController
		@RequestMapping("/api/serveurunix")

Model(s) contains structure of Class and Database

Service contains CRUD for conctat repository

Repository extends JPA to access database

## Use
	The Back listen http://localhost:8080/api/ and execute CRUD



