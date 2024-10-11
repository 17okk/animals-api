API Endpoints

Get All Animals
  Request: GET /animals
  URL: http://localhost:8080/animals
Response:
[
  {
    "animalId": 1,
    "name": "Panda",
    "scientificName": "Ailuropoda melanoleuca",
    "species": "Giant panda",
    "habitat": "coniferous forests",
    "description": "The giant panda, a black-and-white bear, has a body typical of bears."
  },
  ...
]

Get Animal by ID
  Request: GET /animals/{animalId}
  URL: http://localhost:8080/animals/1
Response:
  {
    "animalId": 1,
    "name": "Panda",
    "scientificName": "Ailuropoda melanoleuca",
    "species": "Panda",
    "habitat": "coniferous forests",
    "description": "The giant panda, a black-and-white bear, has a body typical of bears."
  }

Add a New Animal
  Request: POST /animals
  URL: http://localhost:8080/animals

Update an Existing Animal
  Request: PUT /animals/{animalId}
  URL: http://localhost:8080/animals/1

Delete an Existing Animal
  Request: DELETE /animals/{animalId}
  URL: http://localhost:8080/animals/1

Get Animals by Species
  Request: GET /animals?species={species}
  URL: http://localhost:8080/animals?species=Panda

Search Animals by Name
  Request: GET /animals/search?name={searchString}
  URL: http://localhost:8080/animals/search?name=Panda
