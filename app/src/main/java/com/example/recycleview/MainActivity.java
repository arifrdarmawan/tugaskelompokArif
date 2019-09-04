package com.example.recycleview;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Email> EmailList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        setData();
    }

    private void setData() {
        EmailList.add(new Email(R.drawable.spiderman, "Spiderman","Melihat Laba - Laba","Mau melihat koleksi laba-laba ku?"));
        EmailList.add(new Email(R.drawable.joker,"Joker","Berbuat Jahat","Ayo arif kita maling ayam!"));
        EmailList.add(new Email(R.drawable.ironman,"Iron Man","Menjatuhkan lawan","Hi Arif, Kemarilah ke tempat ku segera!"));
        EmailList.add(new Email(R.drawable.doctorstrange,"Doctor Strange", "Melihat Masa Depan","Hey Arif, Saatnya melihat masa depan!"));
        EmailList.add(new Email(R.drawable.captainamerica,"Captain America","Pembelian tameng","Hi Arif bisakah anda mengantarkan saya?"));
        EmailList.add(new Email(R.drawable.batman,"Batman","Pergi Mencari Penjahat","Ayo Arif kita lakukan kebaikan!"));


        mAdapter = new RecyclerViewAdapter(EmailList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }
}