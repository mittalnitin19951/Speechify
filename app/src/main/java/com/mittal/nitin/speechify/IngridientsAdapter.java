package com.mittal.nitin.speechify;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by HP on 24-03-2016.
 */
public class IngridientsAdapter extends RecyclerView.Adapter<FeedListRowHolder> {


        private List<FeedItem> feedItemList;

        private Context mContext;

        public IngridientsAdapter(Context context, List<FeedItem> feedItemList) {
            this.feedItemList = feedItemList;
            this.mContext = context;
        }

        @Override
        public FeedListRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate
                    (R.layout.list_row, null);
            FeedListRowHolder mh = new FeedListRowHolder(v);

            return mh;
        }

        @Override
        public void onBindViewHolder(FeedListRowHolder feedListRowHolder, int i) {
            FeedItem feedItem = feedItemList.get(i);



            feedListRowHolder.recipe.setText(Html.fromHtml(feedItem.getIngredient()));
        }

        @Override
        public int getItemCount() {
            return (null != feedItemList ? feedItemList.size() : 0);
        }
    }

