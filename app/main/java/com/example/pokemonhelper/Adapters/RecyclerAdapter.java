package com.example.pokemonhelper.Adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;
import com.example.pokemonhelper.R;
import com.example.pokemonhelper.databinding.RecyclercardBinding;
import com.example.pokemonhelper.models.Poke;
/*import com.example.pokemonhelper.models.PokemonViewHolder;*/

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<Poke> pokes = new ArrayList<>();

    public RecyclerAdapter(Context context, List<Poke> pokes) {
        this.context = context;
        this.pokes = pokes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder (@NonNull ViewGroup viewGroup, int i) {

        RecyclercardBinding itemLayoutBinding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()), R.layout.recyclercard,  viewGroup, false);

        MyViewHolder myViewHolder = new MyViewHolder(itemLayoutBinding);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        Poke poke = pokes.get(i);
        viewHolder.itemLayoutBinding.setPoke(poke);


    }

    @Override
    public int getItemCount() {
        return pokes.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        RecyclercardBinding itemLayoutBinding;

        public MyViewHolder(@NonNull RecyclercardBinding itemView) {
            super(itemView.getRoot());
            itemLayoutBinding = itemView;

        }

        @Override
        public void onClick(View v) {

        }
    }


    public interface OnClickListener{
        void onPokeClick(int position);

    }

}
    //region BROKEN CODE
    /*
    Context c;
    ArrayList<String> numbers;
    ArrayList<String> numberFull;
    private String text;
    public RecyclerAdapter(Context c, ArrayList<String> numbers) {
        this.c = c;
        this.numbers = numbers;
        this.numberFull = new ArrayList<>(numbers);

    }

    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView nameText;
        View t = LayoutInflater.from(c).inflate(R.layout.recyclercard, parent, false);
        View v = LayoutInflater.from(c).inflate(R.layout.recyclercard, parent, false);
        return new PokemonViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PokemonViewHolder holder, final int position) {
        holder.nameText.setText(numbers.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c, numbers.get(position), Toast.LENGTH_SHORT).show();
                String UchosenID = numbers.get(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    public  String getText(String text){
        text = String.valueOf(numbers);
        return text;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<String> filteredList = new ArrayList<>();
            if (constraint == null || constraint.length()==0){
                filteredList.addAll(numberFull);

            } else{
                String filterpattern = constraint.toString().toLowerCase().trim();
                for (String item : numberFull){
                    if (getText(item).toLowerCase().contains(filterpattern)){
                        filteredList.add(item);
                    }
                }

            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return  results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
        numbers.clear();
        numbers.addAll((List) results.values);
        notifyDataSetChanged();
        }
    };
}
*/
//endregion