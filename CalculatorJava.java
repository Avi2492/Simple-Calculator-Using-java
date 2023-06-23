class Calculator{
    float n1;
    float n2;
    public float add(float n1, float n2){
        return n1 + n2;
    }
    public float sub(float n1, float n2){
        return n2 - n1;
    }
    public float mul(float n1, float n2){
        return n1*n2;
    }
    public float div(float n1, float n2){
        return n2/n1;
    }

    public void result() {
    System.out.println("addition is: " + add(n1, n2));
    System.out.println("subtraction is: " + sub(n1, n2));
    System.out.println("multiplication is: " + mul(n1, n2));
    System.out.println("division is: " + div(n1, n2));
    } 
}

class CalculatorJava{
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.n1 = 24f;
        c.n2 = 25f;
        c.result();
    }
}
