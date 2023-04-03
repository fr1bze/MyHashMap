package hashmap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String,Integer> hashMap = new MyHashMap<>(4);
        for (int i = 0; i < 100000; i++) {
         hashMap.put("key" + i,i);
        }
        System.out.println(hashMap.get("key50"));
    }
}
