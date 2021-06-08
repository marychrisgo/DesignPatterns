package iterator;

import java.util.Collection;

public class IteratorDemo
{
    public static void main(String[] args)
    {
        BadLinkedList some_object = new BadLinkedList();
        for (int i = 9; i > 0; --i)
          some_object.insertBack(i);
        some_object.start_iterator();
        while (!some_object.isDone()) {
           System.out.print(some_object.get() + "  ");
           some_object.next();
        }
        System.out.println();
    }
}