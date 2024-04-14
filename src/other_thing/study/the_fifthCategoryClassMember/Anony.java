package other_thing.study.the_fifthCategoryClassMember;

public class Anony {
    public static void main(String[] args) {
        IA ia = new IA() {
            @Override
            public void cry() {
                System.out.println("1");
            }
        };
        ia.cry();
    }
}

interface IA {
    public void cry();
}


