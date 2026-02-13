#DockerFile para criar uma imagem do jar file
FROM maven:3.9.9-eclipse-temurin-21 AS build

LABEL authors="Yuri"
#build é um alias(apelido)

WORKDIR /build
#Copia tudo da pasta base para a build
COPY . .

#Executar linha de comnado dentro do Dockerfile
RUN mvn clean package -DskipTests


#A partir do momento que criei o workdir ele vai jogar o dockerfile lá pra dentro
FROM eclipse-temurin:21-jre
WORKDIR /app

#Por isso só precisa colocar (.) no segundo parametro
#./SpringDocker.jar é o novo nome do arquivo após ele ser construído
COPY --from=build ./build/target/*.jar ./SpringDocker.jar

#ENTRYPOINT pode existir só uma vez dentro do DockerFile e é bem na parte em q fecha o
#docker file para criar a imagem
ENTRYPOINT exec java -jar SpringDocker.jar
#docker build --tag sprindocker-curso .
#--tag => dar nome para a imagem. [.] => Diz que o arquivo Dockerfile está nessa própria pasta