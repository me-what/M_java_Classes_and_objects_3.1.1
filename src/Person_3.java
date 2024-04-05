class Person_3{
    String name;
    int age;

    {
        name = "Undefined";
        age = 18;
    }
    Person_3(){
    }
    Person_3(String name){
        this.name = name;
    }
    Person_3(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}