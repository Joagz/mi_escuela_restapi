package dev.joago.mi_alumno_api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.experimental.UtilityClass;
import org.bson.BsonDocument;
import org.bson.json.JsonObject;

@UtilityClass
public class JsonClassMapper {

    public static Object createObjectFromProperties(Object obj, String... params) throws JsonProcessingException {

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(obj);

        JsonObject main = new JsonObject(json);
        BsonDocument res = new BsonDocument();

        for (String p : params) {
            if (!main.toBsonDocument().get(p).isNull()) {
                res.append(p, main.toBsonDocument().get(p));
            }
        }

        return res.toJson();

    }

}
