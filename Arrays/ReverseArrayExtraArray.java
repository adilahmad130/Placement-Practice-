public class ReverseArrayExtraArray {
    public static void Reverse(int arr[]){
        int reverse[] = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++ ){
            reverse[i] = arr[arr.length - i - 1];
        }

        System.out.print("Reversed Array: ");
        for(int i : reverse){
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        Reverse(arr);
    }
}