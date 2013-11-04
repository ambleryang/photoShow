package com.photoShow;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MyActivity extends Activity {
    // 所有的静态变量
    //static final String URL = "http://api.androidhive.info/music/music.xml";//xml目的地址,打开地址看一下

    static final String KEY_THUMB_URL = "thumb_url";


    ArrayList  piclist = new ArrayList(Arrays.asList("http://att2.citysbs.com/hangzhou/2013/10/09/18/middle_800x1200-184903_19921381315743405_55a81846f7efc79d8507275f55d165d3.jpg",
                                                            "http://att2.citysbs.com/hangzhou/2013/10/09/18/middle_800x1199-185111_15341381315871926_653a82cb4f9e4a272ba5fde7a3ffe40a.jpg",
                                                            "http://att2.citysbs.com/hangzhou/2013/10/09/18/middle_800x1200-185320_19131381316000010_5c2222c10920a106ef26eb8f5af43675.jpg"));

    ListView list;
    ListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//
        list=(ListView)findViewById(R.id.list);
//
//
        adapter=new ListAdapter(this, piclist);
        list.setAdapter(adapter);
//
//
//        //为单一列表行添加单击事件
//
//        list.setOnItemClickListener(new OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//
//                //TODO:
//            }
//        });
    }

}