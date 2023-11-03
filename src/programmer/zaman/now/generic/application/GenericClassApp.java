package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Hanif");
        MyData<Integer> integerMyDataMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyDataMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
