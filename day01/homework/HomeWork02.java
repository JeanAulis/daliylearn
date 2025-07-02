import java.util.Scanner;

public class HomeWork02{
	public static void main(String[] args){
		/* 
		2.2 编程题目二
		训练目标: Java代码的 编写和运行, 注释的使用
		需求描述: 新建一个 PrintTest类 , 并使用 javac java 命令完成编译运行, 要求使用注释描述代码
		程序打印如下内容
			不肯下一点功夫，永远不会明白自己从何而来，又将立足于何处
			很多聪明人之所以没有成功，缺少的不是智慧，而是那种为成功而拼搏的干劲 
		*/
		System.out.print("不肯下一点功夫，永远不会明白自己从何而来，又将立足于何处\n很多聪明人之所以没有成功，缺少的不是智慧，而是那种为成功而拼搏的干劲 ");
		System.out.println("");
	
		/* 
		2.3 编程题目三
		训练目标: 掌握变量的定义格式, 具有分析需求的能力, 知道自己使用的数据, 该使用哪一种类型变量.
		需求描述:
			现公司网站中需要展示出歌曲的信息, 请使用所学的变量技术, 将下图需要展示的信息, 抽取
			为变量, 并打印在控制台
		*/
		String player = "老鹰乐队（Eagles)";
		String liupai = "流行";
		String zhuanji = "选集";
		String jiezhi = "CD";
		
		int num = 3;
		
		long code = 9787799881720L;
		String ISRC = "CNE260866700";
		
		float pingfen = 9.7f;
		
		System.out.println("");
		System.out.println(player);
		System.out.println(liupai);
		System.out.println(zhuanji);
		System.out.println(jiezhi);
		System.out.println(num);
		System.out.println(code);
		System.out.println(ISRC);
		System.out.println(pingfen);
	
		/* 
		2.4 编程题目四
		训练目标: 能够使用 Scanner 键盘录入整数和字符串
		需求描述: 请简单模拟某网站的注册系统, 从键盘采集用户的信息 (用户名, 密码, 手机号, 邮箱, 验
		证码)
		运行效果:
			请输入您注册的用户名:
			Tony
			请输入您的密码:
			itheima-yyds
			请输入您的手机号:
			15612341234
			请输入您的邮箱:
			Tony@itheima.com
			已发送验证码至您的手机:
			788962
			
			注册成功!
			Tony
			itheima-yyds
			15612341234
			Tony@itheima.com 
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("请输入您注册的用户名:");
		String name = sc.next();
		System.out.println("请输入您的密码:");
		String passwd = sc.next();
		System.out.println("请输入您的手机号:");
		String phoneNum = sc.next();
		System.out.println("请输入您的邮箱:");
		String email = sc.next();
		System.out.println("已发送验证码至您的手机:");
		int phoneCode = sc.nextInt();
		
		System.out.println("");
		System.out.println("注册成功!");
		System.out.println(name);
		System.out.println(passwd);
		System.out.println(phoneNum);
		System.out.println(email);
		System.out.println(phoneCode);
		
	}
}