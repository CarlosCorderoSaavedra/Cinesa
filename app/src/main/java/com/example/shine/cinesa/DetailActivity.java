package com.example.shine.cinesa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Shine on 14/12/2015.
 */

    public class DetailActivity extends AppCompatActivity {

        public static final String EXTRA_PARAM_ID = "com.herprogramacion.coches2015.extra.ID";
        public static final String VIEW_NAME_HEADER_IMAGE = "shared_image";
        private Films itemDetallado;
        private ImageView extendedImage;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.detail_activity);

            usarToolbar();

            // Obtener el coche con el identificador establecido en la actividad principal
            itemDetallado = Films.getItem(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));

            extendedImage = (ImageView) findViewById(R.id.extended_image);

            loadExtendedImage();
        }

        private void loadExtendedImage() {
            Glide.with(extendedImage.getContext())
                    .load(itemDetallado.getIdDrawable())
                    .into(extendedImage);
        }

        private void usarToolbar() {
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
        }
    }

