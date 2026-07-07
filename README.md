# Character API

Spring Boot CRUD API for managing characters.




## Deployment

Live API:
https://character-api-k6ce.onrender.com/

Render URL:
https://character-api-k6ce.onrender.com/characters

## API Endpoints

### Get All the Characters
GET /characters

### Get the Character By ID
GET /characters/{id}

### Create the Character
POST /characters

### Update the Character
PUT /characters/{id}

### Delete the Character
DELETE /characters/{id}

### Search the Characters By Name
GET /characters/search?name={name}

### Filter the Characters By Category
GET /characters/universe/{universe}