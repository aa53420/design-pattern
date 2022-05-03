package singleton.reflection;

import singleton.classic.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTestDrive {
    public static void main(String args[]) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());

        Constructor[] constructors = Singleton.class.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            System.out.println(constructor.newInstance().toString());
            break;
        }

    }
}
