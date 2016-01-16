public class TesCast {

    public static void main(String []args){

        CasTing a = new CasTing();
        CasTing b = new CasTingB();
        CasTingB c = new CasTingB();
 
       ((CasTingB)b).casTingB(); // casting method vanuit class CasTingB met ref naar CasTingA of  ??
        a.casTingA(); // geen casting, gewoon method 
        b.casTingA(); // geen casting
        c.casTingBTwee(); // geen casting, gewoon method
       ((CasTingB)b).casTingB();
        c.casTingA();
        c.casTingB();
       // b.casTingB(); kan niet want b. reft naar CasTing en niet naar CasTingB. casting toepassen!
        b.casTingA();
}
}
