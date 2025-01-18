
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

## Docker Setup

### 1. Clone the Project

Clone the repository to your local machine.

```bash
git clone https://github.com/your-username/chat-application.git
cd chat-application
```

### 2. Build the Docker Image

Build the Docker image using the following command. This will create a Docker image tagged `chat-application`.

```bash
docker build -t chat-application .
```

### 3. Run the Docker Container

Run the Docker container using the following command. It maps the container's port `8080` to your local machine's port `8080`.

```bash
docker run -p 8080:8080 --name chat-app-container chat-application
```

### 4. Verify the Application is Running

After running the container, you can verify that the application is running by opening your browser and navigating to:

```
http://localhost:8080
```

You should see the real-time chat application up and running.

### 5. Check Running Containers

To check if the container is running, use the following command:

```bash
docker ps
```

### 6. Stop the Docker Container

If you want to stop the container, use the following command:

```bash
docker stop chat-app-container
```

### 7. Remove the Docker Container

To remove the container after stopping it, use:

```bash
docker rm chat-app-container
```

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
