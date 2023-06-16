# spring-security-basicauthentication
This is an educational Java Spring Security application that implements basic authentication.

There are 2 roles: **USER** and **ADMIN**, that have different authorities.

**USER** has access to:
* GET

**ADMIN** has access to:
* GET
* POST
* PUT
* DELETE

If the user is not authenticated he does not have access to any commands.

<img width="913" alt="Снимок экрана 2023-06-16 в 18 39 53" src="https://github.com/lavrentyevn/spring-security-basicauthentication/assets/111048277/2b6e4539-2b05-4f92-a5a3-490f0dc3b7a3">
\
\
\
If the user has the authority he can access information, which is demonstrated by 200 status code.

<img width="1200" alt="Снимок экрана 2023-06-16 в 18 41 11" src="https://github.com/lavrentyevn/spring-security-basicauthentication/assets/111048277/daf7e266-a228-4e68-a6f6-d23297461cdd">
\
\
\
User information is stored in a PostgreSQL database.

<img width="551" alt="Снимок экрана 2023-06-16 в 18 40 21" src="https://github.com/lavrentyevn/spring-security-basicauthentication/assets/111048277/70e4e69c-bbf9-46ba-9906-8d103300a9f4">
