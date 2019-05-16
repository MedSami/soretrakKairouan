package com.elham.soretrakkairouan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class InfoArret extends AppCompatActivity {
TextView txtNomArret,txtDepart,txtArriver;
String nomArret,Depart,Arriver;
ImageView localiser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_arret);
    txtArriver=findViewById(R.id.txtArriver);
    txtDepart=findViewById(R.id.txtdepart);
    txtNomArret=findViewById(R.id.txtNomArret);
    localiser=findViewById(R.id.localiser);
    Bundle data=getIntent().getExtras();
    if (data!= null){
        nomArret=data.getString("nomArret");
        Depart=data.getString("depart");
        Arriver=data.getString("arrival");

        txtNomArret.setText(nomArret);
        txtDepart.setText(Depart);
        txtArriver.setText(Arriver);

    }
    localiser.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (nomArret.equals("KAIROUAN-MSAKEN-SOUSSE")){
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=35.8142413,10.6281113" );
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
             }
            if (nomArret.equals("AMINIA-ESSAIED-ENNASR")){
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=35.671037, 10.086029" );
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
             }
            if (nomArret.equals("BAB JDID - CITE EL MANAR")){
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=35.697255, 10.104774" );
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
             }
            if (nomArret.equals("CITE MED ALI -MANSOURAH")){
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=35.652100, 10.085768" );
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
             }
            if (nomArret.equals("CITE MED ALI -MANSOURAH")){
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=35.652100, 10.085768" );
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
             }
            if (nomArret.equals("KAIROUAN-MSAKEN-SOUSSE-DOUBLAGE")){
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=35.8142413,10.6281113" );
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
             }
            if (nomArret.equals("STADE JAWOIDI  L'AFH BABJDID")){
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=35.679841, 10.087300" );
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
             }
        }
    });




    }
}
