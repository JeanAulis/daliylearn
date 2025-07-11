	/*
	1.1 简答题一
	请说明 Java 是哪一年在哪家公司所诞生的, 如果现在要下载 JDK , 到哪个官网进行下载呢 ?
	答：1995年，于美国Sun公司（Stanford University Network）推出。现在下载需要到oracle官网下载https://www.oracle.com
	
	
	1.2 简答题二
	简述 Java 语言的三个平台版本, 以及各自的开发方向 ？
	答：
	JavaSE: Java 语言的（标准版），用于桌面应用的开发，是其他两个版本的基础
	JavaME: 适用于嵌入式开发，目前已停止维护
	JavaEE: 企业级开发，用于 Web 方向的网站开发
	
	1.3 简答题三
	简述 JDK, JRE, JVM 三者的关系和各自的作用
	答：
	JVM（Java Virtual Machine），Java虚拟机
	JRE（Java Runtime Environment），Java运行环境，包含了JVM和Java的核心类库（Java API）
	JDK（Java Development Kit）称为Java开发工具，包含了JRE和开发工具

	1.4 简答题四
	聊聊你对 Path 环境变量的看法, 解释下我们为什么要将 JDK 配置到 Path 当中
	答：这玩意儿非常有用，且便于管理。配置Path环境变量可以全局访问对应命令，便于开发使用，可以在非安装目录下使用对应命令。
	
	1.5 简答题五
	简述编写 Java 代码的三个步骤, 中途需要用到 JDK 的哪些工具命令呢 ? 工具命令又是怎样的用法呢 ?
	答：1、新建java文件（touch HelloWorld.java) 
	2、编写代码内容
	3、javac编译运行：
		javac 文件名.java 
		java 类名
		
	1.6 简答题六
	简述下注释的作用, 以及注释的分类和格式
	答：注释是对代码的解释和说明文字，可以提高程序的可读性，因此在程序中添加必要的注释文字十分重要。
	
	// 行注释
	/* 块注释 */
	/** 文档注释*/
	

	
	
	

//	1.7 简答题七
//	请使用注释描述, 以下三段代码的作用
public class HelloWorld01 {
	// 声明类名
	
		public static void main(String[] args){
		// 主函数入口
			System.out.println("HelloWorld"); // 输出HelloWorld并换行
		}
	

	
	/*
	1.8 简答题八
	请描述下 Java 中常量的分类和写法
	答：常量：在程序运行过程中，其值不可以发生改变的量。
		Java中的常量分类：
			字符串常量  用双引号括起来的多个字符（可以包含0个、一个或多个），例如"a"、"abc"、"中国"等
			字符常量  用单引号括起来的一个字符，例如：'a'、'5'、'B'、'中'
			整数常量  整数，例如：-10、0、88等
			小数（浮点数）常量  小数，例如：-5.5、1.0、88.88等
			布尔常量  布尔值，表示真假，只有两个值true和false
			空常量  一个特殊的值，空值，值为null
			除空常量外，其他常量均可使用输出语句直接输出。
			
			System.out.println(10); // 输出一个整数
			System.out.println(5.5); // 输出一个小数
			System.out.println('a'); // 输出一个字符
			System.out.println(true); // 输出boolean值true
			System.out.println("欢迎成为Java程序员"); // 输出字符串
	
		
	1.9 简答题九
	聊一聊你对变量的理解, 说明在什么情况下, 该定义变量
	答：当需要重复使用或者需要获取输入的时候需要定义变量。
	
	变量的定义格式：
		变量类型 变量名 = 赋值；
	
	
	
	1.10 简答题十
	请描述 Java 基本数据类型的 8种, 分别是什么 ?
	答：byte: 字节; byte a = 1; 取值范围：-127～128
		int: 整型；int b = 123; 取值范围：-2的31次方到2的31次方-1
		short: 短整型; short c = 23; 取值范围：-32768~32767
		long: 长整型; long  d = 999999999999999L; 取值范围：-2的63次方到2的63次方-1
		float: 单精度浮点型; float e = 2.24f; 取值范围：负数：-3.402823E+38到-1.401298E-45 正数：   1.401298E-45到3.402823E+38
		double: 双精度浮点型: double f = 9.32424234234; 取值范围：负数：-1.797693E+308到-4.9000000E-324 正数：4.9000000E-324   到1.797693E+308
		char: 字符型; char g = '9'; 取值范围：0-65535
		boolean: 布尔型; boolean = true; 取值范围: true，false
		
	1.11 简答题十一
	简述下什么是标识符, 在定义标识符的时候, 应该满足哪些规则和规范呢 ?
	答：标识符是用户编程时使用的名字，用于给类、方法、变量、常量等命名。
	Java中标识符的组成规则【法律】：
		由字母、数字、下划线“_”、美元符号“$”组成，第一个字符不能是数字。
		不能使用java中的关键字作为标识符。	
		标识符对大小写敏感（区分大小写）。
	Java中标识符的命名约定【道德】：
		小驼峰式命名：变量名、方法名
			首字母小写，从第二个单词开始每个单词的首字母大写。
		大驼峰式命名：类名
			每个单词的首字母都大写。
	另外，标识符的命名最好可以做到见名知意
		例如：username、studentNumber等。
	*/
	
	
}