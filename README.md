# SERVIDOR DE AUTENTICAÇÃO OAUTH2 COM KEYCLOAK

## requisitos para execução do projeto 

- Docker
`Execute o comando: docker run -p 8080:8080 -e KC_BOOTSTRAP_ADMIN_USERNAME=admin -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:26.2.5 start-dev`
- Configure um cliente para no keycloak e insira a url que vai gerar o token valido 

## Java 21
JDK utilizada foi o Java na versão 21.

## Gerenciador de depêndencias

Maven como gerenciador de dependências.

## Spring na versão 3.5.3
