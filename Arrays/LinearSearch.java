import java.util.*;

public class LinearSearch{
    public static int linear_search(int num[],int key){
        for(int i=0; i<num.length ; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int num[] = {2,5,1,9,11,8};
        int key = 11;
        int index = linear_search(num,key);

        if(index ==-1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index"+" "+ index);
        }
    }
}