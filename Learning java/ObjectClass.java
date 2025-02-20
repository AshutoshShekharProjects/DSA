public class ObjectClass {
    ObjectClass(Object object){
        System.out.println("Object:"+object);
    }/*
    ObjectClass(ObjectClass obj){
        System.out.println("Class:"+obj);
    }*/
    ObjectClass(int num){
        System.out.println("Num:"+num);
    }
    ObjectClass(String name){
        System.out.println("String:"+name);
    }
    public static void main(String[] args){
        ObjectClass o=new ObjectClass(null);
        ObjectClass o2=new ObjectClass("Hello");
        ObjectClass o3=new ObjectClass(new Object());
    }
}
