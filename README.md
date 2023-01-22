# load-testing-comparison
Basic Kotlin with blocking VS Kotlin with coroutines VS Kotlin with WebFlux

## Description

We have:
 * slow third-party api (response time 2s)
 * User model

![image](https://user-images.githubusercontent.com/46258479/213917787-f2f308ab-ac77-4657-8e81-37ff6b3cad9c.png)

We need:
 * 1000 rps
 * 5 sec for response
