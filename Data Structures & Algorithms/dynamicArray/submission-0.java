class DynamicArray {

    int[] array;
    int capacity;
    int size;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        if (i < this.size && i >= 0) {
            return this.array[i];
        }
        throw new NullPointerException("Index out of bounds: index " + i + " out of " + this.size);

    }

    public void set(int i, int n) {
        this.array[i] = Integer.valueOf(n);
    }

    public void pushback(int n) {
        if (this.size == this.capacity) {
            resize();
        }
        this.array[this.size] = n;
        this.size++;
    }

    public int popback() {
        this.size--;
        return this.array[this.size];
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    private void resize() {
        int newCapacity = this.capacity*2;
        int[] temp = new int[newCapacity];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.array[i];
        }
        this.array = temp;
        this.capacity = newCapacity;
    }
}
