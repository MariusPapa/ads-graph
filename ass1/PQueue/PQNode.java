package ass1.PQueue;

public class PQNode<T> implements Comparable<PQNode<T>> {

    public T element;
    public PQNode<T> next;
    public double priority;
    public int secPriority;

    public PQNode(T element, double priority, int secPriority) {
        this.element = element;
        this.priority = priority;
        this.secPriority = secPriority;
        this.next = null;
    }
    
   /**
    * Gets the element;
    * @return
    */
    public T getElement()
    {
    	return element;
    }
    
    /**
     * Sets the next element
     * @param element
     */
    public void setNext(PQNode<T> element)
    {
    	next = element;
    }

    /**
     * Gets the next element
     * @return
     */
    public PQNode<T> getNext()
    {
    	return next;
    }
    
    /**
     * Gets the first priority
     */
    public double getPriority()
    {
    	return priority;
    }
    
    /**
     * Gets second priority
     * @return
     */
    public int getSecPriority()
    {
    	return secPriority;
    }
    
    /**
     * Returns less than zero, if this PQNode's priority is less than the parameter PQNode. Zero if they are the same.
     * Larger than zero if the parameter PQNode is less than this PQNode.
     * @param tpqNode node to compare against
     * @return integer based on the comparison
     */
    @Override
    public int compareTo(PQNode<T> tpqNode) {
        if(priority == tpqNode.priority) {
            return secPriority - tpqNode.secPriority;
        }
        return priority < tpqNode.priority ? -1 : 1;
    }
}
