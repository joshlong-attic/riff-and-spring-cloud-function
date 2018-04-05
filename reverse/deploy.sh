rm -rf *yaml
rm Dockerfile
mvn clean package

riff create java -a target/reverse-0.0.1-SNAPSHOT.jar --force \
    --input reverse \
    --output uppercase \
    --name uppercase \
    --handler "reverse&main=com.example.reverse.ReverseApplication"


