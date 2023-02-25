package concepts.has_a;

public class Main {

    public static void main(String[] args) {
        College c1 = new College("REC","Bhubaneswar, Odisha");
        Students s1 = new Students(1,"Sumit Rana",c1);

        s1.displayStudent();
    }


}
