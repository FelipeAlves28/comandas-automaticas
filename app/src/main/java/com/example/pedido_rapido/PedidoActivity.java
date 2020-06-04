package com.example.pedido_rapido;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class PedidoActivity extends AppCompatActivity {
    private Button btPedido;
    private final String channel_teste_1 = "Channel_1";
    private int notificacao = 001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        createNotification();
        NotificationBuild();

        btPedido = (Button) findViewById(R.id.btPedido);
        btPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir = new Intent(getApplicationContext(), CardapioActivity.class);
                startActivity(ir);
            }
        });
    }
    public void createNotification(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel1 = new NotificationChannel(channel_teste_1,
                    "Channel 1", NotificationManager.IMPORTANCE_HIGH);
            channel1.setDescription("This is channel 1");

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);

        }
    }


    public void NotificationBuild(){
        NotificationCompat.Builder Construtor = new NotificationCompat.Builder(getApplicationContext(),channel_teste_1);
        Construtor.setSmallIcon(R.drawable.ic_mensagem);
        Construtor.setContentTitle("Imperdivel Venha para o Pedido Rapido");
        Construtor.setContentText("Compre e ganhe 20% de desconto");
        Construtor.setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationCompat = NotificationManagerCompat.from(getApplicationContext());
        notificationCompat.notify(notificacao,Construtor.build());
    }

//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.main_menu, menu);
//        return true;
//    }
}
