public class Lv1 {
    public static void main(String[] args){
        int arr[]={15,25,10,30,40,20,50};
        for(int i=1;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if (arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            for (i =0;i< arr.length;i++){
                System.out.print(arr[i]+"\t");
            }
        }

    }
}
