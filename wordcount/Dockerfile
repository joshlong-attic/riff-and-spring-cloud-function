FROM projectriff/java-function-invoker:latest
ARG FUNCTION_JAR=/functions/wordcount-0.0.1-SNAPSHOT.jar
ARG FUNCTION_CLASS=wordcount&main=com.example.wordcount.WordcountApplication
ADD target/wordcount-0.0.1-SNAPSHOT.jar $FUNCTION_JAR
ENV FUNCTION_URI file://${FUNCTION_JAR}?handler=${FUNCTION_CLASS}
