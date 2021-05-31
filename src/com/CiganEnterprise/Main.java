package com.CiganEnterprise;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

class OperaGustiEncryptor {

    List<Character> Keys = new ArrayList<>();
    List<Character> Values = new ArrayList<>();

    private void InitKeys() {

        Keys.add('o');
        Keys.add('p');
        Keys.add('e');
        Keys.add('r');
        Keys.add('a');
        Keys.add('g');
        Keys.add('u');
        Keys.add('s');
        Keys.add('t');
        Keys.add('i');
    }

    private void InitValues() {

        Values.add('0');
        Values.add('1');
        Values.add('2');
        Values.add('3');
        Values.add('4');
        Values.add('5');
        Values.add('6');
        Values.add('7');
        Values.add('8');
        Values.add('9');
    }

    public OperaGustiEncryptor() {
        InitKeys();
        InitValues();
    }

    public String EncryptString(String Message) {

        String Result = null;

        for (int it = 0; it < Keys.size(); it++) {
            Message = Message.replace(Keys.get(it), Values.get(it));
        }

        return Message;
    }
}

public class Main {

    public static void main(String[] args) {

        OperaGustiEncryptor encryptor = new OperaGustiEncryptor();
        String EncryptedMessage = encryptor.EncryptString("this is a message");
        System.out.println(EncryptedMessage);
    }
}
