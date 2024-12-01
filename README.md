<h2>Module Production of Neighborfood Application - Clean Architecture</h2>


# Allure Report dashboard
* <img src="https://i.imgur.com/OVAAcQc.png">

# Cucumber
* <img src="https://i.imgur.com/MBa9fzo.png">
* <img src="https://i.imgur.com/1l2yM9v.png">

# jUnit & Mockito
* <img src="https://i.imgur.com/sjkLfYR.png">
* <img src="https://i.imgur.com/Q9mRXPU.png">

# Profiles test unit, integration and test system
```
mvn -P integration-test
```

<h3>Project aims to refactor the architecture used in the project <a href="https://github.com/MiguelProgrammer/neighborfood">Neighborfood - Ports and Adapters</h3><hr>

<h3>Neighborfood-app</h3>  


* To upload the application, use the <b>docker-compose up</b> or <b>docker-compose up --build</b> command, use a client for the request, the results are also presented via the console to fill in the response.<hr>

<img src="https://miro.medium.com/v2/resize:fit:400/0*iU9Ks05_GTtGh6zV.jpg"><hr>

Through the monolith, I will create an application similar to Ifood.

This application is being developed to prove theories, software development with DDD, every flow developed here is intended only to put into technical practices of domais driven design, I will use docker to upload the application to the PostgreSql database.

I will refactor the previous architecture to a clean architecture.

Clean architecture also says a lot about not dirtying or violating the layers. This architecture is based on using the outermost layer to the innermost ones. To do this, the use of appropriate layers must be followed in order to not harm the proposal brought by the adopted model.

* Doc DDD miro: <a href="https://miro.com/app/board/uXjVKUqbA08=/?share_link_id=950297951149">miro</a>
* Json doc to postman requests: <a href="https://drive.google.com/file/d/1wmFFVwIq0Uxm53vhaXbE4U04BwZxrmTy/view?usp=sharing">request postman</a>
* Api-docs Swagger OpenPI <a href="http://localhost:8090/swagger-ui/index.html">swagger-ui</a> -> Access documentation only by running the application or by inserting the contents of the src/main/resources/api/resource.yml file on the swagger web editor website
* Video YouTube <a href="https://www.youtube.com/watch?v=GqULSTVhM8Y">Application Neighborfood demonstration video</a>

<hr>

<table align="center" border="0">
    <p>Doc uml diagrams</p>
<tr>
    <td colspan="4">
        <img src="https://i.imgur.com/XSaryWW.png" width=800>
    </td>
    <td colspan="4">
        <img src="https://i.imgur.com/HleA8P2.png" width=800>
    </td>
    <td colspan="4">
        <img src="https://i.imgur.com/XSaryWW.png" width=800>
    </td>
    <td colspan="4">
        <img src="https://i.imgur.com/ehEqd1n.png" width=800>
    </td>
</tr>
</table>

<hr>

* To execute the project and orchestrate containers, install minikube, the platform used in development and testing.
* Run the minikube start command to access the minikube dashboard, where you can view the containers in a more simplified way.
* With docker-desktop installed, enable the kubernetes engine in docker settings.
* Using the command line via cmd, navigate to the k8s project directory and run the commands kubectl apply -f filename so that applications can upload containers, pods and services.
* Using the command line, cmd, run the command minikube service app-neighborfood-service, this way you will have access to the api document, swagger-openapi
<b>Orchestrating containers with minikube, spinning up two instances</b>
<img src="https://i.imgur.com/mBdqY67.png" width=800>
<hr>

NEIGHBORFOOD MENU

* 7.1 - There is a Mercado Pago webhook for us to test the payment, the integration of this service should be well used, it is where we will prove a way to plug the service without                 harming our layers.

<hr>
Java documentation, generated by Maven, contains detailed information about the technologies used, versions and much more, It can be accessed through the target/site.
<img src="https://i.imgur.com/5hpRaRG.png" width=900>
</hr>
