FROM williamyeh/java8
COPY 	. /app/
WORKDIR	/app
EXPOSE 	1234:1234
RUN 	chmod +x /app/gradlew
CMD 	["./gradlew", "run"]