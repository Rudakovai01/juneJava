package HW_3;

public class GenericBox <T>{
    private T object;

    public GenericBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
    public String getClassName(){
        return object.getClass().getName();
    }
}
