package KanbanProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//initial commit
@SpringBootApplication
public class KanbanProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KanbanProjectApplication.class, args);
	}

}
 /* to do list
 * Define the database: Next, you need to define the database for your REST API. You can use an SQL
 *  database like MySQL or PostgreSQL or a NoSQL database like MongoDB or Cassandra.

Define the entity classes: Entity classes define the structure of the objects that will be stored
* in the database. For a Kanban board, you'll need to create entity classes for boards, columns, and tasks.

Define the repository classes: Repository classes provide access to the database and handle database
*  operations like creating, reading, updating, and deleting objects.

Define the controller classes: Controller classes handle incoming HTTP requests and return the appropriate response.
*  You'll need to create a controller class for each endpoint in your REST API.

Define the service classes: Service classes provide the business logic for your application. You'll need to create
* service classes to handle tasks like creating new boards, columns, and tasks, and moving tasks from one column to another.

Test your API: Finally, you should test your API to make sure it works as expected. You can use tools like Postman
* or curl to send HTTP requests to your API and verify that you're getting the expected responses.

These are the high-level steps you need to follow to create a REST API for your Kanban SPA. However, the exact
*  implementation will depend on your specific requirements, and you may need to modify these steps as you build your application.
 * */