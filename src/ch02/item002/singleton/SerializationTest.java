package ch02.item002.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

    public byte[] serialize(Object instance) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (bos; ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bos.toByteArray();
    }

    public Object deserialize(byte[] serializeData) {
        ByteArrayInputStream bis = new ByteArrayInputStream(serializeData);
        try (bis; ObjectInputStream ois = new ObjectInputStream(bis)) {
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        SerializeSingleton001 instance = SerializeSingleton001.INSTANCE;
        SerializationTest serializationTest = new SerializationTest();
        byte[] serializeData = serializationTest.serialize(instance);
        SerializeSingleton001 result = (SerializeSingleton001) serializationTest.deserialize(serializeData);

        // readResolve 메소드 주석 전/후 테스트
        System.out.println("instance == result: " + (instance == result));
        System.out.println("instance.equals(result): " + instance.equals(result));
    }
}
