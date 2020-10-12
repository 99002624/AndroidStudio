package com.lnt.recycleview;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lnt.recycleview.R;

import java.util.ArrayList;
public class NewAdaptor1 extends RecyclerView.Adapter<NewAdaptor1.MyViewHolder> { //step 5

    ArrayList<String> personNames;
    ArrayList<String> personId;
    ArrayList<Integer> personImage;
    Context context;    //gives reference to this class (context means reference to class or activity or application)

    public NewAdaptor1(Context context, ArrayList<String> personNames,ArrayList<String> personId,ArrayList<Integer> personImage)
    {
        this.context = context;
        this.personNames = personNames;
        this.personId=personId;
        this.personImage=personImage;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {   //actually creating the viewHolder
        //inflate the item layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent, false); //set view size, margins, padding, layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {      //where exactly the record is printed in recycler view
        holder.name.setText(personNames.get(position));
        holder.id.setText(personId.get(position));
        holder.image.setImageResource(personImage.get(position));
       // holder.image.;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, personNames.get(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(context, personId.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return personNames.size();
    }



    //this inner class hold that view which we have created in row layout xml file
    public class MyViewHolder extends RecyclerView.ViewHolder {     //step 4
        TextView name,id;
        ImageView image;
        public MyViewHolder(View itemView){
            super (itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            id=(TextView) itemView.findViewById(R.id.id);//getting reference of item view
            image=(ImageView) itemView.findViewById(R.id.imageView);
        }

    }
}
