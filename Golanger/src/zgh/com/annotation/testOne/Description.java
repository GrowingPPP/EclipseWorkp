package zgh.com.annotation.testOne;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)


/**
 *	第一,只能用public或默认(default)这两个访问权修饰.例如,String value();这里把方法设为defaul默认类型. 
	第二,参数成员只能用基本类型byte,short,char,int,long,float,double,boolean八种基本数据类型
	和String,Enum,Class,annotations等数据类型,以及这一些类型的数组.例如,String value();
	这里的参数成员就为String. 
	第三,如果只有一个参数成员,最好把参数名称设为"value",后加小括号.例:上面的例子就只有一个参数成员.
 * @author Administrator
 *
 */
public @interface Description {
	String value();
}
