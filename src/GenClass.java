public class GenClass <K,V> {

    private K key;
    private V value;
    public GenClass(K key,V Value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

}
