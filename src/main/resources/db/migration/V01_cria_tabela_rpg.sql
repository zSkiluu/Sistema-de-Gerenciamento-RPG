CREATE TABLE public.usuario
{
    codigo bigserial NOT NULL,
    nome text,
    login text,
    senha text,
    itens text,
    PRIMARY KEY(codigo)
};