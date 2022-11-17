package com.example.myapplication;

import android.telecom.Call;

import com.squareup.okhttp.RequestBody;

import java.util.List;

import android.retrofit.Call;
import android.retrofit.http.Body;
import android.retrofit.http.Field;
import android.retrofit.http.FormUrlEncoded;
import android.retrofit.http.GET;
import android.retrofit.http.Header;
import android.retrofit.http.Multipart;
import android.retrofit.http.POST;
import android.retrofit.http.Part;
import android.retrofit.http.Path;

public interface CarAPI {
    @GET("package/ctrl/{ctrlCar}")
    Call<Car> getLuxuryCar(@Path("ctrlCar") String ctrl);


    @FormUrlEncoded
    @POST("package/ctrl/CtrlCar.php")
    Call<Car> getOneCar( @Field("method") String method);


    @FormUrlEncoded
    @POST("package/ctrl/CtrlCar.php")
    Call<List<Car>> getManyCars( @Field("method") String method);


    @POST("package/ctrl/CtrlCar.php")
    Call<Car> saveCar( @Body WrapRequest wrapRequest);


    @Multipart
    @POST("package/ctrl/CtrlCar.php")
    Call<Car> sendImg( @Part("method") String method, @Part("name_image") String imageName, @Part("binary_image") RequestBody requestBody);

    @FormUrlEncoded
    @POST("package/ctrl/CtrlCar.php")
    Call<Car> sendHeader( @Header("mega-test") String megaTest, @Field("method") String method);

    @FormUrlEncoded
    @POST("package/ctrl/CtrlCar.php")
    Call<Car> saveCars( @Field("method") String method, @Field("cars") String carsJson);
}
