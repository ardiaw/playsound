package com.example.admingirl.mengenalisuarahewan;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageadapter extends BaseAdapter {

    private Context mContext;

    // constructor
    public imageadapter(Context c) {
        mContext = c;
    }

    public static Integer[] mThumbsId = { R.drawable.angsa, R.drawable.anjing,
            R.drawable.ayam, R.drawable.babi, R.drawable.burung_hantu,
            R.drawable.cempe, R.drawable.elang, R.drawable.sapi, R.drawable.simpanse,
            R.drawable.ular
    };

    public static String[] thumbString = { "Angsa",
            "Anjing", "Ayam", "Babi", "Burung Hantu", "Kambing", "Elang",
            "Sapi", "Simpanse", "Ular"};

    @Override
    public int getCount() {
// TODO Auto-generated method stub
        return mThumbsId.length;
    }

    @Override
    public Object getItem(int position) {
// TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
// TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup group) {
// TODO Auto-generated method stub
        ImageView imageView;
        if (view == null) {
            imageView = new ImageView(mContext);
            int h = mContext.getResources().getDisplayMetrics().densityDpi;
            imageView
                    .setLayoutParams(new GridView.LayoutParams(h - 45, h - 45));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(1, 1, 1, 1);
        } else {
            imageView = (ImageView) view;

        }
        imageView.setImageResource(mThumbsId[position]);
        return imageView;
    }

}
