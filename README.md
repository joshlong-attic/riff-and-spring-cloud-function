# Riff and Spring Cloud Function 

# Project Riff Notes

If you run your application in Kubernetes, you can use DNS lookup to find the HTTP gateway of the form: `<release>-kafka.<namespace>:9092`, for riff 0.0.5 that would be `transport-kafka.riff-system:9092`.

Here's a shell program that will create a java function for me:

```

fn=$1
jar=$2
class=$3

riff create java -a $jar --force --name $fn --input $fn --handler "$fn&main=$class"

```

and here's a program to make a request assuming that same function has been deployed:

```
riff publish --content-type application/json -i $fn -d'{"value":"hi riff"}'  -r

```

The good Dr. Syer has put together an example demonstrating how to create a relay [here, as well](https://github.com/dsyer/riff-http).    
