### 抽象类
#### 练习一
> 目标：掌握抽象类，方法重写
>

##### 1.需求
```java
某加油站推出了2种支付卡，一种是预存10000的金卡，后续加油享受8折优惠。
    另一种是预存5000的银卡 ,后续加油享受8.5折优惠。
请分别实现2种卡片进入收银系统后的逻辑，卡片需要包含卡号，余额，支付功能。
```

##### 2.知识点
+ 抽象类
+ 方法重写

##### 3.思路分析
```java
1.创建一个抽象卡类(Card)，提供卡号(id)，余额(balance)，抽象的支付方法(pay)。
2.创建一张金卡类(GoldenCard)：重写支付功能，按照原价的8折计算输出。
3.创建一张银卡类(SilverCard)：重写支付功能，按照原价的8.5折计算输出。
```

##### 4. 答案
Card.java

```java
public abstract class Card {
    private String id;
    private double balance;

    public Card() {
    }

    public Card(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    /**
     * 支付功能
     * @param originalMoney 原价
     * @return 打折后的价格
     */
    public abstract double pay(double originalMoney);


    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
```



GoldenCard.java

```java
public class GoldenCard extends Card {
    public GoldenCard() {
    }

    public GoldenCard(String id, double balance) {
        super(id, balance);
    }

    @Override
    public double pay(double originalMoney) {
        // 打折后支付的价格
        originalMoney *= 0.8;

        // 从余额中扣除
        if (getBalance() > originalMoney) {
            setBalance(getBalance() - originalMoney);
            System.out.println("支付成功, 余额为: " + getBalance());
        } else {
            System.out.println("余额不足");
        }

        return originalMoney;
    }
}
```



SilverCard.java

```java
public class SilverCard extends Card {
    public SilverCard() {
    }

    public SilverCard(String id, double balance) {
        super(id, balance);
    }

    @Override
    public double pay(double originalMoney) {
        // 打折后支付的价格
        originalMoney *= 0.85;

        // 从余额中扣除
        if (getBalance() > originalMoney) {
            setBalance(getBalance() - originalMoney);
            System.out.println("支付成功, 余额为: " + getBalance());
        } else {
            System.out.println("余额不足");
        }

        return originalMoney;
    }
}
```



Test01.java

```java
public class Test01 {
    public static void main(String[] args) {
        GoldenCard gc = new GoldenCard("vip88888888", 10000);
        double pay1 = gc.pay(800);
        System.out.println("pay1 = " + pay1);

        SilverCard sc = new SilverCard("ds66666666", 5000);
        double pay2 = sc.pay(20000);
        System.out.println("pay2 = " + pay2);
    }
}
```



#### 练习二
##### 1.需求
```java
请使用代码描述:
1. 经理
  成员变量:工号,姓名,工资
  成员方法:工作(管理其他人),吃饭(吃鱼)
2. 厨师
  成员变量:工号,姓名,工资
  成员方法:工作(炒菜),吃饭(吃肉)
```

按步骤编写代码，效果如图所示：

```java
工号为:v001,姓名为:张三,工资为13000.0的经理在吃鱼
工号为:v001,姓名为:张三,工资为13000.0的经理在工作:管理其他人
------------------------
工号为:p001,姓名为:小李,工资为7000.0的厨师在吃肉
工号为:p001,姓名为:小李,工资为7000.0的厨师在炒菜
```

##### 2.知识点
+ 抽象类
+ 方法重写

##### 3.思路分析
```java
1.把经理Manager和厨师Cook的共性内容(工号属性,姓名属性,工资属性,工作方法,吃饭方法)抽取到员工类Employee
中
2.员工类中定义抽象的工作方法和抽象的吃饭方法
3.经理继承员工,重写工作方法,和吃饭方法
4.厨师继承员工,重写工作方法,和吃饭方法
5.定义测试类，创建经理类的对象，调用吃饭和工作的方法
6.创建厨师类的对戏当，调用吃饭和工作的方法
```

##### 4. 答案
Employee.java

```java
// 抽象的父类
public abstract class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
    public abstract void eat();


    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
```



Manager.java

```java
public class Manager extends Employee {
    public Manager() {
    }

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getId() + ", " + getName() + getSalary() + "管理其他人");
    }

    @Override
    public void eat() {
        System.out.println(getId() + ", " + getName() + getSalary() +"吃鱼");
    }
}

```



Cook.java

```java
public class Cook extends Employee {
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getId() + ", " + getName() + getSalary() +"炒菜");
    }

    @Override
    public void eat() {
        System.out.println(getId() + ", " + getName() + getSalary() +"吃肉");
    }
}
```



Test02.java

```java
public class Test02 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setId("v001");
        m.setName("张三");
        m.setSalary(13000);
        m.work();
        m.eat();

        System.out.println("--------------------");
        Cook c = new Cook("p001", "小丽", 7000);
        c.work();
        c.eat();
    }
}
```



#### 练习三
> 目标：学习如何定义抽象类、实现抽象方法、从键盘输入数据并创建子类对象来计算面积和周长。
>

##### **1. 需求**
```java
定义一个抽象类 Shape，包含两个抽象方法 area() 和 perimeter() 用于计算面积和周长。
定义一个正方形类 Square 继承自 Shape，实现 area() 和 perimeter() 方法。
定义一个圆形类 Circle 继承自 Shape，实现 area() 和 perimeter() 方法。
定义一个测试类 ShapeTest，在其 main 方法中使用键盘输入录入圆形和正方形的相关信息，并创建相应的对象来计算面积和周长。
```

程序执行后，在控制台输出如下信息：

```java
请输入圆的半径：9
圆面积：254
圆周长：56
请输入正方形的边长：10
正方形面积：100
正方形周长:40
```

##### **2. 知识点**
+ 抽象类
    - 格式：public abstract class 类名 { abstract 方法返回类型 方法名(); }
+ 子类实现抽象方法
    - 在子类中提供抽象方法的具体实现。
+ 键盘输入
    - 使用 Scanner 类从键盘读取输入。
+ 计算几何图形的面积和周长

##### **3. 思路分析**
```java
1. 定义 Shape 抽象类，包含抽象方法 area() 和 perimeter()。
2. 定义 Square 类继承自 Shape 类，并实现 area() 和 perimeter() 方法。
3. 定义 Circle 类继承自 Shape 类，并实现 area() 和 perimeter() 方法。
4. 在 ShapeTest 类的 main 方法中创建 Scanner 对象用于读取键盘输入。
5. 使用输入创建 Circle 和 Square 对象，并计算面积和周长。
6. 输出计算结果。
```

##### **4. 答案**
```java
import java.util.Scanner;

// 定义 Shape 抽象类
abstract class Shape {
    // 抽象方法 area() 用于计算面积
    abstract double area();

    // 抽象方法 perimeter() 用于计算周长
    abstract double perimeter();
}

// 定义 Square 类，继承自 Shape
class Square extends Shape {
    private double side; // 正方形的边长

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

// 定义 Circle 类，继承自 Shape
class Circle extends Shape {
    private double radius; // 圆形的半径

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// 测试类 ShapeTest，包含 main 方法
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象用于读取键盘输入

        // 圆形部分
        System.out.println("请输入圆的半径：");
        double radius = scanner.nextDouble();

        // 创建 Circle 对象
        Circle circle = new Circle(radius);

        System.out.println("圆面积：" + Math.round(circle.area()));
        System.out.println("圆周长：" + Math.round(circle.perimeter()));

        // 正方形部分
        System.out.println("请输入正方形的边长：");
        double side = scanner.nextDouble();

        // 创建 Square 对象
        Square square = new Square(side);

        System.out.println("正方形面积：" + square.area());
        System.out.println("正方形周长:" + square.perimeter());
    }
}
```

### 抽象类、多态
#### 练习一
> 目标：掌握多态，抽象类以及类型转换
>

##### 1.需求
```java
定义一个父类Animal 包含name, weight属性和一个抽象的eat方法
定义两个子类Dog和Cat, Dog特有方法lookHome, Cat特有方法catchMouse; 并且重写eat方法, Dog吃骨头, Cat吃鱼
要求:使用多态形式创建Dog和Cat对象, 调用eat方法, 并且使用向下转型, 如果是Cat类型调用catchMouse功能, 如果是Dog类型调用lookHome功能
```

按照步骤实现代码，效果如下

```java
狗吃骨头
老老实实看家
--------------------
猫吃鱼
努力抓老鼠
```

##### 2.知识点
+ 抽象类
+ 方法重写
+ 多态
+ 类型转换

##### 3.思路分析
```java
1. 定义抽象类Animal
2. 在抽象类Animal中包含name,weight属性和一个抽象的eat方法
3. 定义Cat类继承Animal类
4. 在Cat类中重写eat方法
5. 在Cat类中定义catchMouse方法
6. 定义Dog类继承Animal类
7. 在Dog类中重写eat方法
8. 在Dog类中定义lookHome方法
9. 使用多态创建狗对象d
10. 使用多态创建猫对象c
11. 调用d对象的eat方法
12. 调用c对象的eat方法
13. 使用instanceof判断d对象是否是Dog类
14. 如果d对象是Dog类,将d对象向下转型为Dog类型,并调用lookHome方法
15. 使用instanceof判断c对象是否是Cat类
16. 如果c对象是Cat类,将c对象向下转型为Cat类型,并调用catchMouse方法
```

##### 4. 答案
```java
// 定义抽象类Animal
abstract class Animal {
    String name;
    double weight;

    // 构造器
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // 抽象方法eat
    public abstract void eat();
}

// 定义Cat类继承Animal类
class Cat extends Animal {
    // 构造器
    public Cat(String name, double weight) {
        super(name, weight);
    }

    // 重写eat方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 特有方法catchMouse
    public void catchMouse() {
        System.out.println("努力抓老鼠");
    }
}

// 定义Dog类继承Animal类
class Dog extends Animal {
    // 构造器
    public Dog(String name, double weight) {
        super(name, weight);
    }

    // 重写eat方法
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // 特有方法lookHome
    public void lookHome() {
        System.out.println("老老实实看家");
    }
}

public class Main {
    public static void main(String[] args) {
        // 使用多态创建Dog对象
        Animal d = new Dog("旺财", 10.5);

        // 使用多态创建Cat对象
        Animal c = new Cat("喵喵", 2.5);

        // 调用eat方法
        d.eat(); // 输出 "狗吃骨头"
        c.eat(); // 输出 "猫吃鱼"

        // 使用instanceof判断类型
        if (d instanceof Dog) {
            // 向下转型为Dog并调用lookHome方法
            ((Dog) d).lookHome(); // 输出 "老老实实看家"
        }

        if (c instanceof Cat) {
            // 向下转型为Cat并调用catchMouse方法
            ((Cat) c).catchMouse(); // 输出 "努力抓老鼠"
        }
    }
}
```



### 接口、多态
#### 练习一
> 目标：了解接口的定义和实现，掌握接口中抽象方法的使用，以及类实现接口的具体实现方式。
>

##### **1. 需求**
```java
定义一个描述汽车功能的接口 CarAction，在接口中定义一个抽象方法：void run()。
创建两个类 BYD 和 BMW，这两个类都需要实现 CarAction 接口，并且每个类都要有自己的 run() 方法实现。
在测试类 Test 的 main 方法中，创建 BYD 和 BMW 类的对象，并调用它们的 run() 方法。
```

程序执行后，应该分别输出 BYD 和 BMW 类的 run() 方法的实现结果。

##### **2. 知识点**
+ 接口定义
    - 格式：public interface 接口名 { 抽象方法声明; }
+ 实现接口
    - 格式：public class 类名 implements 接口名 { 方法实现; }
+ 创建对象并调用方法

##### **3. 思路分析**
```java
1. 定义 CarAction 接口，包含一个抽象方法 run()。
2. 创建 BYD 类，实现 CarAction 接口，并实现 run() 方法。
3. 创建 BMW 类，同样实现 CarAction 接口，并实现 run() 方法。
4. 在 Test 类的 main 方法中创建 BYD 和 BMW 类的对象，并调用它们的 run() 方法。
```

##### **4. 答案**
```java
// 定义 CarAction 接口，包含一个抽象方法 run()
public interface CarAction {
    void run();
}

// 创建 BYD 类，实现 CarAction 接口
public class BYD implements CarAction {
    @Override
    public void run() {
        System.out.println("BYD正在行驶！");
    }
}

// 创建 BMW 类，实现 CarAction 接口
public class BMW implements CarAction {
    @Override
    public void run() {
        System.out.println("BMW正在行驶！");
    }
}

// 测试类 Test，包含 main 方法
public class Test {
    public static void main(String[] args) {
        // 创建 BYD 类的对象
        CarAction byd = new BYD();
        // 调用 run() 方法
        byd.run();

        // 创建 BMW 类的对象
        CarAction bmw = new BMW();
        // 调用 run() 方法
        bmw.run();
    }
}
```



### 枚举
#### 练习一
> 目标：掌握枚举的定义和使用
>

##### 1.需求
```java
1.定义方向枚举Orientation，包含EAST, SOUTH, WEST, NORTH四个方向值
2.定义一个汽车类，包含属性品牌(brand)以及方法run(),在run方法中打印某个品牌的车正在往某个方向行驶
```

按照步骤实现，执行效果如下

```java
问界M9 汽车向东行驶
```

##### 2.知识点
+ 枚举

##### 3.思路分析
```java
1. 定义方向枚举Orientation，包含EAST, SOUTH, WEST, NORTH四个方向值
2. 定义小汽车Car类
    2.1 定义String类型的品牌(brand)，私有并且提供对应的get/set方法
    2.2 定义方法(run)，方法接收一个Orientation对象，方法中使用switch语句表示不同的方向
3. 定义测试类Test，并包含main方法
4. 在main方法中创建Car对象，调用setBrand()de方法，并调用Car对象的run方法
```

##### 4. 答案
Orientation.java

```java
public enum Orientation {
    EAST, SOUTH, WEST, NORTH;
}
```



Car.java

```java
public class Car {
    private String brand;

    public void run(Orientation o) {
        switch (o) {
            case EAST:
                System.out.println(brand + " 汽车向东行驶");
                break;
            case SOUTH:
                System.out.println(brand + " 汽车向南行驶");
                break;
            case WEST:
                System.out.println(brand + " 汽车向西行驶");
                break;
            case NORTH:
                System.out.println(brand + " 汽车向北行驶");
                break;
        }
    }

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Car{brand = " + brand + "}";
    }
}
```



Demo03.java

```java
public class Demo03 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("问界M9");
        c.run(Orientation.SOUTH);
    }
}
```

