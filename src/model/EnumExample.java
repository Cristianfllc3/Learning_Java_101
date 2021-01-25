package src.model;

public enum EnumExample {
    B ("Basic"), M("Middle"), E ("Expert");

    private String description;

    EnumExample(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  description;
    }
}
/*
That it, in the other class it is only need to create a instance of the enum
EnumExample.B
*/

/* It is the simple way
* public enum EnumExample {
    B, M, E;
*
* */