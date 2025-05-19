
class A{
    public static void main(String ar[]){
        int arr[]=new int[]{3,4,5,4,3,4};
        int feq[]=new int[1000];
       
        for(int i=0;i<arr.length;i++){
            feq[arr[i]]++;

        }
       
        for(int i:arr){
            if()
            System.out.println(i+"-->"+feq[i]);
            
        }


    }
}