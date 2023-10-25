# CRUD_Spring_Boot
# Spring Boot(CRUD) (Non JPA and Non Hibernate)
# Few Questionaire
Q1.Difference betweeen @Controller and @RestController?
https://www.geeksforgeeks.org/difference-between-controller-and-restcontroller-annotation-in-spring/
	@Controller
@RequestMapping("books")
public class SimpleBookController {

    @GetMapping("/{id}", produces = "application/json")
    public @ResponseBody Book getBook(@PathVariable int id) {
        return findBookById(id);
    }

    private Book findBookById(int id) {
        // ...
    }
}

Q2.What is transactional management annotation?
https://www.geeksforgeeks.org/spring-boot-transaction-management-using-transactional-annotation/

03.In how many ways we can create Object in Java??

04.Which collections provide sorted sequence of data??

05.When to use Arraylist and Linkedlist jn Java?

06.How many bean scopes are there??

07.Code wise illustration of dependency injectiona and polymorphism.

08.Code Practice:
	Map<Integer, String> = list.stream().collect(Collectors.groupingBy(Functions.Identity(),Collectors.counting());
09.In Java 8 streams we cannot use derived class map directly from base class:
{
	{
		personlist.stream().map(Person::getAge).reduce(0,Integer.sum); not allowed
	}
}

10.Spring Container-->Object Factory-->Factory of Objects-->Factory pattern(Object Created by Object Factory)

11.Spring Bean factory()--> Bean Factory produces Spring bean using Spring XML and that bean is handed over to the object(to the requester).

12.Application Context??(Important: code of dependency injection using xml and contructor arg tag)

13.Normal Injection using property tag(setter is called) and constructor injection using constructor tag.

14.Code for Inner beans inside xml file.

15.Diiference between Application Context and Bean factory??

16.What is inner Bean??

17. How to configure scheduler in spring boot?

18.WHy JPA is used over JDBC?

19.In JPA what are @Entity,@Id,@Column,@Table
