## iniciar proyecto
´´´
mvn clean install && .\mvnw.cmd spring-boot:run
´´´

## All services

Headers
Accept-Language -> es/en

## GET

URL API
localhost:8080/api/customer/all

response
{
    "code": "RSP_CUSTOMER_LIST_00",
    "message": "Listado de usuarios exitoso",
    "response": [
        {
            "id": "1",
            "name": "Yori",
            "firstSurname": "Cruz",
            "lastSurname": "Cruz",
            "age": "23",
            "gender": "Maculino",
            "mail": "yordy.cruz_96@outlook.es",
            "telephone": "5611820006",
            "updateDate": "hoy"
        }
    ]
}

## post

URL API
localhost:8080/api/customer/add

Request
{
    "name": "Yori",
    "firstSurname": "Cruz",
    "lastSurname": "Cruz",
    "age": "23",
    "gender": "Maculino",
    "mail": "yordy.cruz_96@outlook.es",
    "telephone": "5611820006",
    "updateDate": "hoy"
}

Response
{
    "code": "RSP_CUSTOMER_ADD_00",
    "message": "Usuario agregado con exito",
    "response": {
        "message": "",
        "id": "2",
        "customerRequest": null
    }
}

## PUT

URL API
localhost:8080/api/customer/update/2

Response
{
    "name": "Yonathan David",
    "firstSurname": "Cruz",
    "lastSurname": "Pérez",
    "age": "0",
    "gender": "Maculino",
    "mail": "yordy.cruz_96@outlook.es",
    "telephone": "5611820006",
    "updateDate": "hoy"
}

Request
{
    "code": "RSP_CUSTOMER_UPDATE_00",
    "message": "Usuario actualizado con exito",
    "response": {
        "message": "Se actualizo con exito",
        "id": "2",
        "customerRequest": null
    }
}

## DELETE

URL API
localhost:8080/api/customer/delete/1

Response
{
    "code": "RSP_CUSTOMER_DELETE_00",
    "message": "Usuario eliminado con exito",
    "response": {
        "message": "Se elimino con exito",
        "id": "1",
        "customerRequest": null
    }
}

## GET FIND

URL API
localhost:8080/api/customer/findId/2

Response
{
    "code": "RSP_CUSTOMER_FIND_00",
    "message": "Usuario se encontro con exito",
    "response": {
        "message": "Se encontro usuario",
        "id": "0",
        "customerRequest": {
            "id": "2",
            "name": "Yonathan David",
            "firstSurname": "Cruz",
            "lastSurname": "Pérez",
            "age": "0",
            "gender": "Maculino",
            "mail": "yordy.cruz_96@outlook.es",
            "telephone": "5611820006",
            "updateDate": "hoy"
        }
    }
}