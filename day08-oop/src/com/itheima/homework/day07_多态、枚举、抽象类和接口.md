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
```java

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
```java

```
