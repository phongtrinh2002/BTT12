package com.phongth163965.btt12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StudentBaseAdapter extends BaseAdapter {

    private Context context;

    private List<Student> list;

    public StudentBaseAdapter(Context context, List<Student> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        StudentViewHolder holder;
        if(convertView == null){
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.student_itemview, parent, false);
            holder = new StudentViewHolder();
            holder.img_hinh = convertView.findViewById(R.id.student_itemview_hinh);
            holder.tvten = convertView.findViewById(R.id.student_itemview_ten);
            holder.tvtuoi = convertView.findViewById(R.id.student_itemview_tuoi);
        }else {
            holder = (StudentViewHolder)  convertView.getTag();
        }
        Student student = list.get(position);
        holder.img_hinh.setImageResource(student.getHinh());
        holder.tvten.setText(student.getTen());
        holder.tvtuoi.setText(student.getTuoi());
        return convertView;
    }

    static class StudentViewHolder{
        ImageView img_hinh;
        TextView tvten, tvtuoi;
    }
}
