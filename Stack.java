public class Stack extends LinkedList
{
    public Stack() //constructor
 
    { 
    
    } 
    
    public void push (Object elem)
    { 
        insertAtFront(elem);
    }
    
    public Object pop( )
    { 
        return removeFromFront(); 
    }

    public Object peek()
    {
        return getFirst();
    }

    public Object del()
    { 
        return removeFirst();
    }
} //end Stack