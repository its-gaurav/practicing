package lrucache;

public class CacheUtil {

    public static void main(String[] args) {
        MyLRUCache lruCache = new MyLRUCache(3);
        lruCache.put(1,10);
        lruCache.put(3,15);
        lruCache.put(2,12);
        lruCache.entrySets();
        lruCache.get(3);
        lruCache.put(4,20);
        lruCache.entrySets();
        lruCache.get(2);
        lruCache.put(6,25);
        lruCache.entrySets();



    }
}
