package stackqueuehash.hash;
class myHashMap {
    private int[] map;

    public myHashMap() {
        map = new int[1000];
        for (int i = 0; i < map.length; i++)
            map[i] = -1;
    }

    void put(int key, int value) {
        map[key] = value;
    }

    int get(int key) {
        return map[key];
    }

    void remove(int key) {
        map[key] = -1;
    }

    public static void main(String[] args) {
        myHashMap obj = new myHashMap();
        obj.put(1, 10);
        System.out.println(obj.get(1));
        obj.remove(1);
        System.out.println(obj.get(1));
    }
}
