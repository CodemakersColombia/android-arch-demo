package codemakers.archdeno

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by darfe on 3/10/2017.
 */

class MainViewModel: ViewModel(){

    var info: MutableLiveData<String> = MutableLiveData()

    fun changeInfo(text: String){
        info.value = text
    }
}