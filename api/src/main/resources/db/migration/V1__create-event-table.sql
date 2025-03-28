CREATE EXTENSION IF NOT EXISTS "pgcrypto";
CREATE TABLE event(
 id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
 title varchar(100) NOT NULL,
 description varchar(250) NOT NULL,
 img_url varchar(100) NOT NULL,
 event_url varchar(100) NOT NULL,
 data TIMESTAMP NOT NULL,
 remote BOOLEAN NOT NULL
);
