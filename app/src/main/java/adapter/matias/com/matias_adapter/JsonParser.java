package adapter.matias.com.matias_adapter;

import android.util.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class JsonParser {


    public List<Producto> leerFlujoJson(InputStream in) throws IOException {
        // Nueva instancia JsonReader
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        try {
            // Leer Array
            return leerArrayAnimales(reader);
        } finally {
            reader.close();
        }

    }



    public List<Producto> leerArrayAnimales(JsonReader reader) throws IOException {
        // Lista temporal
        ArrayList<Producto> animales = new ArrayList<>();

        reader.beginArray();
        while (reader.hasNext()) {
            // Leer objeto
            animales.add(leerAnimal(reader));
        }
        reader.endArray();
        return animales;
    }

    public Producto leerAnimal(JsonReader reader) throws IOException {
        // Variables locales
        String nroPool = null;
        String descripcion = null;
        String pathImagenBannerMiniatura = null;

        // Iniciar objeto
        reader.beginObject();

        /*
        Lectura de cada atributo
         */
        while (reader.hasNext()) {
            String name = reader.nextName();
            switch (name) {
                case "nroPool":
                    pathImagenBannerMiniatura = reader.nextString();

                    break;
                case "descripcion":
                    descripcion = reader.nextString();
                    break;
                case "pathImagenBannerMiniatura":
                    pathImagenBannerMiniatura = reader.nextString();
                    break;
                default:
                    reader.skipValue();
                    break;
            }
        }
        reader.endObject();
        return new Producto(nroPool, descripcion, pathImagenBannerMiniatura);
    }

}

