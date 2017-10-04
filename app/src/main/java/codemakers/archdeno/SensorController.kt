package codemakers.archdeno

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

/**
 * Created by darfe on 3/10/2017.
 */
class SensorController(lifecycle: Lifecycle) : LifecycleObserver {

    init {
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun inicioMonitoreo() {
        Log.i("sensor", "Inicio de monitoreo")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun finMonitoreo() {
        Log.i("sensor", "Fin de monitoreo")
    }
}