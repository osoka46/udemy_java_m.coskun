package Radyo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Radyo implements Iterable<String>{
    private ArrayList<String>arrayList;

    Radyo(String[]arr)
    {
        arrayList=new ArrayList<>(Arrays.asList(arr));
    }

    @Override
    public Iterator<String> iterator() {
        return new Itr();
    }
    private class Itr implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index<arrayList.size())
            {
                return true;
            }
            return false;
        }

        @Override
        public String next() {

            String deger= arrayList.get(index);
            index++;
            return deger;
        }
    }
}