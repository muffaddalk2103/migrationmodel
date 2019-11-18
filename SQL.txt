CREATE KEYSPACE migrationmodel WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3};
USE migrationmodel;
CREATE TYPE credential_type ( 
    username text, 
    password text, 
    domain text
);

CREATE TYPE volume_type ( 
    mountpoint text, 
    volumesize bigint
);

CREATE TABLE source(
   ipaddress inet PRIMARY KEY,
   credentials FROZEN<credential_type>,
   volumes set<FROZEN<volume_type>>
);