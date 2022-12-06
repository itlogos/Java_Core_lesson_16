package ua.lviv.lgs16;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
    IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        
        Class bab = Baby.class;
        String nameOfClass = bab.getName();
        System.out.println("Name of class = " + nameOfClass);
        
        String simpleName = bab.getSimpleName();
        System.out.println("Simple name  =  " + simpleName);
        
        Package classPackage = bab.getPackage();
        System.out.println("Package of current class = " + classPackage);
        
        Field[] fields = bab.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println("Fields :" + field);
        }
        
        
        Method [] methods = bab.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            System.out.println("Methods :" + method);
        }
        
        Constructor<Baby>[] babyConstructor = bab.getConstructors();

        for (int i = 0; i < babyConstructor.length; i++) {
            Constructor<Baby> constructor = babyConstructor[i];
            System.out.println("Constructor = " + constructor);
        }

        System.out.println("Constructors size = " + babyConstructor.length);
 
    
    Constructor<Baby> singleConstructor = bab.getConstructor();
    System.out.println("single consctror = " + singleConstructor);
    Baby newInstanceBaby = singleConstructor.newInstance();
    System.out.println("reflection Person = " + newInstanceBaby);

    
    fields = bab.getDeclaredFields();
    for (int i = 0; i < fields.length; i++) {   
        Field field = fields[i];
        System.out.println(field);
    } 
    
 
    Field privateNameField = fields[0];
    privateNameField.setAccessible(true);
    Field privateAgeField = fields[0];
    privateAgeField.setAccessible(true);
    //Methods
    Method [] methods1 = bab.getMethods();
    for (int i = 0; i < methods1.length; i++) {
        Method method = methods1[i];
        System.out.println(i);
        System.out.println(method);
    }
    methods1[4].invoke(newInstanceBaby, "Ira");
    methods1[6].invoke(newInstanceBaby, 3);
    System.out.println(newInstanceBaby);
  
}
 
}
