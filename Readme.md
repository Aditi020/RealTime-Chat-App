# Real-Time Chat Application
![Project Image](/Chat-App.png)


A Real-Time Chat Application built with Spring Boot and WebSockets, allowing users to communicate instantly with others through a simple chat interface. The frontend uses HTML, CSS, and JavaScript to connect to a Spring Boot backend via SockJS and STOMP for seamless real-time messaging.

## Features
- Real-time messaging using WebSockets (SockJS + STOMP).
- User login functionality to join the chat room.
- Support for multiple users to join and leave the chat.
- Messages are displayed dynamically without page reload.

## Technologies Used
- **Backend**: Spring Boot, Spring WebSocket
- **Frontend**: HTML, CSS, JavaScript (SockJS, STOMP)
- **WebSocket**: SockJS, STOMP for real-time communication

## Prerequisites
Before running the project, make sure you have the following installed:
- Java 17 or higher
- Maven for dependency management
- A modern web browser for frontend interaction

## Backend Setup
1. Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2. Navigate to the project folder:
    ```bash
    cd <project-folder>
    ```
3. Build the application:
    ```bash
    mvn clean install
    ```
4. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

The backend will run on `http://localhost:8080`.

## Frontend Setup
1. Open the `index.html` file in a web browser.
2. Once the page loads, type your username and click "Start Chatting" to enter the chatroom.
3. Send and receive messages in real-time.

## Usage
1. Enter a username to join the chatroom.
2. Send messages that will be broadcasted to all connected clients.
3. Messages are displayed with the sender's avatar based on the first letter of their username.

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
