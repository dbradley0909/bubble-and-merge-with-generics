package sorting;

import java.util.ArrayList;
public class Sort {
    public static <E extends Comparable<E>> void bubbleSort(ArrayList<E> arrayList){

        for (int i= arrayList.size() - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
        if (arrayList.get(j).compareTo(arrayList.get(j+1)) > 0){
            swap(arrayList, j, j+1);
        }        
            }
        }
    }

    public static <E> int swap(ArrayList<E> arrayList, int i, int j) {
        E number = arrayList.get(i);
        arrayList.set(i, arrayList.get(j));
        arrayList.set(j, number);
        return j;
}
public static <E extends Comparable <E>> boolean isSorted(ArrayList<E> arrayList){
    for (int i= arrayList.size() - 1; i > 0; i--){
        if(arrayList.get(i).compareTo(arrayList.get(i+1)) > 0){
           return false;
    }
}
return true;
    }
    public static <E extends Comparable <E>> void merge(ArrayList<E> arrayList, int start, int middle, int end){
        int i  = start, j = middle;
        ArrayList<E> tempList = new ArrayList<>(end - start);
        while(i< middle && j < end){
            if (arrayList.get(i).compareTo(arrayList.get(j)) <= 0){
                tempList.add(arrayList.get(i));
                i++;
            }else{
                tempList.add(arrayList.get(j));
                 j++;
                }
                while (i< middle){
                tempList.add(arrayList.get(i));
                i ++;
                }
                while (j < end){
                    tempList.add(arrayList.get(j));
                    j ++;
                    }
                    for(E e: tempList){
                        arrayList.set(start, e);
                        start ++;
                    }
            }
        }
    public static <E extends Comparable<E>> void mergeSort(ArrayList<E> arrayList, int start, int end){
        if(end - start <=1) return;
        int middle = (end + start)/ 2;
        mergeSort(arrayList ,start, middle);
        mergeSort(arrayList ,middle, end);
        merge(arrayList, start, middle, end);
    }
    public static <E extends Comparable<E>> void mergeSort(ArrayList<E> arrayList){
        mergeSort(arrayList, 0, arrayList.size());
    }
}
