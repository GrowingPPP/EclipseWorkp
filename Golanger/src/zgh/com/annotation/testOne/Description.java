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
 *	��һ,ֻ����public��Ĭ��(default)����������Ȩ����.����,String value();����ѷ�����ΪdefaulĬ������. 
	�ڶ�,������Աֻ���û�������byte,short,char,int,long,float,double,boolean���ֻ�����������
	��String,Enum,Class,annotations����������,�Լ���һЩ���͵�����.����,String value();
	����Ĳ�����Ա��ΪString. 
	����,���ֻ��һ��������Ա,��ðѲ���������Ϊ"value",���С����.��:��������Ӿ�ֻ��һ��������Ա.
 * @author Administrator
 *
 */
public @interface Description {
	String value();
}
