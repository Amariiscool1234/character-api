<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${character.name} | SpongeBob Gallery</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
    <nav>
        <a href="/characters">Character Gallery</a> |
        <a href="/about">About</a>
    </nav>

    <main>
        <h1>${character.name}</h1>

        <p><strong>Description:</strong> ${character.description}</p>
        <p><strong>Universe:</strong> ${character.universe!""}</p>
        <p><strong>Species:</strong> ${character.species!""}</p>
          <p>
             <a href="/characters/${character.characterId}/edit">Edit The Character</a>
             <a href="/characters/${character.characterId}/delete">Delete The Character</a>
            </p>
        <p>
            <a href="/characters">Back to Gallery</a>
        </p>
    </main>
</body>
</html>