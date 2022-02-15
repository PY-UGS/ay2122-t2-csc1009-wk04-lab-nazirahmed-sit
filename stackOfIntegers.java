public class stackOfIntegers {

    int[] elements;
    int size;
    int count = 0;

    public stackOfIntegers() {
        this.elements = new int[20];
        this.size = 0; 
    }

    public stackOfIntegers(int i){
        this.elements = new int[i];
        this.size = elements.length;
    }

    public boolean empty() {
        return (count <= 0);
    }

    public int peek() {
        int number;
        number = elements[count-1];
        return number;
    }

    public void push(int number) {
        this.elements[count] = number;
        count++;
    }

    public int pop() {
        int number = 0;

        if (empty()) {
            System.exit(0);
        }

        else {
            count--;
            number = this.elements[count];
            this.elements[count] = 0;
        }

        return number;
    }

    public int getSize() {
        return size; // pass
    }

}
