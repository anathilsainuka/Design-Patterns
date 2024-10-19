public class NameRepository implements Container {
    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;                              /* This class implements the Container interface.
                                                It contains an array of names and provides an iterator by
                                                     implementing the getIterator method.*/
        @Override
        public boolean hasNext() {

            return index < names.length;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
