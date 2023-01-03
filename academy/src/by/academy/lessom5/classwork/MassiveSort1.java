//отсортировать в порядке убывания

package by.academy.lessom5.classwork;

public class MassiveSort1 {
	public static void main(String[] args) {
		char [] charArray = {'c','d','l','g','h','a','K','r','P','1'};
		for (int i=0; i<charArray.length;i++) {
			for (int j=i+1; j<charArray.length;j++) {
				if (charArray[i]>charArray[j]) {
					char temp = charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;
				}
			}
		}
		System.out.println(charArray);	
	}

}
