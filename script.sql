-- INSERT INTO tb_pessoa
-- (nome, fone, email, ativo)
-- VALUES
-- ('Cristina', '77774444', 'cristina@email.com', 0);

-- ALTER TABLE tb_pessoa
-- ADD COLUMN ativo INTEGER DEFAULT 1
-- CHECK(ativo IN (0,1));

-- DELETE FROM tb_pessoa;
-- WHERE nome = 'Maria';

--projeção
-- SELECT nome, email FROM tb_pessoa
-- WHERE cod_pessoa = 2 OR cod_pessoa = 3;
--pode ser: WHERE cod_pessoa IN (2,3);
-- UPDATE tb_pessoa SET 
-- nome = 'José da Silva'
-- WHERE cod_pessoa = 1;

-- INSERT INTO tb_pessoa
-- (nome, fone, email) -- nessa linha não possui cod pq é auto increment 
-- VALUES
-- ('João', '77447744', 'joao@email.com'),
-- ('Maria', '77887777', 'maria@email.com');

--SELECT * FROM tb_pessoa; -- * significa que pega todas as colunas da tabela. é usado para leitura (read)

-- CREATE TABLE tb_pessoa(
-- 	cod_pessoa SERIAL PRIMARY KEY, --Serial significa que um codigo é incrementado a cada linha nova.
-- 	nome VARCHAR(255),
-- 	fone varchar(255),
-- 	email VARCHAR(255),
-- );