FROM 192.168.1.223:20202/cpe/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/testy2-1.0.0.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
