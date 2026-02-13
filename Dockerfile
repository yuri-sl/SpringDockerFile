#DockerFile para criar uma imagem do jar file
FROM eclipse-temurin:21-jre

#A partir do momento que criei o workdir ele vai jogar o dockerfile lá pra dentro
WORKDIR /app
LABEL authors="Yuri"

#Por isso só precisa colocar (.) no segundo parametro
COPY  ./target/SpringDocker-0.0.1-SNAPSHOT.jar .

ENTRYPOINT exec java -jar SpringDocker-0.0.1-SNAPSHOT.jar
#docker build --tag sprindocker-curso .
#--tag => dar nome para a imagem. [.] => Diz que o arquivo Dockerfile está nessa própria pasta