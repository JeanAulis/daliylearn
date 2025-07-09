
## 基础部分
### 继承
#### 练习一
> 目标：通过练习，掌握使用继承去减少多个类中相同代码的冗余
>

##### 1.需求
```java
请使用继承定义以下类:
程序员(Coder)
  成员变量: 姓名,年龄
  成员方法: 吃饭,睡觉,敲代码

老师(Teacher)
  成员变量: 姓名,年龄
  成员方法: 吃饭,睡觉,上课
```

按照步骤，在控制台输出实现效果如下：

```java
马化腾在吃饭
马化腾睡觉
马化腾敲代码
-------------------
马云在吃饭
马云在睡觉
马云在上课
```

##### 2.技术点说明
+ 继承的练习

##### 3.思路分析
```java
1. 定义父类Person类,将程序员和老师中相同的内容(姓名,年龄,吃饭,睡觉)抽取到父类Person中
2. 定义Coder类继承Person类,添加敲代码方法
3. 定义Teacher类继承Person类,添加上课方法
4. 在测试类中，创建Code对象,并设置成员变量的值,调用Coder对象的eat,sleep,coding方法.创建Teacher对象,并设置成员变量的值,调用Teacher对象的eat,sleep,teach方法
```

##### 4. 答案
Person.java

```java
public class Person {
    private String name; // 姓名
    private int age; // 年龄

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "在吃饭");
    }

    public void sleep() {
        System.out.println(name + "在睡觉");
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
```



Coder.java

```java
// 程序员
public class Coder extends Person {
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }

    // 敲代码
    public void coding() {
        System.out.println(getName() + "在敲代码");
    }
}

```



Teacher.java

```java
public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    // 上课
    public void teach() {
        System.out.println(getName() + "在上课");
    }
}

```



Demo03.java

```java
/*
需求
    请使用继承定义以下类:
    程序员(Coder)
      成员变量: 姓名,年龄
      成员方法: 吃饭,睡觉,敲代码

    老师(Teacher)
      成员变量: 姓名,年龄
      成员方法: 吃饭,睡觉,上课

按照步骤，在控制台输出实现效果如下：
    马化腾在吃饭
    马化腾睡觉
    马化腾敲代码
    -------------------
    马云在吃饭
    马云在睡觉
    马云在上课
 */
public class Demo03 {
    public static void main(String[] args) {
        Coder c = new Coder("马化腾", 48);
        c.eat();
        c.sleep();
        c.coding();

        System.out.println("--------------------");
        Teacher t = new Teacher("马云", 58);
        t.eat();
        t.sleep();
        t.teach();
    }
}
```

#### 练习二
> 目标：通过练习，掌握使用继承去减少多个类中相同代码的冗余
>

##### 1.需求
```java
请使用继承定义以下类:
狗(Dog)
  成员变量: 姓名,颜色,价格
  成员方法: 吃饭,看家

猫(Cat)
  成员变量: 姓名,颜色,价格
  成员方法: 吃饭,抓老鼠
```

按照步骤，在控制台输出实现效果如下：

```java
金毛在吃饭
金毛在看家
----------------
橘猫在吃饭
橘猫在抓老鼠
```

##### 2.技术点说明
+ 继承的练习

##### 3.思路分析
```java
1. 定义父类Animal类,将狗和猫相同的内容(姓名,颜色,价格,吃饭)抽取到父类Animal中
2. 定义Dog类继承Animal类,添加看家方法
3. 定义Cat类继承Animal类,添加抓老鼠方法
4. 在测试类中，创建Dog对象,并设置成员变量的值,调用Dog对象的eat,lookHome方法.创建Cat对象,并设置成员变量的值,调用Cat对象的eat,catchMouse方法
```

##### 4. 答案
Animal.java

```java
// 动物
public class Animal {
    private String name; // 姓名
    private String color; // 颜色
    private double price; // 价格

    public Animal() {
    }

    public Animal(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // 吃饭
    public void eat() {
        System.out.println(name + "在吃饭");
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
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Animal{name = " + name + ", color = " + color + ", price = " + price + "}";
    }
}
```



Dog.java

```java
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }

    // 看家
    public void lookHome() {
        System.out.println(getName() + " 在看家");
    }
}
```



Cat.java

```java
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color, double price) {
        super(name, color, price);
    }

    // 抓老鼠
    public void catchMouse() {
        System.out.println(getName() + " 在抓老鼠");
    }
}
```



Demo04.java

```java
/*
需求
请使用继承定义以下类:
狗(Dog)
  成员变量: 姓名,颜色,价格
  成员方法: 吃饭,看家

猫(Cat)
  成员变量: 姓名,颜色,价格
  成员方法: 吃饭,抓老鼠

按照步骤，在控制台输出实现效果如下：
    金毛在吃饭
    金毛在看家
    ----------------
    橘猫在吃饭
    橘猫在抓老鼠
 */
public class Demo04 {
    public static void main(String[] args) {
        Dog d = new Dog("金毛", "黑色", 333);
        d.eat();
        d.lookHome();

        System.out.println("--------------------");
        Cat c = new Cat("橘猫", "橘色", 666);
        c.eat();
        c.catchMouse();
    }
}
```



#### 练习三
> 目标：学习如何定义类、创建对象以及使用 toString 方法来显示对象的信息。
>

##### **1. 需求**
```java
定义一个汽车类 Car，包含三个描述汽车的属性（如品牌名、价格等）。
在 Car 类中重写 toString 方法，使其能够返回汽车的具体信息。
在测试类 Test 中创建两个 Car 对象，并调用 toString 方法打印两辆汽车的具体信息。
```

程序执行后，在控制台输出两辆汽车的具体信息。

##### **2. 知识点**
+ 类的定义
    - 格式：public class 类名 { 成员变量; 构造方法; 方法; }
+ 构造方法
    - 用于初始化对象的属性。
+ toString 方法
    - 用于返回对象的字符串表示形式。
+ 创建对象并调用方法

##### **3. 思路分析**
```java
1. 定义 Car 类，包含私有的成员变量 brand（品牌名）、price（价格）。
2. 实现 Car 类的构造方法，用于初始化成员变量。
3. 重写 Car 类的 toString 方法，返回汽车的具体信息。
4. 在 Test 类的 main 方法中创建两个 Car 对象，并给它们的属性赋值。
5. 调用 Car 对象的 toString 方法，并打印返回的字符串。
```

##### **4. 答案**
```java
// 定义 Car 类
public class Car {
    private String brand; // 汽车品牌
    private double price; // 汽车价格

    // 有参构造方法
    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // getter 方法
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", price=" + price +
               '}';
    }
}

// 测试类 Test，包含 main 方法
public class Test {
    public static void main(String[] args) {
        // 创建第一个 Car 对象
        Car car1 = new Car("奔驰", 300000.0);
        // 调用 toString 方法并打印
        System.out.println(car1.toString());

        // 创建第二个 Car 对象
        Car car2 = new Car("宝马", 250000.0);
        // 调用 toString 方法并打印
        System.out.println(car2.toString());
    }
}
```



好的，下面是修改后的需求描述，以便初学者更容易理解和完成：

#### 练习四
> 目标：学习如何定义类、创建子类继承父类、重写父类的方法，并通过测试类验证类的功能。
>

##### **1. 需求**
```java
定义一个汽车类 Car，包含三个描述汽车的属性（如品牌名、价格等），以及两个描述汽车行为的方法（启动 start、行驶 run）。
在与 Car 类同级的包中定义两个 Car 类的子类（奔驰 Benz、宝马 Bmw），并在子类中重写父类的 start 和 run 方法。
在测试类 Test 中创建 Benz 和 Bmw 子类的对象，并调用这些对象的方法。
```

程序执行后，在控制台输出 Benz 和 Bmw 子类中重写的方法的结果。

##### **2. 知识点**
+ 类的定义
    - 格式：public class 类名 { 私有成员变量; 构造方法; 方法; }
+ 继承
    - 格式：public class 子类名 extends 父类名 { 方法重写; }
+ 方法重写
    - 在子类中重写父类的方法。
+ 创建对象并调用方法

##### **3. 思路分析**
```java
1. 定义 Car 类，包含私有的成员变量 brand（品牌名）、price（价格）。
2. 实现 Car 类的构造方法，用于初始化成员变量。
3. 在 Car 类中定义两个行为方法 start 和 run。
4. 定义 Benz 类，继承自 Car 类，并重写 start 和 run 方法。
5. 定义 Bmw 类，同样继承自 Car 类，并重写 start 和 run 方法。
6. 在 Test 类的 main 方法中创建 Benz 和 Bmw 类的对象，并调用它们的 start 和 run 方法。
7. 打印输出结果。
```

##### **4. 答案**
```java
// 定义 Car 类
public class Car {
    private String brand; // 汽车品牌
    private double price; // 汽车价格

    // 有参构造方法
    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // start 方法
    public void start() {
        System.out.println(brand + " 正在启动...");
    }

    // run 方法
    public void run() {
        System.out.println(brand + " 正在行驶...");
    }
}

// 定义 Benz 类，继承自 Car
public class Benz extends Car {
    // 使用父类的构造方法
    public Benz(String brand, double price) {
        super(brand, price);
    }

    // 重写 start 方法
    @Override
    public void start() {
        System.out.println(getBrand() + " 正在优雅地启动...");
    }

    // 重写 run 方法
    @Override
    public void run() {
        System.out.println(getBrand() + " 正在平稳地行驶...");
    }
}

// 定义 Bmw 类，继承自 Car
public class Bmw extends Car {
    // 使用父类的构造方法
    public Bmw(String brand, double price) {
        super(brand, price);
    }

    // 重写 start 方法
    @Override
    public void start() {
        System.out.println(getBrand() + " 正在高效地启动...");
    }

    // 重写 run 方法
    @Override
    public void run() {
        System.out.println(getBrand() + " 正在快速地行驶...");
    }
}

// 测试类 Test，包含 main 方法
public class Test {
    public static void main(String[] args) {
        // 创建 Benz 对象
        Car benz = new Benz("奔驰", 500000.0);
        // 调用 start 和 run 方法
        benz.start();
        benz.run();

        // 创建 Bmw 对象
        Car bmw = new Bmw("宝马", 450000.0);
        // 调用 start 和 run 方法
        bmw.start();
        bmw.run();
    }
}
```



### 多态

好的，下面是修改后的需求描述，以便初学者更容易理解和完成：

#### 练习一

目标：学习如何定义类、实现继承、重写方法，并通过多态的形式调用子类特有的方法。

##### **1. 需求**

```java
定义一个父类 Animal，包含 name 和 weight 属性，以及一个 eat 方法（描述动物吃饭）。
定义两个子类 Dog 和 Cat，Dog 特有方法 lookHome，Cat 特有方法 catchMouse；并且重写父类的 eat 方法，Dog 吃骨头，Cat 吃鱼。
在测试类 Test 中使用多态的形式创建 Dog 和 Cat 对象，调用 eat 方法，并且使用向下转型，如果是 Cat 类型则调用 catchMouse 方法，如果是 Dog 类型则调用 lookHome 方法。
```

程序执行后，在控制台输出如下信息：

```java
狗吃骨头
老老实实看家
--------------------
猫吃鱼
努力抓老鼠
```

##### **2. 知识点**

- 类的定义

- - 格式：public class 类名 { 成员变量; 构造方法; 方法; }

- 继承

- - 格式：public class 子类名 extends 父类名 { 方法重写; }

- 方法重写

- - 在子类中重写父类的方法。

- 多态

- - 使用父类引用指向子类对象，并通过向下转型调用子类特有的方法。

- 创建对象并调用方法

##### **3. 思路分析**

```java
1. 定义 Animal 类，包含私有的成员变量 name 和 weight。
2. 实现 Animal 类的构造方法，用于初始化成员变量。
3. 在 Animal 类中定义 eat 方法。
4. 定义 Dog 类，继承自 Animal 类，并重写 eat 方法，添加特有的 lookHome 方法。
5. 定义 Cat 类，同样继承自 Animal 类，并重写 eat 方法，添加特有的 catchMouse 方法。
6. 在 Test 类的 main 方法中创建 Dog 和 Cat 类的对象，并使用多态形式调用它们的 eat 方法。
7. 使用向下转型，如果是 Cat 类型则调用 catchMouse 方法，如果是 Dog 类型则调用 lookHome 方法。
8. 打印输出结果。
```

##### **4. 答案**

```java
// 定义 Animal 类
public class Animal {
    private String name; // 动物的名字
    private double weight; // 动物的重量

    // 有参构造方法
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // getter 方法
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // 行为方法 eat
    public void eat() {
        System.out.println(name + " 正在吃饭.....");
    }
}

// 定义 Dog 类，继承自 Animal
public class Dog extends Animal {
    // 使用父类的构造方法
    public Dog(String name, double weight) {
        super(name, weight);
    }

    // 重写 eat 方法
    @Override
    public void eat() {
        System.out.println(name + " 吃骨头");
    }

    // 特有方法 lookHome
    public void lookHome() {
        System.out.println(name + " 老老实实看家");
    }
}

// 定义 Cat 类，继承自 Animal
public class Cat extends Animal {
    // 使用父类的构造方法
    public Cat(String name, double weight) {
        super(name, weight);
    }

    // 重写 eat 方法
    @Override
    public void eat() {
        System.out.println(name + " 吃鱼");
    }

    // 特有方法 catchMouse
    public void catchMouse() {
        System.out.println(name + " 努力抓老鼠");
    }
}

// 测试类 Test，包含 main 方法
public class Test {
    public static void main(String[] args) {
        // 创建 Dog 对象
        Animal dog = new Dog("大黄", 20.5);
        // 调用 eat 方法
        dog.eat();
        // 向下转型并调用 lookHome 方法
        if (dog instanceof Dog) {
            ((Dog) dog).lookHome();
        }

        // 创建 Cat 对象
        Animal cat = new Cat("小白", 5.0);
        // 调用 eat 方法
        cat.eat();
        // 向下转型并调用 catchMouse 方法
        if (cat instanceof Cat) {
            ((Cat) cat).catchMouse();
        }
    }
}
```


### 扩展部分
#### 练习一
##### 1.需求
```java
某购物商城上，电子产品按照性质分为手机，电脑，相机等类别。
为了方便展示商品信息，请使用所学的继承的知识，设计手机，电脑，相机之间的继承关系。
商品描述：    
1.  手机属性：品牌，价格，通信模式(4g/5g)
     手机功能：打电话，拍照

2.  电脑属性：品牌，价格，cpu数量
     电脑功能：编程，拍照

3.  相机属性：品牌，价格，相机类型（单反/数码）
     相机功能：录像，拍照
```

按照步骤，在控制台输出实现效果如下：

```java
使用了价格是4999的5G的水果手机打电话
打开了美颜进行拍照
-----------------------------------------
使用了价格是7999的8核的拯救者电脑进行编程
简单拍照  
-----------------------------------------
使用了价格是6000的佳能相机录像
使用人像模式去拍照 
```

##### 2.技术点说明
+ 继承
+ 方法重写
+ super()

##### 3.思路分析
```java
定义数码产品类Digital
    包含属性：品牌(brand)，价格(price)
    提供get和set方法，无参和满参构造方法。
    定义拍照方法：takePhoto()

2. 定义手机类Phone，继承Digital类
    包含属性：通信模式（mode）
    提供无参和满参构造方法，满参构造方法调用父类满参构造方法。
    定义打电话方法：call()

3. 定义电脑类Computer，继承Digital类
    包含属性：cpu数量（cpu）
    提供无参和满参构造方法，满参构造方法调用父类满参构造方法。
    定义编程方法：coding()

4.定义相机类Camera，继承Digital类
    包含属性：相机类型（type）
    提供无参和满参构造方法，满参构造方法调用父类满参构造方法。
    定义录像方法：video()

优化：由于手机和相机的拍照功能比较强大，可以考虑重写父类的拍照方法。
```

##### 4. 答案
Digital.java

```java
public class Digital { // 电子产品
    private String brand;
    private double price;


    public Digital() {
    }

    public Digital(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * 获取
     *
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public void takePhoto() {
        System.out.println("简单拍照");
    }
}
```



Phone.java

```java
public class Phone extends Digital {
    private String mode;

    public Phone() {
    }

    public Phone(String brand, double price, String mode) {
        super(brand, price);
        this.mode = mode;
    }

    /**
     * 获取
     *
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * 设置
     *
     * @param mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    public void call() {
        System.out.println("使用了价格是" + getPrice() + "的" + mode + "的" + getBrand() + "手机打电话");
    }

    @Override
    public void takePhoto() {
        System.out.println("打开了美颜进行拍照");
    }
}
```



Computer.java

```java
public class Computer extends Digital {
    private int cpu;

    public Computer() {
    }

    public Computer(String brand, double price, int cpu) {
        super(brand, price);
        this.cpu = cpu;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void coding() {
        System.out.println("使用了价格是" + getPrice() + "的" + cpu + "核的" + getBrand() + "电脑进行编程");
    }
}
```



Camera.java

```java
public class Camera extends Digital {
    private String type;

    public Camera() {
    }

    public Camera(String brand, double price, String type) {
        super(brand, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void video() {
        System.out.println("使用了价格是" + getPrice() + "的" + getBrand() + "相机录像");
    }

    @Override
    public void takePhoto() {
        System.out.println("使用了人像模式去拍照");
    }
}
```



Demo05.java

```java
public class Demo05 {
    public static void main(String[] args) {
        Computer c = new Computer("拯救者" , 9999 , 24);
        c.coding();
        c.takePhoto();
    }
}
```

