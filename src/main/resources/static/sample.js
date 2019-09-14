fetch('http://localhost:8080/user')
    .then(response => response.json())
    .then(u => {
        console.log(u);
        debugger;
        const tableBody = document.querySelector('tbody');
        for (let i = 0; i < u.length; i++) {
            const user = u[i];
            const tableRow = document.createElement('tr');

            const idCell = document.createElement('td');
            idCell.innerText = user.id;
            tableRow.appendChild(idCell);

            const firstNameCell = document.createElement('td');
            firstNameCell.innerText = user.name;
            tableRow.appendChild(firstNameCell);
            console.log(user.name);

            const lastNameCell = document.createElement('td');
            lastNameCell.innerText = user.surName;
            tableRow.appendChild(lastNameCell);

            tableBody.appendChild(tableRow);
        }
    });