package zgh.com.sword;

public class JUzhenlujing {
	/*
	 * ��Ŀ���� �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��
	 * ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ����·�������ٽ���ø��ӡ� ���� a b c
	 * e s f c s a d e e �����а���һ���ַ���"bcced"��·�������Ǿ����в�����"abcb"·����
	 * ��Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
	 */
	/*
	 * 
	 * ��Դ��ţ���� �����������㷨 ����һ�������û�˷������ĵ����⡣
	 * ���ȣ��ھ�������ѡһ��������Ϊ·������㡣���·���ϵĵ�i���ַ�����ch����ô������Ӳ����ܴ���·���ϵ�
	 * ��i��λ�á����·���ϵĵ�i���ַ�������ch����ô�����ڵĸ���Ѱ��·���ϵĵ�i+1���ַ������ھ���߽��ϵĸ���֮�⣬
	 * �������Ӷ���4�����ڵĸ��ӡ� �ظ��������ֱ��·���ϵ������ַ����ھ������ҵ���Ӧ��λ�á�
	 * ���ڻ�˷���ĵݹ����ԣ�·�����Ա�����һ��ջ�����ھ����ж�λ��·����ǰn���ַ���λ��֮�������n���ַ���Ӧ�ĸ��ӵ���Χ��û���ҵ���n+1��
	 * �ַ������ʱ��ֻҪ��·���ϻص���n-1���ַ������¶�λ��n���ַ���
	 * ����·�������ظ��������ĸ��ӣ�����Ҫ������ַ������Сһ���Ĳ���ֵ����������ʶ·���Ƿ��Ѿ�����ÿ�����ӡ�
	 * ������������Ϊ��row,col����
	 * ���Ӻ�·���ַ�������Ӧ���ַ�һ��ʱ����4�����ڵĸ���(row,col-1),(row-1,col),(row,col+1)�Լ�(row+1
	 * ,col)��ȥ��λ·���ַ�������һ���ַ�
	 * ���4�����ڵĸ��Ӷ�û��ƥ���ַ�������һ�����ַ���������ǰ·���ַ������ַ��ھ����еĶ�λ����ȷ��������Ҫ�ص�ǰһ����Ȼ�����¶�λ��
	 * һֱ�ظ�������̣�ֱ��·���ַ����������ַ����ھ������ҵ����ʵ�λ��
	 */
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		int flag[] = new int[matrix.length];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (helper(matrix, rows, cols, i, j, str, 0, flag))
					return true;
			}
		}
		return false;
	}

	private boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
		int index = i * cols + j;
		if (i < 0 || i >= rows || j < 0 || j > cols || matrix[index] != str[k] || flag[index] == 1)
			return false;
		if (k == str.length - 1)
			return true;
		flag[index] = 1;
		if (helper(matrix, rows, cols, i - 1, j, str, k + 1, flag)
				|| helper(matrix, rows, cols, i + 1, j, str, k + 1, flag)
				|| helper(matrix, rows, cols, i, j + 1, str, k + 1, flag)
				|| helper(matrix, rows, cols, i, j - 1, str, k + 1, flag))
			return true;
		flag[index] = 0;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
