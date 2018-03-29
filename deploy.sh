fn=lowercase

riff delete --all

rm -f lowercase-topics.yaml
rm -f lowercase-function.yaml
rm -f Dockerfile

mvn clean package
riff init java -a  ./target/riff-0.0.1-SNAPSHOT.jar --handler "lowercase&main=com.example.riff.RiffApplication"
riff update
