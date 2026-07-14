<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit ${character.name} | SpongeBob Gallery</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
    <nav>
        <a href="/characters">Character Gallery</a> |
        <a href="/about">About</a>
    </nav>

    <main>
        <h1>Edit ${character.name}</h1>

        <form action="/characters/${character.characterId}/edit" method="post">
            <p>
                <label for="name">Name</label><br>
                <input id="name" name="name" value="${character.name}" required>
            </p>

            <p>
                <label for="description">Description</label><br>
                <textarea id="description" name="description" rows="5" required>${character.description}</textarea>
            </p>

            <p>
                <label for="universe">Universe</label><br>
                <input id="universe" name="universe" value="${character.universe!""}">
            </p>

            <p>
                <label for="species">Species</label><br>
                <input id="species" name="species" value="${character.species!""}">
            </p>

            <button type="submit">Save Changes</button>
        </form>
    </main>
</body>
</html>