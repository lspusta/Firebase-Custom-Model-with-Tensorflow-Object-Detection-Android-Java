package itkido.me.mlkitfirebaseobjectdetection;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class DisplayTextResultsRecyclerViewAdapter extends RecyclerView.Adapter<DisplayTextResultsRecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "DisplayTextResultsRecyclerViewAdapter";

    private ArrayList<String> mTextResponse = new ArrayList<>();
    private Context mContext;



    public DisplayTextResultsRecyclerViewAdapter(Context context, ArrayList<String> textResponse) {
        mTextResponse = textResponse;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_display_text, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");


        holder.txtContentText.setText(mTextResponse.get(position));


    }


    @Override
    public int getItemCount() {
        return mTextResponse.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView txtContentText;
        RelativeLayout parentLayout;



        public ViewHolder(View itemView) {
            super(itemView);

            txtContentText = itemView.findViewById(R.id.txtContentText);

            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
