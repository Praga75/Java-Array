import java.util.Scanner;
public class Sort_freq {
public static void main(String[] args) {
int arr[]={4,5,5,4,2,1,2};
int n=arr.length;;
int arr1[][]=new int[n][2];

int i,j,k=0;
int count = 1;
for(i=0;i<n;i++) {
count=1;
for(j=i+1;j<n;j++) {
if(arr[i]==arr[j])	{
count++;
arr[j]='\0';
}
}
if(arr[i]!='\0') {
arr1[k][0]=count;
arr1[k][1]=arr[i];
k++;

}
}
int temp=0;
for(i=0;i<n;i++) {
  for(j=i+1;j<n;j++) {
    if((arr[i]!=0||arr[j]!=0)&&(arr1[i][0]==arr1[j][0])) {
        if(arr1[i][1]>arr1[j][1]) {
        temp= arr1[i][1];
		arr1[i][1]=arr1[j][1];
		arr1[j][1]=temp;
        }
        
    }
    else if(arr1[i][0]<arr1[j][0]) {
		temp= arr1[i][0];
		arr1[i][0]=arr1[j][0];
		arr1[j][0]=temp;
    
		temp= arr1[i][1];
		arr1[i][1]=arr1[j][1];
		arr1[j][1]=temp;

}
}
}
for(i=0;i<n;i++) {
	temp=arr1[i][0];
while(temp>0) {
	System.out.print(arr1[i][1]+" ");
	temp--;
}
}

}
}

