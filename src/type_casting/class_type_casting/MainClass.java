package type_casting.class_type_casting;

public class MainClass {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        Parent childToParent = child;
        childToParent.print();

        // Not allowed in java as child has additional features on top of features inherited by parent
        // Child parentToChild = parent;
    }
}
