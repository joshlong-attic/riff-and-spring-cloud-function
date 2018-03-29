fn=lowercase

riff delete --all

rm -f ${fn}-topics.yaml
rm -f ${fn}-function.yaml
rm -f Dockerfile

mvn clean package
riff init java --name $fn -a  ./target/riff-0.0.1-SNAPSHOT.jar --handler "lowercase&main=com.example.riff.RiffApplication"
riff update
