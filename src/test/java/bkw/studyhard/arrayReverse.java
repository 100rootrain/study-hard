package bkw.studyhard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 배열 역순정렬
 */
public class arrayReverse {
    public static void main(String[] args) {
//방법1
        String arr[] = {"korea","american","japan","china"};

        for(int i=0; i<arr.length/2; i++){ //0,1
            String temp = arr[i]; //arr[0], arr[1]
            arr[i] = arr[arr.length -i -1]; //arr[0]=arr[4-0-1] , arr[1]=arr[4-1-1]
            arr[arr.length -i -1] = temp; // arr[4-0-1] = arr[0], arr[4-1-1] = arr[1]
        }

        System.out.println("리버스 후 배열: " + Arrays.toString(arr));

//방법2

        int[] a = new int[]{1,2,3,4,5,6,10,12,11,14};
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[a.length-i-1];
// 0,1,2,...9
// b[0] = a[9]
// b[1] = a[8]
//
        }
        System.out.println("Arrays.toString(b) " + Arrays.toString(b));
        System.out.println("Arrays.toString(a) : "+Arrays.toString(a));

//ArrayList 방법1

        String arr2[] = {"korea","american","japan","china"};

        //정렬 전
        System.out.println("리버스 전 배열: " + Arrays.toString(arr2));

        List<String> listItem = Arrays.asList(arr2);
        Collections.reverse(listItem);
        String[] reversed = listItem.toArray(arr2);
        System.out.println("리버스 후 배열: " + Arrays.toString(reversed) );



    }
}
