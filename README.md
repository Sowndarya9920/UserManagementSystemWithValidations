
# ***User Management System With Validations***

- The aim of the project is to perform the basic CRUD operations with some validations.
- Spring initializer was used to create a spring boot application project.

![Screenshot (106)](https://user-images.githubusercontent.com/112794922/235078410-fe754eb6-a77c-4c14-af93-561259dbad5d.png)


## **Frameworks and Languages used :**

- Java
- Spring Boot

![image](https://user-images.githubusercontent.com/112794922/235080305-aaa63026-92ef-40b2-b3c2-72102efd73ee.png)




## **Dependency used :**

- Spring web
- Spring Boot Dev Tool
- Lombok
- Validations

![image](https://user-images.githubusercontent.com/112794922/235080363-aebb5c84-379d-4d3c-aede-a4e74d2993ce.png)


## **Data Flow :**

## **Model :** 

- It consists of a Users class which consists of Entity's used to model our data application.
- By using Lombok dependency , ___@Data___ , ___@AllArgsConstructor___ , ___@NoArgsConstructor___ is used to create getters and setters as well as default and parameterized constructors.

![image](https://user-images.githubusercontent.com/112794922/235080395-277ef21f-6738-4a67-a940-4f39fc3a462b.png)


## **Controller :**

- It consists of UsersController class which basically control the flow of data.
- ___@RestController___ annotation is used to make the RestaurantController class as controller layer.
- ___@GetMapping , @PostMapping , @PutMapping , @DeleteMapping___ annotations are used to perform the CRUD operations.
- ___@Valid___ is used in post mapping in order to do some validations while inserting the data.

![image](https://user-images.githubusercontent.com/112794922/235081160-a94fa525-efe7-47a5-82e9-28e09f842859.png)





- ### **API Reference :**

#### ***Get all Users***

```http
  http://localhost:8080/getAllUsers
```

![image](https://user-images.githubusercontent.com/112794922/235081239-3b286306-ce03-4256-b036-350f89aa545c.png)


#### ***Get Users By Id***

```http
  http://localhost:8080/getUserById/{userId}
```

![image](https://user-images.githubusercontent.com/112794922/235081299-b2d3da46-4117-4fa9-b9b1-7b1c57375e3e.png)


#### ***Add Users***

```http
  http://localhost:8080/addUsers
```

![image](https://user-images.githubusercontent.com/112794922/235081368-7240fcee-3c40-4092-b1a6-dcd4877f8927.png)


#### ***Delete Users by Id***

```http
  http://localhost:8080/deleteUserById/{userId}
```

![image](https://user-images.githubusercontent.com/112794922/235081458-d3005e3a-b293-4f51-97af-d575f1d9ff4e.png)


#### ***Update Users by email***

```http
  http://localhost:8080/updateUser/{userId}/{email}
```

![image](https://user-images.githubusercontent.com/112794922/235081499-541e0f2a-720b-484e-896f-17823f70c4be.png)


## **Service :** 

- It consists of UsersService class which helps us to write the business functionalities.
- ___@Service___ annotation is used to make the class as a service layer.

![image](https://user-images.githubusercontent.com/112794922/235082066-cbc3e94c-e79e-4f2a-85d2-f0488e608ffd.png)


## **Repository :**

- It consists of UsersDao which is used to manage or datas.
- ___@Repository___ annotation is used to make the class repository layer.

![image](https://user-images.githubusercontent.com/112794922/235082168-c5064d46-0876-4775-a5ef-7aed0f890343.png)


## **Validations :** 
- ___@NotEmpty___ is used as validation for userName in order to specify that the name inserted must not be empty.
- ___@Email___ is used as validation in email in order to specify the email must be in the order of ___abc@gmail.com___
- ___@Size___ and ___@Pattern___ is used as validations in date of birth and phone number in order to specify the phone nymber must consists of ___10 or 12 digits___ and date of birth should be ___yyyy-mm-dd___.

![image](https://user-images.githubusercontent.com/112794922/235082196-902299f3-ed8f-4edf-b793-76b43f2ca90e.png)

## **View :**

#### ***Get All Users :***
![image](https://user-images.githubusercontent.com/112794922/235097720-bd28bee0-5b6b-43eb-9db0-5401fe5874bf.png)

#### ***Add Users :***

![image](https://user-images.githubusercontent.com/112794922/235097805-abca79b6-615f-429e-9830-c5e64407c127.png)
![image](https://user-images.githubusercontent.com/112794922/235097895-305892a7-cb23-4261-9807-952f5cd06371.png)


#### ***Get User By UserId :***
![image](https://user-images.githubusercontent.com/112794922/235097994-5729445d-9940-406d-b5e1-f3ce6073ed1c.png)

#### ***Delete User By userId :***
![image](https://user-images.githubusercontent.com/112794922/235098108-b5805bf6-202c-4643-85c7-b07bb25c3a9c.png)
![image](https://user-images.githubusercontent.com/112794922/235098123-13b7352a-0ab4-4b25-b935-e82c9d80fded.png)

#### ***Update User By email :***
![image](https://user-images.githubusercontent.com/112794922/235098214-f7a373b2-baf9-4956-84ec-1ec9035ff5fa.png)





 


## **Summary :**

- In this project , I had created the RestApi's performing various ___CRUD operations___ such as fetch , save , delete and update users with ___validations___.
- The RestApi's are tested by using ___Postman___ which is a client used to test our Api's.

