package level02.exercise1.core;

import level02.exercise1.serializer.Serializer;
import level02.exercise1.writer.Writer;

public class JsonExporter {
        private final Serializer serializer;
        private final Writer writer;
        private final ExportValidator validator;

        public JsonExporter(Serializer serializer, Writer writer, ExportValidator validator) {
            this.serializer = serializer;
            this.writer = writer;
            this.validator = validator;
        }

        public void export(Object obj, String path) {
            validator.validate(obj);
            String json = serializer.serialize(obj);
            writer.writeToFile(json, path);
            System.out.println("Object exported to JSON: " + path);
        }

}
