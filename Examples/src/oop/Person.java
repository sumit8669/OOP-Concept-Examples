class Person {
    private String name;
    private int age;

    public void SetValue(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void GetValue(){
        System.out.println("The name of the person is "+ name + " and the age is "+ age + ".");

    }
}

