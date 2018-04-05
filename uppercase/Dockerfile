FROM projectriff/java-function-invoker:latest
ARG FUNCTION_JAR=/functions/uppercase-0.0.1-SNAPSHOT.jar
ARG FUNCTION_CLASS=uppercase&main=com.example.uppercase.UppercaseApplication
ADD target/uppercase-0.0.1-SNAPSHOT.jar $FUNCTION_JAR
ENV FUNCTION_URI file://${FUNCTION_JAR}?handler=${FUNCTION_CLASS}
