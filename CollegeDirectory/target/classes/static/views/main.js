document.getElementById('login-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const role = document.getElementById('role').value;

    // Dummy validation for testing purpose
    if (username === 'student' && password === 'password' && role === 'student') {
        window.location.href = 'views/student.html';
    } else if (username === 'faculty' && password === 'password' && role === 'faculty') {
        window.location.href = 'views/faculty.html';
    } else if (username === 'admin' && password === 'password' && role === 'admin') {
        window.location.href = 'views/admin.html';
    } else {
        document.getElementById('error-message').textContent = 'Invalid username, password, or role.';
    }
});

document.getElementById('logout')?.addEventListener('click', function () {
    window.location.href = '../index.html'; // Redirect to login on logout
});


//Connecting with backend using AJAX

document.getElementById('login-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const role = document.getElementById('role').value;

    fetch('/api/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            username: username,
            password: password,
            role: role
        })
    })
    .then(response => response.json())
    .then(data => {
        if (data.success) {
            if (role === 'student') {
                window.location.href = 'views/student.html';
            } else if (role === 'faculty') {
                window.location.href = 'views/faculty.html';
            } else if (role === 'admin') {
                window.location.href = 'views/admin.html';
            }
        } else {
            document.getElementById('error-message').textContent = 'Invalid login.';
        }
    });
});
