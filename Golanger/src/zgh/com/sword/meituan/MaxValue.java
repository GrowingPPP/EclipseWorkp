//package zgh.com.sword.meituan;
//
//public class MaxValue {
//
//	public static int[][] ColorFlip(int[][] arr,int[][] flip) throws ArrayIndexOutOfBoundsException{
//
//		for(int[] i : flip){
//			int x= i[0];
//			int y = i[1];
//			if(x == 0&&y == 0){
//				arr[x+1][y] = back(arr[x+1][y]);
//				arr[x][y+1] = back(arr[x][y+1]);
//			}else if(x>0&&x<3&&y==0){
//				arr[x+1][y] = back(arr[x+1][y]);
//				arr[x][y+1] = back(arr[x][y+1]);
//				arr[x][y+1] = back(arr[x][y+1]);
//			}else if(x>){
//				
//			}
//			
//			arr[x+1][y] = back(arr[x+1][y]);
//			arr[x-1][y] = back(arr[x-1][y]);
//			arr[x][y+1] = back(arr[x][y+1]);
//			arr[x][y-1] = back(arr[x][y-1]);
//		}
//		return arr;
//		
//	}
//	public static int back(int x){
//		if(x == 1){
//			return 0;
//		}else{
//			return 1;
//		}
//	}
//	public static void main(String[] args) {
//		int[][] arr= {{0,0,1,1},{1,0,1,0},{0,1,1,0},{0,0,1,0}};
//		int[][] flip = {{2,2},{3,3},{4,4}};
//		int[][] s = ColorFlip(arr, flip);
//		System.out.println(s);
//	}
//
//}
