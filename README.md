# entity-relations-spring-data-jpa
This project demonstrates **how to map relations between entities** using spring-data-jpa

# sources:
 - For H2 database and spring data jpa : https://www.baeldung.com/spring-boot-h2-database

## Sample curl

```
curl -X POST \
  http://localhost:8080/wifi \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 280' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 96659d4a-7fc7-41d9-a115-a8daecbd9eef,af1590d2-d1cd-4044-a946-d029d03afd43' \
  -H 'User-Agent: PostmanRuntime/7.18.0' \
  -H 'cache-control: no-cache' \
  -d '[
    {
        "name": "srimana",
        "category": "public",
        "description": "public network",
        "deviceList": [
            {
                "name": "iphone",
                "type": "phone",
                "status": "connected"
            }
        ]
    }
]'
```
