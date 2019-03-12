package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Mylist mylist = new Mylist(array);
        for(Object obj :array ){
            if(mylist.getNumberOfOccurences(obj) >= maxNumberOfDuplications){
                mylist.removeEverything(obj);
            }
        }

        return (Integer[]) mylist.toArray() ;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Mylist mylist = new Mylist(array);
        for (Object obj : array) {
            if (mylist.getNumberOfOccurences(obj)== (exactNumberOfDuplications)) {
                mylist.removeEverything(obj);
            }
        }
        return (Integer[]) mylist.toArray();
    }


}
