public class GenericDemo {

    public static void main(String[] args){
        GenType<Integer> getInt = new GenType<Integer>();

        getInt.setObj(21);

        int value = getInt.getObj();

        GenType<String> genStr = new GenType<String>();
        genStr.setObj("Generic class test");

        String str = genStr.getObj();
        System.out.println("String value " + str);

        GenType<Double> genDouble = new GenType<Double>();

        GenClass<String, String> g1 = new GenClass<String,String>("A","Value A");

        System.out.println("Key- " + g1.getKey());
        System.out.println("Value- " + g1.getValue());

        GenClass<Integer, String> g2 = new GenClass<>(1,"Value 1");
        System.out.println("Key- " + g2.getKey());
        System.out.println("Value- " + g2.getValue());

        GenericDemo gm = new GenericDemo();

        Integer[] intArray = {1,2,3,4,5,6,7};
        Double[] doubleArray = {3.4,5.6,7.8,1.2,4.5};

        gm.printElements(intArray);
        gm.printElements(doubleArray);


    }

    public <T> void printElements(T[] arr){
        // Displaying elements
        for(int i = 0; i < arr.length; i++){
            System.out.println(" " + arr[i]);
        }
        System.out.println();
    }

    public class GClassImpl<E> implements GInterface<E>{
        E e;
        @Override
        public void setValue(E e){
            this.e = e;
        }
        @Override
        public E getValue(){
            return e;
        }

        // first is to declare generic second is the return type
        public <T> void MethodName(T obj1){

        }

        // first <T> is to declare generic second is return type

    }

}
