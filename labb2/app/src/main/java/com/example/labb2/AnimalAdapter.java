package com.example.labb2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AnimalAdapter extends BaseAdapter {

    private List<Animal> animals;
    private LayoutInflater layoutInflater;

    public AnimalAdapter(Activity activity, List<Animal> animals) {
        this.animals = animals;
        layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int i) {
        return animals.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View rowView;
        rowView = layoutInflater.inflate(R.layout.listview_row, null);
        TextView textView = (TextView)rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.pic);
        Animal animal = animals.get(i);
        textView.setText(animal.getType());
        imageView.setImageResource(animal.getPicId());
        return rowView;
    }
}