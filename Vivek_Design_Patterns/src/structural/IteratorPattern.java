//Epam home task on clean code and serialization
package structural;

interface Iterator {
    public boolean hasNext();
    public Object next();
}

interface Container {
    public Iterator getIterator();
}

class CollectionofNames implements Container {

    public String name[]={"ABC", "DEF","XYZ","PQR","TUV"};

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate() ;
    }

    private class CollectionofNamesIterate implements Iterator {
        int i;
        @Override
        public boolean hasNext() {
            if (i<name.length){
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }
}

class IteratorPatternDemo {
    public static void main(String[] args) {
        CollectionofNames cmpnyRepository = new CollectionofNames();

        for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
