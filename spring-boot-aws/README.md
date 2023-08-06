## Spring Boot in AWS Lambda
___
<p align="center"><i>In this tutorial, I'll explore how to deploy a Spring Boot application to AWS Lambda using the Serverless Application Model (SAM) framework.</i></p>

[![Stargazers repo roster for @LucasBrum/dev-studies](https://reporoster.com/stars/dark/LucasBrum/dev-studies)](https://github.com/LucasBrum/dev-studies/stargazers)

## Stack
___
**Back-end:** Java 17

## Authors
___
- [@LucasBrum](https://github.com/LucasBrum)

## Start 
___

To start our application and invoke the API, run this code below in target folder::
```bash
  $ java -jar app.jar
  $ curl -X GET http://localhost:8080/api/v1/users -H "Content-Type: application/json"
```
