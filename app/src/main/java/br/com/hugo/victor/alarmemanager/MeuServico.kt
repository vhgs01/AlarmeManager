package br.com.hugo.victor.alarmemanager

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log

class MeuServico : Service() {
    lateinit var mp: MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        if (intent?.extras != null)
            Log.i("MEUSERVICO", intent?.getStringExtra("parametro1"))

        mp = MediaPlayer.create(this, R.raw.olha_a_cocada)
        mp.start()

        return START_REDELIVER_INTENT
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}