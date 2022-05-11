import org.junit.jupiter.api.Test;

public class First {
    @Test
    public void first() {
        int a = 3;
        int b = 16;
        int c = sum(a, b);
        System.out.println(c);


        c = sum(22,15);
        System.out.println(sum(22,15));
    }


    private int sum(int a, int b) {
        System.out.println("First digit is: " + a + " and second is: " + b + "!");
        //                 "First digit is: 3 and second is :16"

        int c = a + b;
        return c;
    }
@Test
    public void usingObjects() {
       Student mihail = new Student();
       mihail.setFirstName("Mihail");
       mihail.setLastName("The greatest");
       mihail.setAge(18);
       mihail.setPersonalCode("123456-11111");

       System.out.println(mihail.getFirstName() + "" + mihail.getLastName());


}
}