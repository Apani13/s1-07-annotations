package level02.exercise1.core;

public class ExportValidator {
    public void validate(Object obj) {
        if (!obj.getClass().isAnnotationPresent(
                level02.exercise1.annotation.Exportable.class)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getSimpleName() + " is not annotated with @Exportable");
        }
    }
}
