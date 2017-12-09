package com.example.khent.recipe_list;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by khent on 12/8/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyHolder> {

    private Context context;
    private List<Items> items;

    public ItemAdapter(Context context, List<Items> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview,null);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.title.setText(items.get(position).getTitle());
        holder.desc.setText(items.get(position).getShortdesc());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title, desc;

        public MyHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = itemView.findViewById(R.id.textViewTitle);
            desc = itemView.findViewById(R.id.item_descrip);

        }


        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(),FullRecipeTextActivity.class);
            intent.putExtra("Send",title.getText().toString());
            view.getContext().startActivity(intent);
        }


    }
}
