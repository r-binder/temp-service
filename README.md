# temp-service

## Multistage Build
```
docker build -t temp-service .
```

## Run 
```
docker run --rm -i -p 80:8080 -v C:\dev\git-repos\temp-service\workdir:/workdir:ro --name temp-service temp-service
```

### Run in mock mode
```
docker run --rm -i -p 80:8080 -e "spring.profiles.active=mock" --name temp-service temp-service
```

### Run and change filepath
```
docker run --rm -i -p 80:8080 -v C:\dev\git-repos\temp-service\workdir:/workdir:ro -e "environemt.json.file=/workdir/foo.json" --name temp-service temp-service
```

## API

### SWAGGER-UI
```
http://localhost/swagger-ui.html
```

## swagger.json
```
http://localhost/v2/api-docs
```