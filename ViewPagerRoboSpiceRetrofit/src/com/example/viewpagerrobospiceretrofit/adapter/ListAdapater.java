package com.example.viewpagerrobospiceretrofit.adapter;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.viewpagerrobospiceretrofit.R;
import com.example.viewpagerrobospiceretrofit.model.Category;
import com.squareup.picasso.Picasso;

public class ListAdapater extends BaseAdapter {
	private Context context;
	private List<Category> list;
	private LayoutInflater inflater;

	public ListAdapater(Context context, List<Category> c) {
		this.context = context;
		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.list = c;		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup container) {
		ViewHolder viewHolder;
		if(convertView == null){
			viewHolder = new ViewHolder();
			convertView = inflater.inflate(R.layout.category_row_layout, container, false);
			viewHolder.txt = (TextView)convertView.findViewById(R.id.item);
			viewHolder.txt.setText(list.get(position).getNom());
			viewHolder.imageView = (ImageView)convertView.findViewById(R.id.imageView1);
			Picasso.with(context).load(list.get(position).getImg()).into(viewHolder.imageView);
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder)convertView.getTag();
		}
		Picasso.with(context).load(list.get(position).getImg()).into(viewHolder.imageView);
		viewHolder.txt.setText(list.get(position).getNom());
		return convertView;
	}

	private static class ViewHolder{
		TextView txt;
		ImageView imageView;
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

}
