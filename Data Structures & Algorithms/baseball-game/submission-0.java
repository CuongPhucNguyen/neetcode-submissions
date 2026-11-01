class Solution {
    public int calPoints(String[] operations) {
        int result = 0;

        Stack<Integer> inputs = new Stack<>();

        for (String i : operations) {
            if ("C".equals(i)) {
                inputs.pop();
            } else if ("D".equals(i)) {
                inputs.push((inputs.get(inputs.getSize()-1))*2);
            } else if ("+".equals(i)){
                inputs.push(inputs.get(inputs.getSize()-1) + inputs.get(inputs.getSize()-2));
            } else {
                inputs.push(Integer.parseInt(i));
            }
        }

        int stackSize = inputs.getSize();
        for (int i = 0; i < stackSize; i++) {
            result += inputs.pop();
        }

        return result;
    }
}

class Stack<T> {
    T[] array;
    int size;
    int capacity;

    public Stack() {
        this.array = (T[]) new Object[1];
        this.size = 0;
        this.capacity = 1;
    }

    public void push(T input) {
        if (getSize() >= getCapacity()) {
            resize();
        }
        this.array[getSize()] = input;
        this.size++;
    }

    public T pop() {
        this.size--;
        return this.array[getSize()];
    }

    public T get(int i) {
        if (i < getSize()) {
            return this.array[i];
        }
        throw new NullPointerException("Index " + i + " out of array bounds " + getSize());
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    private void resize() {
        this.capacity *= 2;
        T[] newArray = (T[]) new Object[getCapacity()];
        for (int i = 0; i < getSize(); i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }
}