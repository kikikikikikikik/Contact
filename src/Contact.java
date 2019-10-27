
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Contact
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/10/24  21:09
 * @Veresion 1.0
 */
public class Contact {
    Map<String,User>  map=new HashMap<>();
    public void add(String name,String mobilePhone,String officePhone)throws NameExistException{
        User user=new User(name,mobilePhone,officePhone);
        if(map.containsKey(name)){
            throw new NameExistException();
        }
        map.put(name,user);
    }
    public void search(String name)throws NameIsNotExist{
        if(!map.containsKey(name)){
            throw new NameIsNotExist();
        }
        System.out.println(name+" " +map.get(name));
    }
}
