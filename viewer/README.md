# temp-service-viewer

## Run 
```
 docker run -d -p 80:80 --network=its-net --name temp-service-viewer -v "$PWD":/var/www/html php:7.2-apache
```