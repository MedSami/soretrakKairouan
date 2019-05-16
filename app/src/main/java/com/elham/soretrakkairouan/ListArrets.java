package com.elham.soretrakkairouan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.elham.soretrakkairouan.API.ApiRequest;
import com.elham.soretrakkairouan.API.RetrofitServer;
import com.elham.soretrakkairouan.Adapter.ArretAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListArrets extends AppCompatActivity {
    private RecyclerView RecycleLayout;
    private RecyclerView.LayoutManager RecycleManager;
    private RecyclerView.Adapter arretAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_arret);

        RecycleLayout = findViewById(R.id.recyclerview);

        ApiRequest api = RetrofitServer.getClient().create(ApiRequest.class);
        Call<Soretrak> ListArrets=api.getResult();
ListArrets.enqueue(new Callback<Soretrak>() {
    @Override
    public void onResponse(Call<Soretrak> call, Response<Soretrak> response) {
        if (response.isSuccessful()) {
            if(!response.body().getResult().getRecords().isEmpty()) {
                List<Record> item = response.body().getResult().getRecords();

                RecycleManager = new LinearLayoutManager(com.elham.soretrakkairouan.ListArrets.this, LinearLayoutManager.VERTICAL, false);

                RecycleLayout.setLayoutManager(RecycleManager);

                arretAdapter = new ArretAdapter(item, com.elham.soretrakkairouan.ListArrets.this);

                RecycleLayout.setAdapter(arretAdapter);
            }
           // Log.i("TAG", "onResponse: "+response.body().getResult().getRecords().get(0).getDENOMLI());
        }
    }

    @Override
    public void onFailure(Call<Soretrak> call, Throwable t) {
        Toast.makeText(com.elham.soretrakkairouan.ListArrets.this, t.getMessage(), Toast.LENGTH_SHORT).show();
    }
});
    }
}
