package zgh.com.ifelse;

public class If {
  /*
  * if(�������ʽ 1){
	   		//����������ʽ 1��ֵΪtrueִ�д���
		}else if(�������ʽ 2){
		   //����������ʽ 2��ֵΪtrueִ�д���
		}else if(�������ʽ 3){
		   //����������ʽ 3��ֵΪtrueִ�д���
		}else {
		   //������ϲ������ʽ����Ϊtrueִ�д���
		}
   */
	public void Switch(){
		/**
		 * ����
		    ��ĵȼ��� C
		 */
		      char grade = 'C';
		      switch(grade)
		      {
		         case 'A' :
		            System.out.println("����"); 
		            break;
		         case 'B' :
		         case 'C' :
		            System.out.println("����");
		            break;
		         case 'D' :
		            System.out.println("����");
		         case 'F' :
		            System.out.println("����Ҫ��Ŭ��Ŭ��");
		            break;
		         default :
		            System.out.println("δ֪�ȼ�");
		      }
		      System.out.println("��ĵȼ��� " + grade);
	}
}
