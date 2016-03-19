FROM 	williamyeh/java8
COPY 	. /app/
WORKDIR	/app
EXPOSE 	4567
RUN 	chmod +x /app/gradlew
CMD 	["./gradlew", "run"]