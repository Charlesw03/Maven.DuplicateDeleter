package com.zipcodewilmington.looplabs;


/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Mylist mylist = new Mylist(array);
        for (Object obj : array) {
            if (mylist.getNumberOfOccurences(obj) >= maxNumberOfDuplications) {
                mylist.removeEverything(obj);
            }

        }
        return (String[]) mylist.toArray();
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Mylist mylist = new Mylist(array);
        for (int i = 0; i < array.length; i++) {

            if (mylist.getNumberOfOccurences(array[i]) == exactNumberOfDuplications) {
                mylist.removeEverything(array[i]);
                i--;
            }

        }
        return (String[]) mylist.toArray();
    }
}

