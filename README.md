# AlugaJogos

AlugaJogos é um site de uma loja fictícia de aluguel de jogos de tabuleiro. O site serve como um local para mostrar o acervo da loja, bem como para que um cliente possa fazer a reserva de um jogo que queira alugar da mesma.

## Ferramentas

Esse projeto foi desenvolvido usando as seguintes ferramentas:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Thymeleaf](https://www.thymeleaf.org/)
- [Bootstrao](https://getbootstrap.com/)
- [H2 Database Engine](https://www.h2database.com/html/main.html)
- [Maven](https://maven.apache.org/)


## Como usar

Primeiramente, é preciso clonar o repositório:

```sh
git clone https://github.com/vbrunoro/alugajogos.git
```

Em seguida, no diretório raiz, usar o seguinte comando para fazer o build e rodar o programa:

Linux/MacOS:
```sh
./mvnw spring-boot:run
```

Windows:
```sh
mvnw spring-boot:run
```

O site iniciará em `localhost:8080`
Para acessar o banco de dados, entre como admin
Usuário: `admin@alugajogos.com`
Senha: `admin`

E acesse `http://localhost:8080/h2-console/`

## Documentação
