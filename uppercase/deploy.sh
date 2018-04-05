rm -rf *yaml
rm Dockerfile
mvn clean package

riff create java -a target/uppercase-0.0.1-SNAPSHOT.jar --force \
  --input uppercase \
  --name uppercase \
  --handler "uppercase&main=com.example.uppercase.UppercaseApplication"
