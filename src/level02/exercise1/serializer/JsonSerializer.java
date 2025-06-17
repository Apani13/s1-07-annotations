package level02.exercise1.serializer;

import java.lang.reflect.Field;

public class JsonSerializer implements Serializer {

    @Override
    public String serialize(Object obj) {
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder();
        json.append("{\n");

        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                Object value = fields[i].get(obj);
                json.append("  \"").append(fields[i].getName()).append("\": ");
                if (value instanceof  String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Serialization failed", e);
            }

            if (i != (fields.length - 1)) {
                json.append(",");
            }
            json.append("\n");
        }
        json.append("}");
        return json.toString();
    }
}
