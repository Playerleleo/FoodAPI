insert into cozinha (id, nome) values (1, 'Brasileira');
insert into cozinha (id, nome) values (2, 'Japonesa');

insert into restaurante (id, nome, taxa_frete, cozinha_id) values (1, 'Restaurante A', 10.00, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Restaurante B', 5.00, 2);

insert into estado (id, nome) values (1, 'Sao paulo');
insert into cidade (id, nome, estado_id) values (1, 'Maua', 1);

insert into forma_pagamento (id, descricao) values (1, 'debito');