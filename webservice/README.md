# temp-service

## Multistage Build
```
docker build -t temp-service .
```

## Run 
```
docker run --rm -it -p 8080:8080 --network=its-net -v C:\dev\git-repos\temp-service\workdir:/workdir:ro --name temp-service temp-service
```

### Run in mock mode
```
docker run --rm -it -p 8080:8080 --network=its-net -e "spring.profiles.active=mock" --name temp-service temp-service
```

### Run and change filepath
```
docker run --rm -it -p 8080:8080 --network=its-net -v C:\dev\git-repos\temp-service\workdir:/workdir:ro -e "environemt.json.file=/workdir/foo.json" --name temp-service temp-service
```

## API

### SWAGGER-UI
```
http://localhost:8080/swagger-ui.html
```

## swagger.json
```
http://localhost:8080/v2/api-docs
```