FROM projectriff/java-function-invoker:latest
ARG FUNCTION_JAR=/functions/reverse-0.0.1-SNAPSHOT.jar
ARG FUNCTION_CLASS=reverse&main=com.example.reverse.ReverseApplication
ADD target/reverse-0.0.1-SNAPSHOT.jar $FUNCTION_JAR
ENV FUNCTION_URI file://${FUNCTION_JAR}?handler=${FUNCTION_CLASS}
