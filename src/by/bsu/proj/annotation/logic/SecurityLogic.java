package by.bsu.proj.annotation.logic;

import by.bsu.proj.annotation.SecurityLevelEnum;

import java.lang.reflect.Method;

public class SecurityLogic {
    public void onInvoke(SecurityLevelEnum level, Method method, Object[] args) {
        StringBuilder argsString = new StringBuilder();
        for (Object arg : args) {
            argsString.append(arg.toString()+ " :");
        }
        argsString.setLength(argsString.length()-1);
        System.out.println(String.format("Method %s was invoked with parameters" +
                " : %s", method.getName(), argsString.toString()));
        switch (level) {
            case LOW -> System.out.println("Низкий уровень проверки безопасности" +
                    ": " + level);
            case NORMAL -> System.out.println("Обычный уровень проверки безопасности" +
                    ": " + level);
            case HIGH -> System.out.println("Обычный уровень проверки безопасности" +
                    ": " + level);
        }
    }
}
