package com.photoShow;

/**
 * Created with IntelliJ IDEA.
 * User: yanggz
 * Date: 13-10-14
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LazyAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader;

    public LazyAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(activity.getApplicationContext());
    }

    public int getCount() {
        return data.size();
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
       //TODO:补充数据
//        TextView title = (TextView)vi.findViewById(R.id.title); // 标题
        ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image); //图

        HashMap<String, String> song = new HashMap<String, String>();
        song = data.get(position);

        // 设置ListView的相关值

        imageLoader.displayImage(song.get(MyActivity.KEY_THUMB_URL), thumb_image);
        return vi;
         }
}
