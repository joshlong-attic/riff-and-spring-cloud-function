rm -rf *yaml
rm Dockerfile
riff delete --all
riff create java -a ./target/wordcount-0.0.1-SNAPSHOT.jar --force --input wc --name wc --handler "wordcount&main=com.example.wordcount.WordcountApplication"