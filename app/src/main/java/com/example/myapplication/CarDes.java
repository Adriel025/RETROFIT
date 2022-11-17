package com.example.myapplication;

import java.lang.reflect.Type;

public class CarDes implements JsonDeserializer<Object> {
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement car = json.getAsJsonObject();

        if( json.getAsJsonObject().get("car") != null ){
            car = json.getAsJsonObject().get("car");
        }

        return ( new Gson().fromJson( car, Car.class ));
    }
}

