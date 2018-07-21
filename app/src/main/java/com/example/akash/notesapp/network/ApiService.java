package com.example.akash.notesapp.network;

import com.example.akash.notesapp.model.Note;
import com.example.akash.notesapp.model.User;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {

    @FormUrlEncoded
    @POST("/notes/user/register")
    Single<User> register(@Field("device_id") String device_id);

    @FormUrlEncoded
    @POST("notes/new")
    Single<Note> createNote(@Field("note") String note);

    @GET("/notes/all")
    Single<List<Note>> fetchAllNotes();

    @FormUrlEncoded
    @PUT("/notes/{id}")
    Completable updateNote(@Path("id") int id, @Field("note") String note);

    @DELETE("/notes/{id}")
    Completable deleteNote(@Path("id") int id);
}
