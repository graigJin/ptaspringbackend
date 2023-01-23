CREATE TABLE ROLE(
         ROLE_ VARCHAR(5) PRIMARY KEY,
                 constraint role_id check ( ROLE_ IN ('ADMIN', 'MOD', 'USER'))
);

CREATE TABLE SERVICE_TYPE(
                     TYPE_ VARCHAR(20) PRIMARY KEY,
                     constraint type_id check ( TYPE_ IN ('RECOMMENDATION', 'PREVISION'))
);

CREATE TABLE PART_TYPE(
                             TYPE_ VARCHAR(20) PRIMARY KEY,
                             constraint part_id check ( TYPE_ IN ('PART1', 'PART2', 'PART3'))
);

CREATE TABLE CONTACT_DATA(
                             CONTACT_NR bigint PRIMARY KEY,
                             EMAIL VARCHAR(64),
                             PHONE VARCHAR(64)
);

CREATE TABLE ADDRESS(
                        ADDRESS_ID BIGINT PRIMARY KEY,
                        STREET VARCHAR(20),
                        STREET_NR INT,
                        ZP_CODE INT,
                        CITY VARCHAR(20),
                        COUNTRY VARCHAR(20)
);

CREATE TABLE PERSON(
                         PERSON_ID bigint  PRIMARY KEY,
                         FIRST_NAME VARCHAR(64),
                         LAST_NAME VARCHAR(64),
                         ADDRESS_ID BIGINT,
                         CONTACT_NR bigint,
                         FOREIGN KEY (CONTACT_NR) references CONTACT_DATA(CONTACT_NR),
                         FOREIGN KEY (CONTACT_NR) references CONTACT_DATA(CONTACT_NR),
                         FOREIGN KEY (ADDRESS_ID) REFERENCES ADDRESS(ADDRESS_ID)
);

CREATE TABLE USERS(
                     USER_ID bigint  PRIMARY KEY,
                     PERSON_ID BIGINT,
                     ROLE_ID VARCHAR(64),
                     constraint user_role  check ( ROLE_ID in (SELECT ROLE_ from ROLE)),
                     WORKSHOP_ID bigint

);


CREATE TABLE WORKSHOP(
                         WORKSHOP_ID bigint PRIMARY KEY,
                         USER_ID bigint,
                         USER_R VARCHAR(5),
                         USER_AD VARCHAR(64),
                         USER_AD_R VARCHAR(5),
                         USER_MOD VARCHAR(64),
                         USER_MOD_R VARCHAR(5),
                         ADDRESS_ID BIGINT,
                         constraint user_r_role  check ( USER_R in (SELECT ROLE_ from ROLE)),
                         FOREIGN KEY (ADDRESS_ID) REFERENCES ADDRESS(ADDRESS_ID)

);

CREATE TABLE VEHICLE(
                         VEHICLE_ID BIGINT PRIMARY KEY,
                         LICENCE_NR VARCHAR(20),
                         MODEL VARCHAR(20),
                         PERSON_ID BIGINT,
                         FOREIGN KEY (PERSON_ID) references PERSON(PERSON_ID)
);

CREATE TABLE SERVICE(
                         SERVICE_ID BIGINT PRIMARY KEY,
                         CREATION_DATE DATE,
                         MEASUREMENTS VARCHAR(64),
                         TYPE_ VARCHAR(20),
                         constraint type_value check ( TYPE_ in (TYPE_)),
                         PARTS_ VARCHAR(20),
                         RECOMMENDATION_DATE DATE
);

CREATE TABLE REPORT(
                         REPORT_ID BIGINT PRIMARY KEY,
                         SERVICE_ID BIGINT,
                         FOREIGN KEY (SERVICE_ID) references SERVICE(SERVICE_ID)
);