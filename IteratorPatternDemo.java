public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}

/*This class demonstrates the use of the Iterator pattern.
It creates an instance of NameRepository and iterates through the names using the NameIterator.
 */