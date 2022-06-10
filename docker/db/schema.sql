CREATE TABLE entity (
                     entity_id          TEXT PRIMARY KEY,
                     entity_type        TEXT NOT NULL,
                     blob               JSONB NOT NULL,
                     CREATED_DATE       TIMESTAMP(3) DEFAULT now() NOT NULL
);