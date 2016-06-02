package eu.europa.ema.res;


//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import javax.inject.Inject;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * Handles Serialization for Objects that Jersey's Moxy implementation cannot.
 *
 * For a Class to be serialized with this (@link {@link javax.ws.rs.ext.MessageBodyWriter}
 * just add it to WRITABLES array.
 *
 * @author SARMPANE
 */
//@Provider
//@Produces(MediaType.APPLICATION_JSON)
public class GenericBodyWriter {
//        extends MOXyJsonProvider {

//    private static final Class<?>[] WRITABLES = {
//            Collection.class
//    };
//
//    private final ObjectMapper objectMapper;
//
//    @Inject
//    public GenericBodyWriter(ObjectMapper objectMapper) {
//        this.objectMapper = objectMapper;
//    }
//
//    @Override
//    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
//        return Stream.of(WRITABLES).anyMatch(writable -> writable.isAssignableFrom(type));
//    }
//
//    @Override
//    public void writeTo(Object object, Class<?> type,
//                        Type genericType,
//                        Annotation[] annotations,
//                        MediaType mediaType,
//                        MultivaluedMap<String, Object> httpHeaders,
//                        OutputStream entityStream) throws IOException, WebApplicationException {
//        try {
//            objectMapper.writeValue(entityStream, object);
//        } catch (IOException e) {
//            throw new ProcessingException("Error deserializing a ListPage.",
//                    e);
//        }
//    }

}