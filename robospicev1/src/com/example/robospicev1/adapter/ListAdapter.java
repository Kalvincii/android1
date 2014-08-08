package com.example.robospicev1.adapter;

import java.util.List;

import com.example.robospicev1.R;
import com.example.robospicev1.model.Employee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<Employee>{
	List<Employee> employees; 
	LayoutInflater inflater;

	public ListAdapter(Context context, int resource, List<Employee> employees) {
		super(context, resource, employees);
		this.employees = employees;
		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return employees.size();
	}

	@Override
	public Employee getItem(int position) {
		return employees.get(position);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		if(convertView == null){
			viewHolder = new ViewHolder();
			convertView = inflater.inflate(R.layout.row_layout, parent, false);
			viewHolder.nom = (TextView)convertView.findViewById(R.id.nom);
			viewHolder.nom.setText(employees.get(position).getNom());
			viewHolder.prenom = (TextView)convertView.findViewById(R.id.prenom);
			viewHolder.prenom.setText(employees.get(position).getPrenom());
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder)convertView.getTag();
		}
		viewHolder.nom = (TextView)convertView.findViewById(R.id.nom);
		viewHolder.prenom = (TextView)convertView.findViewById(R.id.prenom);
		viewHolder.prenom = (TextView)convertView.findViewById(R.id.prenom);
		viewHolder.prenom.setText(employees.get(position).getPrenom());
		return convertView;
	}


	private static class ViewHolder{
		TextView nom;
		TextView prenom;
	}



}
