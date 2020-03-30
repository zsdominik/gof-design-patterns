package com.zsdominik.creational.singleton;

import com.zsdominik.util.PatternCaller;
import com.zsdominik.util.SysOutUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonPatternCaller implements PatternCaller {

    public static final String FILE = "serialized.ser";

    @Override
    public void callExample() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();

        try {
            ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(FILE));
            objectOutput.writeObject(serializableSingleton);
            System.out.println("serializableSingleton written");
            objectOutput.close();

            serializableSingleton.setValue(1);
            System.out.println("serializableSingleton value set");

            ObjectInput objectInput = new ObjectInputStream(new FileInputStream(FILE));
            SerializableSingleton deserializedSingleton = (SerializableSingleton) objectInput.readObject();
            System.out.println("deserializedSingleton read");
            objectInput.close();

            System.out.println(serializableSingleton.getValue());
            System.out.println(deserializedSingleton.getValue());

            SysOutUtils.printSeparator();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
