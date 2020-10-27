package daily_Algorithm;

import java.util.*;

class Main{
	public static void main(String[]t){
		Scanner k=new Scanner(System.in);
		int n=k.nextInt(),i,s=0,b,d=97;
		char[]c,a;
		for(;n>0;n--){
			c=k.next().toCharArray();
			a=new char[26];
			b=0;
			a[c[0]-d]=1;
			for(i=1;i<c.length;i++){
				if(c[i-1]!=c[i]) {
					if(a[c[i]-d]>0){
					b=1;
					break;
					}else { 
						a[c[i]-d]=1;
					}
				}
			}
			s+=b>0?0:1;
			}
		System.out.print(s);
		}
	}