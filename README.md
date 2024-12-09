[![Continuous Integration with Github](https://github.com/rafaelmaiia/microservices-course/actions/workflows/docker-publish.yml/badge.svg)](https://github.com/rafaelmaiia/microservices-course/actions/workflows/docker-publish.yml)


# Projeto de Microserviços com Spring Boot, Docker e RabbitMQ  

Este projeto demonstra uma arquitetura de microserviços utilizando Spring Boot, Docker e ferramentas como Eureka para descoberta de serviços, Zipkin para rastreamento, Swagger para documentação de APIs e RabbitMQ para mensageria.

## Pré-requisitos  

- Docker e Docker Compose instalados no sistema.

## Como Executar  

1. Clone o repositório e navegue até a pasta raiz, onde está localizado o arquivo `docker-compose.yml`.  
2. Abra o terminal (ou PowerShell) na pasta raiz do projeto.  
3. Execute o seguinte comando para iniciar os serviços:  
   ```bash
   docker compose up
   ```  
4. Aguarde até que todos os containers estejam em execução. Os serviços estarão disponíveis nos seguintes endpoints.  

## Acessando os Endpoints  

### Endpoints via Gateway  
- **Book Service:** [http://localhost:8765/book-service/14/BRL](http://localhost:8765/book-service/14/BRL)  
- **Cambio Service:** [http://localhost:8765/cambio-service/8/USD/CLP](http://localhost:8765/cambio-service/8/USD/CLP)  

### Documentação da API (sem Gateway)  
- **Book Service (JSON):** [http://localhost:8100/v3/api-docs](http://localhost:8100/v3/api-docs)  
- **Cambio Service (JSON):** [http://localhost:8000/v3/api-docs](http://localhost:8000/v3/api-docs)  

### Documentação da API (Interface Gráfica - Swagger)  
- **Book Service (Swagger):** [http://localhost:8100/swagger-ui.html](http://localhost:8100/swagger-ui.html)  
- **Cambio Service (Swagger):** [http://localhost:8000/swagger-ui.html](http://localhost:8000/swagger-ui.html)  

### Documentação via Gateway  
- **Swagger do Gateway:** [http://localhost:8765/swagger-ui.html](http://localhost:8765/swagger-ui.html)  

### Ferramentas Adicionais  
- **Eureka (Descoberta de Serviços):** [http://localhost:8761](http://localhost:8761)  
- **Zipkin (Rastreamento de Chamadas):** [http://localhost:9411/zipkin](http://localhost:9411/zipkin)  
- **RabbitMQ (Mensageria):** [http://localhost:15672](http://localhost:15672)  
  - **Usuário Padrão:** *guest*  
  - **Senha Padrão:** *guest*  

## Como Parar os Serviços  

Para encerrar todos os containers em execução, execute:  
```bash
docker compose down
```  

