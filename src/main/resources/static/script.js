function saveBook() {

    let book = {

        bookName: document.getElementById("bookName").value,
        authorName: document.getElementById("authorName").value,
        price: document.getElementById("price").value
    };

    fetch("/libraries", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(book)
    })
    .then(response => response.text())
    .then(data => {
        alert(data);
    });
}

function fetchAllBooks() {

    fetch("/libraries/All")
    .then(response => response.json())
    .then(data => {

        let output = `
        <table>
            <tr>
                <th>Book ID</th>
                <th>Book Name</th>
                <th>Author Name</th>
                <th>Price</th>
            </tr>
        `;

        data.forEach(book => {

            output += `
            <tr>
                <td>${book.bookId}</td>
                <td>${book.bookName}</td>
                <td>${book.authorName}</td>
                <td>₹${book.price}</td>
            </tr>
            `;
        });

        output += "</table>";

        document.getElementById("result").innerHTML = output;
    });
}

function fetchBookById() {

    let id = document.getElementById("bookId").value;

    fetch("/libraries/" + id)
    .then(response => response.json())
    .then(book => {

        document.getElementById("result").innerHTML = `
            <table>
                <tr>
                    <th>Book ID</th>
                    <th>Book Name</th>
                    <th>Author Name</th>
                    <th>Price</th>
                </tr>

                <tr>
                    <td>${book.bookId}</td>
                    <td>${book.bookName}</td>
                    <td>${book.authorName}</td>
                    <td>₹${book.price}</td>
                </tr>
            </table>
        `;
    });
}

function deleteBook() {

    let id = document.getElementById("bookId").value;

    fetch("/libraries/" + id,{
        method:"DELETE"
    })
    .then(response => response.text())
    .then(data => {
        alert(data);
        fetchAllBooks();
    });
}