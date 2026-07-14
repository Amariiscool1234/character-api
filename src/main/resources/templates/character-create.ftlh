<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Character | SpongeBob Gallery</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
    <nav>
        <a href="/characters">Character Gallery</a> |
        <a href="/about">About</a>
    </nav>

    <main>
        <h1>Add a SpongeBob Character</h1>
        

        <form action="/characters/create" method="post">
            <p>
                <label for="name">Name</label><br>
                <input id="name" name="name" required>
            </p>

            <p>
                <label for="description">Description</label><br>
                <textarea id="description" name="description" rows="5" required></textarea>
            </p>

            <p>
                <label for="universe">Universe</label><br>
                <input id="universe" name="universe" value="SpongeBob SquarePants">
            </p>

            <p>
                <label for="species">Species</label><br>
                <input id="species" name="species">
            </p>

            <button type="submit">Create Character</button>
        </form>
    </main>
</body>
</html>