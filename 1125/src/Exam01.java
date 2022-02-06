import java.util.Arrays;
/*
Special Sort
n개의 정수를 가진 배열이 있다. 
이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 
이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 
뒷쪽에 있어야 한다. 
또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.
예. -1 1 3 -2 2 ans: -1 -2 1 3 2.
*/
public class Exam01 {
	public static void main(String[] args) {
		int[] data = {-1, 1, 3, -2, 2};
		System.out.println("정렬전 : " + Arrays.toString(data));
		for(int i=0;i<data.length-1;i++) {
			for(int j=0;j<data.length-1-i;j++) {
				if(data[j]>0 && data[j+1]<0) {
					data[j] = data[j] ^ data[j+1];
					data[j+1] = data[j] ^ data[j+1];
					data[j] = data[j] ^ data[j+1];
				}
			}
		}
		System.out.println("정렬후 : " + Arrays.toString(data));
		// 이놈이 이해하기 편하지 ㅋㅋㅋ
		int[] data2 = new int[data.length];
		int k = 0;
		for(int i=0;i<data.length;i++) if(data[i]<0) data2[k++] = data[i];
		for(int i=0;i<data.length;i++) if(data[i]>0) data2[k++] = data[i];
		System.out.println("정렬후 : " + Arrays.toString(data2));
	}
}
