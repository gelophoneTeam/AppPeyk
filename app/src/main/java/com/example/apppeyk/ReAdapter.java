package com.example.apppeyk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ReAdapter extends BaseAdapter {
    int [] Box ;
    String [] Name;
    String [] Adress;
    String[] DateT;
    String[] Date;
    String [] CodeT;
    String[] Code;
    Context context;



    private static LayoutInflater inflater=null;
    public ReAdapter(Requ history, int[] box, String[] name, String[] adress, String[]dateT, String[]date, String[]codeT, String[]code) {

        Box=box;
        Name=name;
        Adress=adress;
        DateT=dateT;
        Date=date;
        CodeT=codeT;
        Code=code;
        context=history;



        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }



    @Override
    public int getCount() {
        return Name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    public class Holder
    {
        ImageView box;
        TextView name;
        TextView adress;
        TextView dateT;
        TextView date;
        TextView codeT;
        TextView code;


    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.listorder, null);
        holder.box =(ImageView) rowView.findViewById(R.id.box);

        holder.name =(TextView) rowView.findViewById(R.id.name);
        holder.adress =(TextView) rowView.findViewById(R.id.adress);
        holder.dateT =(TextView) rowView.findViewById(R.id.dateT);
        holder.date =(TextView) rowView.findViewById(R.id.date);
        holder.codeT =(TextView) rowView.findViewById(R.id.codeT);
        holder.code =(TextView) rowView.findViewById(R.id.code);


        holder.box.setImageResource(Box[position]);
        holder.name.setText(Name[position]);
        holder.adress.setText(Adress[position]);
        holder.dateT.setText(DateT[position]);
        holder.date.setText(Date[position]);
        holder.codeT.setText(CodeT[position]);
        holder.code.setText(Code[position]);



        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "انتخاب شد "+Name[position], Toast.LENGTH_SHORT).show();
            }
        });

        return rowView;
    }
}