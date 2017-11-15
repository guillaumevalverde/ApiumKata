package com.gve.testapplication.apium.albumlist.presentation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gve.testapplication.R;
import com.gve.testapplication.apium.albumdetail.presentation.ListSongActivity;
import com.gve.testapplication.apium.albumlist.data.Album;
import com.gve.testapplication.apium.albumlist.data.ConstItunes;
import com.gve.testapplication.core.PicassoUtils;
import com.gve.testapplication.core.injection.qualifiers.ForActivity;
import com.gve.testapplication.core.recyclerview.DisplayableItem;
import com.gve.testapplication.core.recyclerview.ViewHolderBinder;
import com.gve.testapplication.core.recyclerview.ViewHolderFactory;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import javax.inject.Inject;

import jp.wasabeef.picasso.transformations.RoundedCornersTransformation;

import static com.gve.testapplication.apium.albumlist.presentation.ListAlbumActivity.TAG;
import static com.gve.testapplication.core.PicassoUtils.TRANSFORMATION;

public class AlbumViewHolder extends RecyclerView.ViewHolder {

    private TextView albumNameTV;
    private TextView artistNameTV;
    private TextView trackCountTV;
    private ImageView imageIV;
    private Picasso picasso;
    private View card;


    // We also create a constructor that accepts the entire item row
    // and does the view lookups to find each subview
    public AlbumViewHolder(final View itemView, Picasso picasso) {
        // Stores the itemView in a public final member variable that can be used
        // to access the context from any ViewHolder instance.
        super(itemView);
        card = itemView;
        albumNameTV = itemView.findViewById(R.id.album_card_title);
        artistNameTV = itemView.findViewById(R.id.album_card_artist_name);
        trackCountTV = itemView.findViewById(R.id.album_card_count_track);
        imageIV = itemView.findViewById(R.id.album_card_image);
        this.picasso = picasso;
    }

    private void bind(@NonNull final Album album) {
        albumNameTV.setText(album.name());
        artistNameTV.setText(album.artistName());
        trackCountTV.setText("" + album.trackCount());
        PicassoUtils.showImageWithPicasso(picasso, imageIV, album.thumbnail());

        card.setOnClickListener(click -> startNextActivity(album));
    }

    private void startNextActivity(Album album) {
        Intent intent = new Intent(card.getContext(), ListSongActivity.class);
        intent.putExtra(ConstItunes.ALBUM_TYPE, album);
        card.getContext().startActivity(intent);
    }

    static class AlbumCardHolderFactory extends ViewHolderFactory {

        private Picasso picasso;

        @Inject
        AlbumCardHolderFactory(@NonNull @ForActivity final Context context, Picasso picasso) {
            super(context);
            this.picasso = picasso;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder createViewHolder(@NonNull final ViewGroup parent) {
            return new AlbumViewHolder(LayoutInflater.from(context)
                    .inflate(R.layout.album_recycler_row, parent, false), picasso);
        }
    }

    static class AlbumCardHolderBinder implements ViewHolderBinder {

        @Inject
        AlbumCardHolderBinder() { }

        @Override
        public void bind(@NonNull final RecyclerView.ViewHolder viewHolder,
                         @NonNull final DisplayableItem item) {
            AlbumViewHolder castedViewHolder = AlbumViewHolder.class.cast(viewHolder);
            Album viewEntity = Album.class.cast(item.model());
            castedViewHolder.bind(viewEntity);
        }
    }
}
