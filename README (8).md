
# ***User Management System With Validations***

- The aim of the project is to perform the basic CRUD operations with some validations.
- Spring initializer was used to create a spring boot application project.


## **Frameworks and Languages used :**

- Java
- Spring Boot

## **Dependency used :**

- Spring web
- Spring Boot Dev Tool
- Lombok
- Validations

## **Data Flow :**

## **Model :** 

- It consists of a Users class which consists of Entity's used to model our data application.
- By using Lombok dependency , ___@Data___ , ___@AllArgsConstructor___ , ___@NoArgsConstructor___ is used to create getters and setters as well as default and parameterized constructors.

## **Controller :**

- It consists of UsersController class which basically control the flow of data.
- ___@RestController___ annotation is used to make the RestaurantController class as controller layer.
- ___@GetMapping , @PostMapping , @PutMapping , @DeleteMapping___ annotations are used to perform the CRUD operations.
- ___@Valid___ is used in post mapping in order to do some validations while inserting the data.




- ### **API Reference :**

#### ***Get all Users***

```http
  http://localhost:8080/getAllUsers
```

#### ***Get Users By Id***

```http
  http://localhost:8080/getUserById/{userId}
```

#### ***Add Users***

```http
  http://localhost:8080/addUsers
```

#### ***Delete Users by Id***

```http
  http://localhost:8080/deleteUserById/{userId}
```

#### ***Update Users by email***

```http
  http://localhost:8080/updateUser/{userId}/{email}
```

## **Service :** 

- It consists of UsersService class which helps us to write the business functionalities.
- ___@Service___ annotation is used to make the class as a service layer.

## **Repository :**

- It consists of UsersDao which is used to manage or datas.
- ___@Repository___ annotation is used to make the class repository layer.

## **Validations :** 
- ___@NotEmpty___ is used as validation for userName in order to specify that the name inserted must not be empty.
- ___@Email___ is used as validation in email in order to specify the email must be in the order of ___abc@gmail.com___
- ___@Size___ and ___@Pattern___ is used as validations in date of birth and phone number in order to specify the phone nymber must consists of ___10 or 12 digits___ and date of birth should be ___yyyy-mm-dd___.
 


## **Summary :**

- In this project , I had created the RestApi's performing various ___CRUD operations___ such as fetch , save , delete and update users with ___validations___.
- The RestApi's are tested by using ___Postman___ which is a client used to test our Api's.

