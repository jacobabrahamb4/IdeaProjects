public class OuterClass {
    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    class InnerClass {
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

     static class StaticNestedClass{
        void accessMembers(OuterClass outerClass) {
            System.out.println(staticOuterField);
            System.out.println(outerClass.outerField);
        }

    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.accessMembers(outerClass);


        System.out.println("Hello world!");
    }
}