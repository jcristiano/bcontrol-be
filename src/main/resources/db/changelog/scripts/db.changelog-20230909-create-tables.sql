--liquibase formatted sql
--changeset jcmsilv:327 comment:Criacao da tabela empresa

CREATE TABLE IF NOT EXISTS dmg.empresa (
    codigo SERIAL PRIMARY KEY,
    nome VARCHAR(250) NOT NULL UNIQUE,
    descricao TEXT
)

