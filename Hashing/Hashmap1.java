import java.util.*;
public class Hashmap1 {
    static class HashMap<K,V> {  //generics / key value pair / parameterized types
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n-nodes
        private int N; //N-buckets
        private LinkedList<Node> buckets[]; //N = buckets.length // array linkedlist used for hashmap store all the data

        @SuppressWarnings("unchecked")
        public HashMap() { //constructor of HashMap class
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll =buckets[bi];
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); //bucket index
            int di = searchInLL(key, bi); //di = -1 data index where LL ka index is stored

            if(di == -1) { //key doesn't exist
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = {double}n/N;
            if(lamdba > 2.0){
                //rehashing
            }
        }

        public boolean containsKey(K key) {
            return false;
        }

        public V remove (K key) {
            return null;
        }

        public V get(K key) {
            return null;
        }

        public ArrayList<K> keySet() {
            return null;
        }

        public boolean isEmpty() {
            return false;
        }



    }
}

//HashMap functions
// put()
// get()
// containsKey()
// remove()
// size()
// keySet()