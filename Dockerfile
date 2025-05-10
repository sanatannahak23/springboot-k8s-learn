FROM openjdk:17

WORKDIR /app

COPY out/artifacts/springboot_k8s_learn_jar/springboot-k8s-learn.jar /app/app.jar

CMD ["java","-jar","app.jar"]

EXPOSE 8080