class Person_2 {
    String name;
    int age;
    Person_2()
    {
        this("Undefined", 18);
    }
    Person_2(String name)
    {
        this(name, 18);
    }
    Person_2(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

