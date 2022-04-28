class outer {
    void display() {
        System.out.println(" display the outer class");
    }

    class inner {
        void display() {
            System.out.println(" display the inner class");
        }
    }
}

public class outerinner {
    public static void main(String[] args) {
        outer o = new outer();
        o.display();
        outer.inner a = o.new inner();
        a.display();
        ;
    }
}