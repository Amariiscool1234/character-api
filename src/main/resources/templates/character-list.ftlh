<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SpongeBob Character Gallery</title>
</head>
<body>
    <nav>
        <a href="/characters">Character Gallery</a> |
        <a href="/about">About</a>
    </nav>

    <main>
        <h1>SpongeBob Character Gallery</h1>
        <p>Characters from the SpongeBob SquarePants universe.</p>

        <#list characterList as character>
            <article>
                <h2>${character.name}</h2>
                <p><strong>Universe:</strong> ${character.universe!""}</p>
                <p><strong>Species:</strong> ${character.species!""}</p>
                <p>${character.description}</p>
                <a href="/characters/${character.characterId}">View Details</a>
            </article>
            <hr>
        </#list>
    </main>
</body>
</html>