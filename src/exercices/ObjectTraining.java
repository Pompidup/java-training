public class ObjectTraining {

    // TODO 1. Add the following private attributes :
    // - name (String)
    // - age (int)
    // - wilder (boolean)
    private String name;
    private int age;
    private boolean wilder;


    // TODO 2. Add a Constructor with name and age arguments (in this order)
    // This constructor must initialize name and age attributes
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    // TODO 3. Add getter method for name attribute
    public String getName(){
        return name;
    }

    // TODO 4. Add setter method for name attribute
    public void setName(String paramName) {
        this.name = paramName;
    }

    // TODO 5. Add getter method for age attribute
    public int getAge(){
        return age;
    }

    // TODO 6. Add setter method for age attribute
    public void setAge(int paramAge){
        this.age = paramAge;
    }

    // TODO 7. Add getter method for wilder attribute
    public boolean isWilder() {
        return wilder;
    }

    // TODO 8. Add setter method for wilder attribute
    public void setWilder(boolean paramWilder) {
        this.wilder = paramWilder;
    }

    // TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values
    public String whoAmI() {
        return "My name is "+ this.getName()+" and I'm "+ this.getAge();
    }

    // Do not remove this empty constructor !
    public ObjectTraining() {
    }
}