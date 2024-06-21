CREATE TABLE tb_cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    email VARCHAR(255) NOT NULL
);

-- Criação da tabela Produto
CREATE TABLE tb_produto (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    preco NUMERIC(10, 2) NOT NULL CHECK (preco >= 0),
    quantidade_em_estoque INT NOT NULL CHECK (quantidade_em_estoque >= 0),
    categoria VARCHAR(50) NOT NULL
);

-- Criação da tabela Venda
CREATE TABLE tb_venda (
    id SERIAL PRIMARY KEY,
    cliente_id BIGINT NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES tb_cliente(id)
);

-- Criação da tabela ItensVenda
CREATE TABLE tb_itens_venda (
    id SERIAL PRIMARY KEY,
    produto_id BIGINT NOT NULL,
    quantidade INT NOT NULL CHECK (quantidade > 0),
    valor_unidade NUMERIC(10, 2) NOT NULL CHECK (valor_unidade >= 0),
    venda_id BIGINT NOT NULL,
    FOREIGN KEY (produto_id) REFERENCES tb_produto(id),
    FOREIGN KEY (venda_id) REFERENCES tb_venda(id)
);