package br.com.shell.springshell.helper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JsonHelper {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static String toJson(Object obj) {
        try {
            return gson.toJson(obj);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
