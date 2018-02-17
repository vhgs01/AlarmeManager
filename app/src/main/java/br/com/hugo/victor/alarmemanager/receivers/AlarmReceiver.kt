package br.com.hugo.victor.alarmemanager.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast
import br.com.hugo.victor.alarmemanager.MeuServico
import br.com.hugo.victor.alarmemanager.R

class AlarmReceiver : BroadcastReceiver() {

    private var mp: MediaPlayer? = null

    override fun onReceive(context: Context?, intent: Intent?) {
        var i = Intent(context, MeuServico::class.java)
        i.putExtra("parametro1", "oi")

        context?.startService(i)
    }
}