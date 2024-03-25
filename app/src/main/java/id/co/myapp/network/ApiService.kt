package id.co.myapp.network

import android.telecom.Call
import id.co.myapp.model.ResponseUser
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.PartMap
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("api/users")
    fun getListUsers(@Query("page") page : String): Call<ResponseUser>

    @GET("api/users/{id}")
    fun getUser(@Path("id") id : String): Call<ResponseUser>

    @FormUrlEncoded
    @POST("api/users")
    fun createUser(
            @Part("file") file : MultipartBody.Part,
            @PartMap data: Map<String, RequestBody>
    ) : Call<ResponseUser>
}