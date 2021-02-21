/*==============================================================*/
/* DROP Table                                                   */
/*==============================================================*/
drop  table IF EXISTS EMPLOYE; 
drop  SEQUENCE IF EXISTS employe_id_seq;
/*==============================================================*/
/* Table: EMPLOYE                                         */
/*==============================================================*/

create table EMPLOYE (
   ID_EMPLOYE             INTEGER             auto_increment 			NOT NULL,
   ADRESSE                CHARACTER varying(255)         NULL,	
   ANNEE_EXPERIENCE       INTEGER                  		NULL,
   DATE_NAISSANCE         DATE                     		NULL,
   FONCTION               CHARACTER varying(255)         NULL,	
   PRENOM                 CHARACTER varying(255)         NULL,
   SALAIRE                INTEGER                       NULL,
   constraint PK_EMPLOYE primary key (ID_EMPLOYE)
);

/*==============================================================*/
/* Table: SEQUENCE                                         */
/*==============================================================*/

CREATE SEQUENCE EMPLOYE_ID_SEQ
    INCREMENT BY 1
	
    NO MINVALUE
	
    NO MAXVALUE
	
    CACHE 1;
	
/*========================================================================================*/
/* Insertion des données dans la table EMPLOYE   									  */
/*========================================================================================*/

INSERT INTO employe(id_employe, adresse, annee_experience, date_naissance, fonction, prenom, salaire) VALUES (1,'PARIS',6,'1987-01-07','Consultant java jee','marwen',2500);
INSERT INTO employe(id_employe, adresse, annee_experience, date_naissance, fonction, prenom, salaire) VALUES (2,'NANTES',4,'1989-01-07','TESTEUR','asma',2200);
