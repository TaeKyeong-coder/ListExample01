package com.example.listexample01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        //배열 안에 string형태로 data를 저장하겠다.
        List<String> data = new ArrayList<>();

        //adapter는 중간다리 역할
        //android에서 제공하는 기본 디자인을 가져다 쓸 거라서 R.layout.simple
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        //list에 adapter셋팅
        list.setAdapter(adapter);

        data.add("태고밍");
        data.add("안드로이드");
        data.add("연습");

        //상태를 현재 저장하겠다
        adapter.notifyDataSetChanged();
    }
}