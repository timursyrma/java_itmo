package ru.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class RestClient {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://pokeapi.co/api/v2/move/1").build();

        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Student student = null;
//        Move move = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
//            move = objectMapper.readValue(new URL("https://pokeapi.co/api/v2/move/1"), Move.class);
            student = objectMapper.readValue(new File("student.json"), Student.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(move);
    }
}
