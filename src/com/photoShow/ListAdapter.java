package com.photoShow;

/**
 * Created with IntelliJ IDEA.
 * User: yanggz
 * Date: 13-10-14
 * Time: 下午1:24
 * 首页展现list的adapter
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList listData;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader; //图片加载类

    public ListAdapter(Activity a, ArrayList d) {
        activity = a;
        listData=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(activity.getApplicationContext());
    }

    public int getCount() {
        return listData.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_raw, null);

//        TextView title = (TextView)vi.findViewById(R.id.title); // 标题

        ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image); // 缩略图
//
//        HashMap<String, String> song = new HashMap<String, String>();
//        song = listData.get(position);
//
//        // 设置ListView的相关值
//        title.setText(song.get(MyActivity.KEY_TITLE));

        imageLoader.displayImage(listData.get(position).toString(), thumb_image);
        return vi;
         }
}
