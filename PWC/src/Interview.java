import com.sun.javafx.beans.IDProperty;

public class Interview {
    public static void main(String[] args) {

    }
}


// first create a project with spring project with dependencies like spring-web-starter, spring test, spring data ,lombok , h2db dependency
// add database configuration -> properties for db connection in application.properties file
// add folder controller ->

@RestController(value="/myData")
@CrossOrigin()
class myController{

    @Autowired
    MyService myService;

    @GetMapping("/")
    public Object getData(){
        return myService.getData();
    }

}
@RestController(value="/myData1")
@CrossOrigin()
class myController{

    @Autowired
    MyService myService;

    @GetMapping("/")
    public Object getData(){
        return myService.getData();
    }

}

Handling expception
        Add exception ahndler annoate it with @ControllerAdvice which will intercept any excpetion event and create appropriate response
        under controller advice class i will add excptionahndler mehtods and add logic to create ResponseEntity objects with proper http error bode like
500, 400,

// add a service folder -> create service

@Service
interface myService {

    public Object getData();
}

@Service
class mySericeImpl  implements  myService{

    @Autowired
    MyRepository myRepository;

    public Object getData() {
        return data;
    }

}

create DTO object which will return data requested format .
create POJO/entity classe

class MyDTO{

    myproperties;

    getter
    setters
}


@Entity
class myEntity{

    @IDProperty(


    )
}

create repository layer

interface myRepository{
    public Object getData();

}

class myrepositoryImpl implements myRepository{

    @Autowired
    DBConnection connection;


    public Object getData(){

        return data;
    }

}

Add tests -->

    ---    Unit Tests --

service
        Add unit test for service
        mock repo
        mock other services

controller
        Add unit test for controller
        mock repo
        mock other services
repository
        Add unit test for repository
--- Integration tests ---
Add integration tests
 Here i will add success and failure test with real time data

/// Add sub folder in root repo  PWC-> client
// under client folder create new angular project .
// Add new component my data and add a route in app.module.ts
// add a service folder -> add a service myServiceforBackend
// add data folder and add your dto object here
// implment service method which returns observable of type Object
// inject service class in component constructor --> contructor(private mySer:MyServiceforBackend, .....)

// component typescript file -> add property and in constructor initialize it to default or empty
// component ngOninIt life cycle hook -> call method getData()
// private getDataMethod() which call the service getData emthod and populate the Myproperty field.
// component template file --> Add a div . Under Div --> data binding using {{ myproperty}}.
// Add css for component in .css file . MyDataDiv
// interceptor for handling excpetions

<div class="myDataDiv">
        <div *ngFor="let d of myDataList">
      <h1>d.dataId</h1>
<p> d.name</p>

</div>
        {{myProperty}}
</div>

