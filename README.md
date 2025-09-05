📦 Sistema de Cadastro de Clientes e Pedidos

📌 Descrição do Desafio
Este projeto foi desenvolvido como parte de um desafio de Java Orientado a Objetos.

O objetivo era criar uma aplicação que:
Permitisse o cadastro de clientes, contendo nome, e-mail e data de nascimento.
Realizasse o cadastro de pedidos, vinculados a cada cliente.
Incluísse itens de pedido, com informações de produto, preço e quantidade.
Exibisse ao final um resumo completo do pedido com os dados do cliente, status e os itens inseridos.

Para a implementação foram fornecidos dois diagramas em UML:
Diagrama de Entidades (representando as classes Client, Order, OrderItem, Product e o enum OrderStatus).
<img width="1919" height="876" alt="image" src="https://github.com/user-attachments/assets/1c4298c1-0b9b-49b2-a5cd-8693b04aa89f" />

Diagrama de Objetos (ilustrando as composições e interações entre as instâncias em tempo de execução).
<img width="1919" height="730" alt="image" src="https://github.com/user-attachments/assets/1393e17c-0f37-47ee-9c80-edc76a4f32eb" />

Além disso, foi fornecido um exemplo de interação entre usuário e programa, que guiou a construção do fluxo da aplicação.
<img width="1182" height="1006" alt="image" src="https://github.com/user-attachments/assets/97a37106-4a24-4f0f-8de2-932b95bd4d0d" />


🚀 O que foi entregue

A entrega consiste em uma aplicação console (Program.java) que:
Lê os dados do cliente.
Lê os dados do pedido, incluindo status.
Pergunta a quantidade de itens e, para cada um deles, solicita:
Nome do produto
Preço do produto
Quantidade
Cria os objetos correspondentes (Product, OrderItem, Order, Client).
Associa os itens ao pedido e o pedido ao cliente.
Exibe no final um resumo formatado do pedido.

📂 Estrutura do Projeto
src/
 ├── application/
 │    └── Program.java
 ├── entities/
 │    ├── Client.java
 │    ├── Order.java
 │    ├── OrderItem.java
 │    └── Product.java
 └── entities/enums/
      └── OrderStatus.java

🛠️ Tecnologias e Conceitos Utilizados
Java SE (linguagem principal)
Paradigma de Orientação a Objetos:
Encapsulamento
Composição de objetos (Order possui vários OrderItem, cada OrderItem contém um Product)
Enumerações (OrderStatus)
Construtores e sobrecarga de métodos (toString customizado nas entidades)

Coleções:
List para armazenar os itens do pedido

Manipulação de datas:
Date
SimpleDateFormat

Entrada de dados via console:
Scanner

Internacionalização:
Locale.setDefault(Locale.US) para garantir formatação de números decimais no padrão americano

📖 Exemplo de Interação
Enter client data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985

Enter order data:
Status: PROCESSING
How many items to this order? 2

Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1

Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2


➡️ Ao final, o programa imprime um resumo do pedido, contendo:
Data do pedido
Status
Dados do cliente
Itens do pedido (nome, preço, quantidade, subtotal)
Valor total do pedido

📌 Como Executar
Clone este repositório:
git clone https://github.com/enrique-fcnr/desafio1-java-pratica
Compile os arquivos:
javac application/Program.java
Execute o programa:
java application.Program

📜 Licença

Este projeto foi desenvolvido para fins acadêmicos e de aprendizado.
