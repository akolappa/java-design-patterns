package com.creational.pattern.composite;

import java.util.*;

public class CompositePattern2 {

    public static void main(String[] args) {
        SingleValue singleValue = new SingleValue(10);
        ManyValues manyValues = new ManyValues();
        manyValues.add(10);
        manyValues.add(20);
        MyList valueContainers = new MyList(List.of(singleValue, manyValues));
        System.out.println("Sum -= "+ valueContainers.sum() );
    }
}

interface ValueContainer extends Iterable<Integer> {}

class SingleValue implements ValueContainer
{
    public int value;

    // please leave this constructor as-is
    public SingleValue(int value)
    {
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return Collections.singleton(value).iterator();
    }
}

class ManyValues extends ArrayList<Integer> implements ValueContainer
{
}


class MyList extends ArrayList<ValueContainer>
{
    // please leave this constructor as-is
    public MyList(Collection<? extends ValueContainer> c)
    {
        super(c);
    }

    public int sum()
    {
        int result = 0;
        for (ValueContainer vc : this){
            for(int i : vc){
                result += i;
            }
        }
        return result;
    }
}