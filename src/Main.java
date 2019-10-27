import java.net.FileNameMap;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

/**
 * @ClassName Main
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/10/24  21:06
 * @Veresion 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Contact contact=new Contact();
        while(true){
            //打印操作界面
            menu();
            //用户输入选择
            int selected=scanner.nextInt();
            //根据不同用户选择执行不同操作
            scanner.nextLine();
          switch(selected){

              case 1:add(contact,scanner);break;
              case 2:search(contact,scanner);break;
              /*case 3:remove(scanner);break;
              case 4:update(scanner);break;*/
              default:
                  System.out.println("输入错误！");
          }
        }
    }



    private static void menu() {
        System.out.println("通讯录");
        System.out.println("1.添加             2.查找");
        System.out.println("3.删除             4.更新");
        System.out.println("请选择：");
    }

    private static void add(Contact contact, Scanner scanner) {
        System.out.println("请输入姓名：");
        String name=scanner.nextLine();
        System.out.println("请输入电话号码：");
        String mobilePhone=scanner.nextLine();
        System.out.println("请输入办公室电话：");
        String officePhone=scanner.nextLine();
        try {
            contact.add(name,mobilePhone,officePhone);
            System.out.println("添加成功！");
        }
        catch (NameExistException e){
            System.out.println("用户已存在，添加失败！");
        }
        finally {
            System.out.println("*****************************");
        }
    }
    private static void search(Contact contact,Scanner scanner) {
        String name=scanner.nextLine();
       try{
           contact.search(name);
           System.out.println("查找成功！");
       }
       catch (NameIsNotExist e){
           System.out.println("用户不存在，查找失败！");
       }
       finally {
           System.out.println("***************************");
       }
    }
}
