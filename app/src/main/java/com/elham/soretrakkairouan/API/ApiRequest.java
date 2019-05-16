package com.elham.soretrakkairouan.API;

import com.elham.soretrakkairouan.Result;
import com.elham.soretrakkairouan.Soretrak;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {


    @GET("datastore_search?resource_id=fc3a0412-0301-4517-ac5d-ee1893bf2d39&limit=20")
    Call<Soretrak> getResult();

}
